import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProductsStepdefs {

    private WebDriver driver = Hooks.driver;

    By ProductPageTitleBy = By.cssSelector("div.app_logo");

    By ProductPageAddBy = By.cssSelector("#add-to-cart-sauce-labs-backpack");

    @Then("je me connecte dans le site {string}")
    public void jeMeConnecteDansLeSiteSwagsLags(String product) {
        String actual_title = driver.findElement(ProductPageTitleBy).getText();
        Assert.assertEquals(product, actual_title);
    }

    @And("je clique sur le bouton AddTocard")
    public void jeCliqueSurLeBoutonAddTocard() {
        driver.findElement(ProductPageAddBy).click();
    }
}
