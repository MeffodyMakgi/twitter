package com.twitter.test;

import com.twitter.appmanager.LoginPage;
import com.twitter.appmanager.WallPage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.disabled;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class LoginTwitter extends TestBase{


    @Test (enabled = false)
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


    @Test
    public void errorLogin() {
        LoginPage loginPage = new LoginPage();
        loginPage.openPage();
        loginPage.messageError().shouldNotBe(visible);
        loginPage.buttonLogIn().click();
        loginPage.messageError().shouldBe(visible).shouldHave(text("Введённые имя пользователя и пароль не совпадают с сохранёнными в нашей базе данных. Проверьте правильность введённых данных и повторите попытку."));

    }

}
