package com.twitter.test;

import com.twitter.appmanager.CommonElements;
import com.twitter.appmanager.LoginPage;
import com.twitter.appmanager.WallPage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class LoginTwitter extends TestBase{


    @Test
    public void successfulLogin() {
        LoginPage loginPage = new LoginPage();
        loginPage.openPage();
        loginPage.inputLogin().setValue("1AutoTesting1");
        loginPage.passInput().setValue("123581321");
        loginPage.checkboxRememberMe().click();
        loginPage.buttonLogIn().click();
        WallPage page = new WallPage();
        page.userName().shouldHave(text("GameTesting"));
    }


    @Test (enabled = false)
    public void errorLogin() {
        LoginPage loginPage = new LoginPage();
        CommonElements commonElements = new CommonElements();
        loginPage.openPage();
        commonElements.message().shouldNotBe(visible);
        loginPage.buttonLogIn().click();
        commonElements.message().shouldBe(visible).shouldHave(text("Введённые имя пользователя и пароль не совпадают с сохранёнными в нашей базе данных. Проверьте правильность введённых данных и повторите попытку."));

    }

}
