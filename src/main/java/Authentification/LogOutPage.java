package Authentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogOutPage {

    private WebDriver driver;
    private By decButton1 =By.cssSelector("*[class='mat-focus-indicator mat-menu-trigger CN_profileImg mr-2 mat-icon-button mat-button-base']");
    private By decButton2 = By.cssSelector("*[class='btn_white']");

    public LogOutPage(WebDriver driver){
        this.driver = driver;
    }


    public void setlogout() throws  Exception{
        WebElement DecButton1 = driver.findElement(decButton1);
        DecButton1.click();
        WebElement DecButton2 = driver.findElement(decButton2);
        DecButton2.click();
    }

}
