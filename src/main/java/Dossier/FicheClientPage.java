package Dossier;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;

public class FicheClientPage {
private  WebDriver driver;

    public FicheClientPage(WebDriver driver) {
        this.driver = driver;
    }

    public void FicheClient() throws InterruptedException{

        /*driver.get("https://re.ixia-test.fr/main/produits/dossier/0/contacts");
        Thread.sleep(20000);
       //Vérifier que la page de fiche client est ouverte
        System.out.println(driver.getCurrentUrl());*/

        Assert.assertEquals(driver.getCurrentUrl(), "https://re.ixia-test.fr/main/produits/dossier/0/contacts");
        System.out.println("Vous etes sur la fiche client");
        System.out.println("Vous etes sur la fiche client");
        driver.findElement(By.id("nomEmp")).sendKeys("thabet");
        driver.findElement(By.id("prenomEmp")).sendKeys("thabet");
        driver.findElement(By.id("nomJeuneFilleEmp")).sendKeys("thabet");
        driver.findElement(By.xpath("//ng-select[@id='codePostale']//input[1]")).sendKeys("59000");
        Thread.sleep(6000);
        this.driver.findElement(By.xpath("//ng-select[@id='codePostale']//input[1]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"mat-input-20\"]")).sendKeys("09011996");

        String email=randomString()+ "@gmail.com";
        driver.findElement(By.id("EmailEmp")).sendKeys(email);

        driver.findElement(By.id("Adresse")).sendKeys("toulouse rue59");
        driver.findElement(By.id("ValeurBienImmo")).sendKeys("100000");

        driver.findElement(By.xpath("//span[.=' Enregistrer']")).click();

        Thread.sleep(6000);

    }
    public String randomString() {

        String generatedstring= RandomStringUtils.randomAlphabetic(6);
        return(generatedstring);

    }
}
