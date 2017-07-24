package com.twitter.appmanager;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public SelenideElement buttonLogInHome() {
        return $(By.xpath("//a[@href='/login']"));
    }

    public SelenideElement inputLogin() {
        return $(By.xpath("//input[@name='session[username_or_email]']"));
    }

    public SelenideElement passInput() {
        return $(By.xpath("//input[@name='session[password]']"));
    }

    public  SelenideElement checkboxRememberMe() {
        return $(By.xpath("//input[@name='remember_me']"));
    }

    public SelenideElement buttonLogIn() {
        return $(By.xpath("//input[@type='submit'][@value='Войти']"));
    }

    //Методы
    public WallPage clickButtonLogin() {
        buttonLogIn().click();
        return new WallPage();
    }



}
