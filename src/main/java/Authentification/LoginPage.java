package Authentification;


import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.TableauDeBord.DashboardPage;


public class LoginPage {

    private WebDriver driver;

    private By visibilityButton = By.xpath("//mat-icon[contains(.,'visibility')]");
    //private By usernameField = By.cssSelector("*[formcontrolname='EmailProfessionnel']");
   // private By visibilityButton = By.xpath(visibilitButton);
    private By usernameField = By.cssSelector(".is-invalid");
    private By passwordField = By.cssSelector("*[formcontrolname='MotDePasse']");
    private By loginButton = By.xpath("//span[contains(.,'Connexion')]");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

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

    public DashboardPage clickLoginButton() throws Exception {
        driver.findElement(loginButton).click();
        Thread.sleep(10000);
        return new DashboardPage(driver);

    }
}




