package com.twitter.appmanager;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class WallPage {

    public SelenideElement userName() {
        return $(By.xpath("//a[@class='u-textInheritColor js-nav']"));
    }
}
