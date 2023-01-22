package pages.agendaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AgendaPage {
    private static WebDriver driver;
    private static By AgendaButton = By.xpath("/html/body/app-root/app-main/div/div/app-side-bar/div/div/div[2]/mat-accordion[3]/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title/span");

    public AgendaPage(WebDriver driver) {
        this.driver = driver;
    }


    public TachePage ClickTache() {

        driver.findElement(AgendaButton);
        return new TachePage();
    }
}
