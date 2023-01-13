package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import Authentification.HomePage;
import Authentification.LoginPage;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;
    protected LoginPage loginPage;


@BeforeSuite
    public void setUp() throws Exception {

    System.setProperty("webdriver.chrome.driver", "Browser/chromedriver.exe");
// instancier le webdriver
    driver = new ChromeDriver();

    homePage = new HomePage(driver);
    loginPage = new LoginPage(driver);
}
    @BeforeTest
    public void login() throws Exception{
        LoginPage loginPage = homePage.clickAuthentication();
        loginPage.setUsername("agent-mays@hpy.com");
        loginPage.setPassword("123456");
        loginPage.setVisibility();
}
    @AfterSuite
        public void tearDown(){

        driver.quit();
    }

}
