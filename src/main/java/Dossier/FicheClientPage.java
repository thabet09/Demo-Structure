package Dossier;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FicheClientPage {
private  WebDriver driver;
//private By AjouterButton = By.xpath("(//button[@type='button'])[9]");


    public FicheClientPage(WebDriver driver) {
        this.driver = driver;
    }

    public void FicheClient() throws Exception{


        driver.get("https://re.ixia-test.fr/main/produits/dossier/0/contacts");
        Thread.sleep(20000);
        /*
       //cliquer ajouter pour creer un nouveau lead
        driver.findElement(AjouterButton).click();
        WebDriverWait wait = new WebDriverWait(this.driver, 50);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/app-root/app-main/div/div/div/div/div/app-details-dossier/div/mat-drawer-container/mat-drawer-content/div/div/div/mat-tab-group/div/mat-tab-body/div/div/app-fiche-client/div/form/app-projet-details/div/div[2]/form/div/div/div[4]/div")));

       //Vérifier que la page de fiche client est ouverte
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(), "https://re.ixia-test.fr/main/produits/dossier/0/contacts");*/

        this.driver.findElement(By.id("nomEmp")).sendKeys("thabet");
        this.driver.findElement(By.id("prenomEmp")).sendKeys("thabet");
        this.driver.findElement(By.id("nomJeuneFilleEmp")).sendKeys("thabet");
        this.driver.findElement(By.cssSelector("*[placeholder=\"Choisir un code postale \"]")).sendKeys("59000");
        Thread.sleep(5000);
        this.driver.findElement(By.cssSelector("*[placeholder=\"Choisir un code postale \"]")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
}}
