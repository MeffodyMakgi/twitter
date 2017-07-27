package com.twitter.appmanager;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class WallPage {

    public SelenideElement userName() {
        return $(By.xpath("//a[@class='u-textInheritColor js-nav']"));
    }

    public SelenideElement inputTwit() {
        return $(By.id("tweet-box-home-timeline"));
    }

    public SelenideElement buttonTwit() {
        return $(By.xpath("//button[@class='tweet-action EdgeButton EdgeButton--primary js-tweet-btn']"));
    }

    public SelenideElement oneTwit() {
        return $(By.xpath("//ol[@id='stream-items-id']/li[1]"));
    }

    public SelenideElement dropdownTwit() {
        return $(By.xpath("//button[@class='ProfileTweet-actionButton u-textUserColorHover dropdown-toggle js-dropdown-toggle']"));
    }

    public SelenideElement dropdownButtonDelete() {
        return $$(By.xpath("//button[@class='dropdown-link'][@role='menuitem']")).findBy(text("Удалить твит"));
    }

    public SelenideElement modalDialog() {
        return $(By.xpath("//div[@class='modal-content'][@role='document']"));
    }

    public SelenideElement modalDialogButtonDelete() {
        return $(By.xpath("//div[@class='modal-content'][@role='document']//button[@class='EdgeButton EdgeButton--danger delete-action']"));
    }
}
