import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;


public class LoginStepdefs {

    //private WebDriver driver  = Hooks.driver;
    By userTextboxBy = By.cssSelector("#user-name");
    By passwordTextboxBy = By.cssSelector("#password");
    By loginButtonBy = By.cssSelector("#login-button");
    By secondErrorMessageBy = By.cssSelector("div.error-message-container.error > h3");
    By firstErrorMessageBy = By.cssSelector("div.error-message-container.error > h3");


    @Given("je renseigne le lien de connexion du site Swag Labs {string}")
    public void jeRenseigneLeLienDeConnexionDuSiteSwagLabs(String lien) {

//       WebDriverManager.edgedriver().setup();
//        EdgeOptions options = new EdgeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        driver = new EdgeDriver(options);
        // WebDriverManager.chromedriver().setup();
        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("--remote-allow-origins=*");
        //driver = new ChromeDriver(options);
        Hooks.openBrowser();
        Hooks.driver.get(lien);
    }

    @When("je saisis le nom d'utilisateur {string}")
    public void jeSaisisLeNomDUtilisateur(String login) {
        Hooks.driver.findElement(userTextboxBy).sendKeys(login);
    }

    @And("je clique sur le bouton Login")
    public void jeCliqueSurLeBoutonLogin() {
        Hooks.driver.findElement(loginButtonBy).click();
    }

    @And("je saisis le mot de passe {string}")
    public void jeSaisisLeMotDePasse(String mot_de_passe) {
        Hooks.driver.findElement(passwordTextboxBy).sendKeys(mot_de_passe);
    }

    @Then("je verifie que le message erreur suivant {string} s'affiche")
    public void jeVerifieQueLeMessageErreurSuivantSAffiche(String message) {
        String first_message = Hooks.driver.findElement(firstErrorMessageBy).getText();
        String second_message = Hooks.driver.findElement(secondErrorMessageBy).getText();
        Assert.assertEquals(message, first_message, second_message);
    }
}
