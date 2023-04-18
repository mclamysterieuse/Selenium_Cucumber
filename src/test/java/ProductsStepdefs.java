import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductsStepdefs {

    private WebDriver driver = Hooks.driver;
    @FindBy(css = "div.app_logo")
    public WebElement productPageTitle;
    @FindBy(css = "#add-to-cart-sauce-labs-backpack")
    public WebElement productPageAdd;
    @FindBy(css = "#add-to-cart-sauce-labs-onesie")
    public WebElement product1PageAdd;


    public ProductsStepdefs() {
        PageFactory.initElements(driver, this);
    }

    @Then("je me connecte dans le site {string}")
    public void jeMeConnecteDansLeSiteSwagsLags(String product) {
        String actual_title = productPageTitle.getText();
        Assert.assertEquals(product, actual_title);
    }

    @And("je clique sur le bouton AddTocard")
    public void jeCliqueSurLeBoutonAddTocard() {
        productPageAdd.click();
        product1PageAdd.click();
    }
}
