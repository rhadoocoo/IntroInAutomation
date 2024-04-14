package DefinitiiPasi;

import Utile.ChromeConfig;
import Utile.Methods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Objects;

public class StepDefinitions {
    ChromeDriver driver;
    Methods methods;

    @Given("Deschid browserul")
    public void deschideBrowser()    {
        driver= (ChromeDriver) ChromeConfig.getChromeDriver();
        methods=new Methods(driver);

    }
    @Given("Accesez pagina {string}")
    public void accesezPagina(String url)    {
        driver.get(url);

    }
    @Then("Pagina {string} este afisata corect si contine textul {string}")
    public void paginaAfisataCorect(String expectedUrl, String containsText)  {
        String actualUrl = driver.getCurrentUrl();
       if (!Objects.equals(expectedUrl, actualUrl)) throw new AssertionError("URL nu este cel asteptat");
       String text=driver.findElement(By.tagName("body")).getText();
       System.out.println("\n "+text);
        if (!text.contains(containsText)) {
            throw new AssertionError("Pagina nu conține textul căutat: " + containsText);
        } else {
            System.out.println("Textul căutat a fost găsit pe pagina: " + containsText);
        }


    }
    @Then("Inchid browserul")
    public void inchidBrowserul()
    {
        driver.quit();
    }
    @And("Apas butonul {string}")
    public void apasButonul(String numeButon){
        methods.pushButton(numeButon);
    }
    @And("Apas pe dropdown-ul Alege limba si selectez limba romana")
    public void selectezDropdown(){
        Select dropdownCountry =new Select(driver.findElement(By.id("searchLanguage")));
        dropdownCountry.selectByVisibleText("Română");
    }
    @And ("Vreau sa caut informatii despre {string}")
    public void cautare(String elementCautat)  {
        methods.searchItem(elementCautat);
    }
}
