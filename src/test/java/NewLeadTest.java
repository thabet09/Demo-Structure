
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class NewLeadTest  {
    private WebDriver driver;
    private By usernameField = By.cssSelector(".is-invalid");
    private By passwordField = By.cssSelector("*[formcontrolname='MotDePasse']");
    private By loginButton = By.xpath("//span[contains(.,'Connexion')]");

    @Test
    public  void Creation () throws  Exception{

        System.setProperty("webdriver.chrome.driver", "Browser/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://re.ixia-test.fr/");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(usernameField);
        Username.sendKeys("agent-pascal@hpy.com");

        WebElement Password = driver.findElement(passwordField);
        Password.sendKeys("123456");

        driver.findElement(loginButton).click();
        Thread.sleep(10000);

        driver.get("https://re.ixia-test.fr/main/produits/dossier/0/contacts");
        Thread.sleep(20000);
        driver.findElement(By.id("nomEmp")).sendKeys("thabet");
        driver.findElement(By.id("prenomEmp")).sendKeys("thabet");
        driver.findElement(By.id("nomJeuneFilleEmp")).sendKeys("thabet");
        WebElement CodePostal = driver.findElement(By.xpath("//*[text() = 'Choisir un code postale ']"));
        CodePostal.sendKeys("59000");
        Thread.sleep(5000);
        CodePostal.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.quit();

    }
}
