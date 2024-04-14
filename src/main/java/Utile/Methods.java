package Utile;

import DefinitiiPasi.StepDefinitions;
import Locatori.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods extends StepDefinitions {
    ChromeDriver driver;
    Locators locators;
    public Methods(ChromeDriver driver)
    {
        this.driver=driver;
        locators=new Locators();
    }
    public void pushButton (String buttonID)
    {

        By buttonLocator = locators.numeButon(buttonID);
        WebElement element = driver.findElement(buttonLocator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();

    }

    public void searchItem(String searchElement)  {
        WebElement campCautare =driver.findElement(By.id("searchInput"));
        campCautare.sendKeys(searchElement);
        WebElement butonCauta=driver.findElement(By.xpath("/html/body/main/div[2]/form/fieldset/button"));
        butonCauta.submit();


}
}
