package com.twitter.test;

import com.twitter.appmanager.CommonElements;
import com.twitter.appmanager.WallPage;
import org.testng.annotations.Test;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class NewTwit extends TestBase {

    @Test
    public void inputNewTwit(){
        WallPage wallPage = new WallPage();
        wallPage.buttonTwit().shouldNotBe(visible);
        wallPage.inputTwit().setValue("Текст Твита");
        wallPage.buttonTwit().click();
        CommonElements commonElements = new CommonElements();
        commonElements.message().shouldBe(visible).shouldHave(text("Отлично! Все ваши твиты будут отображаться на странице профиля. Их также можно будет увидеть в вашей ленте и в лентах ваших читателей."));
        wallPage.oneTwit().shouldHave(text("Текст Твита"));

        /*Добавить проверку отображения нового твита на стене.
         Для проверки:
          1. Сначала перед выполнением кейса получаем кол-во твитов
          2. Выполнеям кейс добавления нового твита
          3. Получаем новое кол-во твитов
          4. Проверяем что новое кол-во твитов больше на 1 единицу
          5. Проверяем содержимое последнего твита (должно совпадать с данными которые были в введены на шаге добавления твита
         */


    }
}
