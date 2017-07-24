package com.twitter.appmanager;

import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selenide.open;

public class ApplicationManager {

  public void init() {
    Configuration.browser = "chrome";
    Configuration.browserSize = "768x360";
    open("https://www.twitter.com/");
  }

}
