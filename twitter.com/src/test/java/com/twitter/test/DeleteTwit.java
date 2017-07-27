package com.twitter.test;

import com.twitter.appmanager.WallPage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;

public class DeleteTwit extends TestBase {
    @Test
    public void deleteTwit() {
        WallPage wallPage = new WallPage();
        wallPage.oneTwit().shouldBe(visible);
        wallPage.modalDialog().shouldNotBe(visible);
        wallPage.dropdownTwit().click();
        wallPage.dropdownButtonDelete().click();
        wallPage.modalDialogButtonDelete().click();
        wallPage.oneTwit().shouldNotBe(visible);
    }
}
