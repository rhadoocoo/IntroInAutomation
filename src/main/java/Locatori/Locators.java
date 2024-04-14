package Locatori;

import org.openqa.selenium.By;

public class Locators {
    public By numeButon(String buttonName) {
        switch (buttonName) {
            case "Cauta":
                return By.xpath("/html/body/main/div[2]/form/fieldset/button");

            default:
                throw new IllegalArgumentException("Butonul nu exista");
        }
    }

    public By numeCamp(String fieldName) {
        switch (fieldName) {
            case "camp cautare":
                return By.id("searchInput");

            default:
                throw new IllegalArgumentException("Campul nu exista");
        }
    }
}
