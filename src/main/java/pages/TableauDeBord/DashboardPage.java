package pages.TableauDeBord;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.ListeDossiers.ListeDossiersPage;
import pages.agendaPages.AgendaPage;

public class DashboardPage {

    private WebDriver driver;
    private By produits = By.xpath("//span[contains(.,'Produits')]");
    private By listeDossiers = By.xpath("//span[contains(.,'Liste Dossiers')]");

    private static By AgendaButton = By.xpath("/html/body/app-root/app-main/div/div/app-side-bar/div/div/div[2]/mat-accordion[3]/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title/span");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public void getProduits() {
       //WebDriverWait wait = new WebDriverWait(driver, 10);
       //wait.until(ExpectedConditions.elementToBeClickable(produits));
        WebElement Produits = driver.findElement(produits);
        Produits.click();
    }

    public ListeDossiersPage ClickListeDossiersButton() {
        driver.findElement(listeDossiers).click();
        return new ListeDossiersPage(driver);
    }
    public AgendaPage ClickAgenda() {
        driver.findElement(AgendaButton).click();
        return new AgendaPage(driver);
    }
}
