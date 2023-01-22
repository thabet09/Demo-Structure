package login;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Authentification.HomePage;
import Authentification.LogOutPage;
import Authentification.LoginPage;

public class LoginTests {
    private WebDriver driver;
    protected HomePage homePage;
    protected LogOutPage logOutPage;
   @BeforeTest
    public void setUp() {
        //System.setProperty("webdriver.chrome.driver", "Browser/chromedriver.exe");
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
        homePage = new HomePage(driver);
        logOutPage = new LogOutPage(driver);

    }
    @Test
    public void testSuccesLogin() throws Exception {
    LoginPage loginPage = homePage.clickAuthentication();
    loginPage.setUsername("agent-pascal@hpy.com");
    loginPage.setPassword("123456");
    loginPage.setVisibility();

    loginPage.clickLoginButton();
    Thread.sleep(20000);

    logOutPage.setlogout();
    Thread.sleep(10000);

    loginPage.getResultLogin();

    }
    @Test
    public void testFailLogin() throws Exception {
    LoginPage loginPage = homePage.clickAuthentication();
    loginPage.setUsername("thabet");
    loginPage.setPassword("");
    loginPage.setVisibility();

    loginPage.clickLoginButton();
    Thread.sleep(20000);

    loginPage.getResultLogin();

    }
    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}

