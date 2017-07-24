package com.twitter.test;

import com.twitter.appmanager.HomePage;
import com.twitter.appmanager.WallPage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;

public class LoginTwitter extends TestBase{
    @Test
    public void loginForTwitter() {
        HomePage home = new HomePage();
        home.buttonLogInHome().click();
        home.inputLogin().setValue("1AutoTesting1");
        home.passInput().setValue("123581321");
        home.checkboxRememberMe().click();
        WallPage page = home.clickButtonLogin();
        page.userName().shouldHave(text("GameTesting"));
    }
}
