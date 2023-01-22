package dossier;

import Dossier.FicheClientPage;
import base.BaseTests;
import org.testng.annotations.Test;
import pages.ListeDossiers.ListeDossiersPage;
import pages.TableauDeBord.DashboardPage;

public class CreateLeadTests extends BaseTests {

@Test
    public  void TestCreationLead () throws  Exception{

        DashboardPage dashboardPage = loginPage.clickLoginButton();
        dashboardPage.getProduits();
        ListeDossiersPage listeDossiersPage = dashboardPage.ClickListeDossiersButton();

        FicheClientPage ficheClientPage = listeDossiersPage.ClickAjouterButton();
        ficheClientPage.FicheClient();
        Thread.sleep(5000);

    }
}
