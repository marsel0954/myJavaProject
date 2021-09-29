package tests;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import school.primer.InitDriverPrimer;
import school.primer.LoginPage;

public class primer1 {
    LoginPage loginPage = new LoginPage(InitDriverPrimer.getDriver());

    @Test //ПРОВЕРКА ОБРАБОТКИ ОЩИБКИ НЕПРАВИЛЬНОГО ЛОГИНА
    public void inputLP() {
        loginPage.inputLP("222","23123123123");
        Assertions.assertEquals(loginPage.errorAnswer(),"Введите корпоративную почту Andersen");
        loginPage.driverQuit();
    }
}
