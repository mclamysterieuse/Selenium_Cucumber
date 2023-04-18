import cucumber.api.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CardStepdefs {

    private WebDriver driver = Hooks.driver;

    @FindBy(css = "#shopping_cart_container > a")
    public WebElement cardSelector;

    @FindBy(css = "#shopping_cart_container > a > span")
    public WebElement productSelector;
    @FindBy(css = "div.item_pricebar > div")
    public WebElement priceSelector;

    public CardStepdefs() {
        PageFactory.initElements(driver, this);
    }

    @And("je clique sur la card")
    public void jeCliqueSurLaCard() {
        cardSelector.click();
    }

    @And("Le nombre d'articles dans le panier est {string}")
    public void leNombreDArticlesDansLePanierEst(String number) {
        String actual_product = productSelector.getText();
        Assert.assertEquals(number, actual_product, "le nombre n'est pas le même");
    }

    @And("le prix de l'article est de {string}")
    public void lePrixDeLArticleEstDe(String price) {
        String actual_price = priceSelector.getText();
        Assert.assertEquals(price, actual_price);
    }
}
