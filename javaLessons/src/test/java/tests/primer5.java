package tests;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import school.primer.InitDriverPrimer;
import school.primer.LoginPage;

public class primer5 {
    LoginPage loginPage = new LoginPage(InitDriverPrimer.getDriver());

    @Test // ПОИСК ЭДЕМЕНТА НА СТРАНИЦЕ АВТОРИЗАЦИИ
    public void inputLP() {
        Assertions.assertEquals(true,loginPage.findButton());
        loginPage.driverQuit();

    }
}
