package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    @FindBy(css = "#user-name")
    private WebElement userTextbox;

    @FindBy(css = "#password")
    private WebElement passwordTextbox;

    @FindBy(css = "#login-button")
    private WebElement loginButton;

    @FindBy(css = "#shopping_cart_container")
    private WebElement productPage;

    By productPageBy = By.cssSelector("#shopping_cart_container");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillLoginForm(String user, String password) {
        userTextbox.sendKeys(user);
        passwordTextbox.sendKeys(password);
        loginButton.click();
    }

    public void redirectionPage() {
        driver.findElement(productPageBy);
    }
}
