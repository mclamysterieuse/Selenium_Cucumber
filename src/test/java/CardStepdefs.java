import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CardStepdefs {

    private WebDriver driver = Hooks.driver;
    By cardSelectorBy = By.cssSelector("#shopping_cart_container > a");
    By productSelectorBy = By.cssSelector("#shopping_cart_container > a > span");
    By priceSelectorBy = By.cssSelector("div.item_pricebar > div");


    @And("je clique sur la card")
    public void jeCliqueSurLaCard() {
        driver.findElement(cardSelectorBy).click();
    }

    @And("Le nombre d'articles dans le panier est {string}")
    public void leNombreDArticlesDansLePanierEst(String number) {
        String actual_product = driver.findElement(productSelectorBy).getText();
        Assert.assertEquals(number, actual_product);
    }

    @And("le prix de l'article est de {string}")
    public void lePrixDeLArticleEstDe(String price) {
        String actual_price = driver.findElement(priceSelectorBy).getText();
        Assert.assertEquals(price, actual_price);
    }
}
