package com.twitter.appmanager;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CommonElements {
    public SelenideElement message() {
        return $(By.xpath("//div[@class='message-inside']/span"));
    }
}
