package com.twitter.test;

import com.twitter.appmanager.LoginPage;
import com.twitter.appmanager.WallPage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;

public class LoginTwitter extends TestBase{


    @Test (ignoreMissingDependencies = true)
    public void loginForTwitter() {
        LoginPage loginPage = new LoginPage();
        loginPage.openPage();
        loginPage.inputLogin().setValue("1AutoTesting1");
        loginPage.passInput().setValue("123581321");
        loginPage.checkboxRememberMe().click();
        WallPage page = loginPage.clickButtonLogin();
        page.userName().shouldHave(text("GameTesting"));
    }
}
