package Authentification;


import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.TableauDeBord.DashboardPage;

import java.time.Duration;

import static java.util.concurrent.TimeUnit.SECONDS;


public class LoginPage {

    private WebDriver driver;

    private By visibilityButton = By.xpath("//mat-icon[contains(.,'visibility')]");
    //private By usernameField = By.cssSelector("*[formcontrolname='EmailProfessionnel']");
   // private By visibilityButton = By.xpath(visibilitButton);
    private By usernameField = By.cssSelector(".is-invalid");
    private By passwordField = By.cssSelector("*[formcontrolname='MotDePasse']");
    private By loginButton = By.xpath("//span[contains(.,'Connexion')]");

    private By produits = By.xpath("//span[contains(.,'Produits')]");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    /*@Deprecated
    public WebDriverWait(WebDriver driver, long timeoutInSeconds) {
        this(driver, Duration.ofSeconds(20));
    }*/
    public void setUsername(String username) {
        WebElement Username = driver.findElement(usernameField);
        Username.sendKeys(username);
    }

    public void setPassword(String password) {
        WebElement Password = driver.findElement(passwordField);
        Password.sendKeys(password);
    }

    public void setVisibility() {
        WebElement Visibility = driver.findElement(visibilityButton);
        Visibility.click();

    }

    public void getResultLogin() {
        String ExpectedURL = "https://re.ixia-test.fr/auth/login";
        String ActualURL = driver.getCurrentUrl();
        Assert.assertEquals(ExpectedURL, ActualURL);

    }

    public DashboardPage clickLoginButton() throws InterruptedException {
        driver.findElement(loginButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(produits));
        return new DashboardPage(driver);

    }
}




