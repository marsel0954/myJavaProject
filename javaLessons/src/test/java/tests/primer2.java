package tests;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import school.primer.InitDriverPrimer;
import school.primer.LoginPage;

public class primer2 {
    LoginPage loginPage = new LoginPage(InitDriverPrimer.getDriver());

    @Test //АВТОРИЗАЦИЯ ПОЛЬЗОВАТЕЛЯ
    public void inputLP() {
        loginPage.inputLP("huntflow-test-16@andersenlab.com","159753CFThn");
        Assertions.assertEquals(true,loginPage.firstPage());
        loginPage.driverQuit();
    }
}
