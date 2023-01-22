package listeDossiers;

import base.BaseTests;

import org.testng.annotations.Test;
import pages.TableauDeBord.DashboardPage;
import pages.ListeDossiers.ListeDossiersPage;


public class ListeDossiersTests extends BaseTests {



    @Test
    public void TestListeDossiers() throws  Exception{

        DashboardPage dashboardPage = loginPage.clickLoginButton();
        dashboardPage.getProduits();
        ListeDossiersPage listeDossiersPage = dashboardPage.ClickListeDossiersButton();
        Thread.sleep(5000);
        listeDossiersPage.IntListeDossiers();
/*
        listeDossiersPage.TransferDossier();
        Thread.sleep(5000);
        listeDossiersPage.SupprimerDossier();

*/
    }
}
