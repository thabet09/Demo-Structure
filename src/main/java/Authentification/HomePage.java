package Authentification;


import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickAuthentication(){

        driver.get("https://re.ixia-test.fr/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        return new LoginPage(driver);
    }
}
