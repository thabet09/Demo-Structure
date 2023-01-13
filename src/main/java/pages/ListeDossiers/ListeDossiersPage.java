package pages.ListeDossiers;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import Dossier.FicheClientPage;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class ListeDossiersPage {
    private WebDriver driver;
    //private By TransférerButton = By.cssSelector();
    private By CheckBox = By.xpath("/html/body/app-root/app-main/div/div/div/div/div/app-dossier-list/app-shared-list-dossiers/div/div[2]/div/table/tbody/tr[1]/td[2]");
    private By TransferButton1 = By.xpath("/html/body/app-root/app-main/div/div/div/div/div/app-dossier-list/app-shared-list-dossiers/div/div[1]/div[2]/button[1]");
    private By NewCommercialField = By.xpath("//*[@id=\"Civilite\"]/div/div/div[2]/input");
    //private By OldCommercialField = By.xpath("/html/body/app-root/app-main/div/div/div/div/div/app-dossier-list/app-shared-list-dossiers/div/div[2]/div/table/tbody/tr[1]/td[17]");

    private By TransferButton2 = By.xpath("//mat-dialog-container[@id='mat-dialog-0']/div/app-agent-phase-modal/div/div[3]/button[2]/span");

    //private By AlerteTransfer = By.xpath("//div[@id='cdk-overlay-5']/snack-bar-container/div/div/app-notification-toaster/div/div/div/div/h6");

    private By SupprimerButton1 = By.xpath("/html/body/app-root/app-main/div/div/div/div/div/app-dossier-list/app-shared-list-dossiers/div/div[1]/div[2]/button[2]");
    private By SupprimerButton2 = By.xpath("//div[@id='delete-modal']/div[3]/div/button[2]/span");

    private By AjouterButton = By.xpath("/html/body/app-root/app-main/div/div/div/div/div/app-dossier-list/app-shared-list-dossiers/div/div[1]/div[2]/button[5]");


    public ListeDossiersPage(WebDriver driver) {
        this.driver = driver;
    }


    public void IntListeDossiers() {

        String ActualURL = driver.getCurrentUrl();
        String ExpectedURL = "https://re.ixia-test.fr/main/produits/liste_dossiers";
        Assert.assertEquals(ExpectedURL, ActualURL);
    }

    public void TransferDossier() throws Exception {
        driver.findElement(CheckBox).click();
        driver.findElement(TransferButton1).click();

       // WebDriverWait wait = new WebDriverWait(driver, 30);
        //wait.until(elementToBeClickable(NewCommercialField));

           /* WebElement nomComm = driver.findElement(OldCommercialField);
            String NomComm = nomComm.getText();
            System.out.println(NomComm);
            Assert.assertEquals(NomComm, "Chergui Frédéric");*/

        //Transferer un dossier entre commerciaux
        driver.findElement(NewCommercialField).sendKeys("Chergui Frédéric");
        driver.findElement(NewCommercialField).sendKeys(Keys.ENTER);
        driver.findElement(TransferButton2).click();
        Thread.sleep(10000);

           /* WebDriverWait w = new WebDriverWait(driver,30);
            w.until(ExpectedConditions.visibilityOfElementLocated(AlerteTransfer));*/
    }

    public void SupprimerDossier() throws Exception {

        driver.findElement(CheckBox).click();
        driver.findElement(SupprimerButton1).click();
        driver.findElement(SupprimerButton2).click();
        Thread.sleep(10000);

    }

       /* public void AjoutDossier() throws Exception{
        driver.findElement(AjouterButton).click();

            WebDriverWait wait = new WebDriverWait(driver, 50);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/app-root/app-main/div/div/div/div/div/app-details-dossier/div/mat-drawer-container/mat-drawer-content/div/div/div/mat-tab-group/div/mat-tab-body/div/div/app-fiche-client/div/form/app-projet-details/div/div[2]/form/div/div/div[4]/div")));
            System.out.println(driver.getCurrentUrl());
            Assert.assertEquals(driver.getCurrentUrl(), "https://re.ixia-test.fr/main/produits/dossier/0/contacts");
            //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/app-root/app-main/div/div/div/div/div/app-details-dossier/div/mat-drawer-container/mat-drawer-content/div/div/div/mat-tab-group/div/mat-tab-body/div/div/app-fiche-client/div/form/app-emprunteur-details/div/div[2]/form/div/div[1]/div/div/div[2]/div/input")));
            //driver.findElement(By.id("nomEmp")).sendKeys("thabet");
            //Thread.sleep(5000);

        }*/

    public FicheClientPage ClickAjouterButton() {
        driver.findElement(AjouterButton).click();

       // WebDriverWait wait = new WebDriverWait(driver, 50);
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/app-root/app-main/div/div/div/div/div/app-details-dossier/div/mat-drawer-container/mat-drawer-content/div/div/div/mat-tab-group/div/mat-tab-body/div/div/app-fiche-client/div/form/app-projet-details/div/div[2]/form/div/div/div[4]/div")));
        return new FicheClientPage(driver);
    }
}



