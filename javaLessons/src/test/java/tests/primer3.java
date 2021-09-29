package tests;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import school.primer.InitDriverPrimer;
import school.primer.LoginPage;

public class primer3 {
    LoginPage loginPage = new LoginPage(InitDriverPrimer.getDriver());

    @Test //ОТОБРАЖЕНИЕ ФУНКЦИОНАЛЬНОСТИ КНОПКИ "ГЛАЗИК" НА СТРАНИЦЕ АВТОРИЗАЦИИ
    public void inputLP() {
        loginPage.inputLP("222","23123123123");
        loginPage.eyeButton();
        loginPage.driverQuit();
    }
}
