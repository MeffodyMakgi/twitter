package com.twitter.appmanager;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    public void openPage() {
        open("https://www.twitter.com/login");
    }

    public SelenideElement inputLogin() {
        return $(By.xpath("//input[@class='js-username-field email-input js-initial-focus']"));
    }

    public SelenideElement passInput() {
        return $(By.xpath("//input[@class='js-password-field']"));
    }

    public  SelenideElement checkboxRememberMe() {
        return $(By.xpath("//label[@class='t1-label remember']/input[@name='remember_me']"));
    }

    public SelenideElement buttonLogIn() {
        return $(By.xpath("//button[@type='submit']"));
    }


}
