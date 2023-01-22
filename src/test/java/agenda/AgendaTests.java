package agenda;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.TableauDeBord.DashboardPage;
import pages.agendaPages.AgendaPage;

public class AgendaTests extends BaseTests {

    @Test
    public  void TestActivite () throws  Exception{
        DashboardPage dashboardPage = loginPage.clickLoginButton();
        AgendaPage agendaPage = dashboardPage.ClickAgenda();

    }

}
