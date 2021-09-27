package tests;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import school.primer.LoginPage;

public class primer1 {
    LoginPage Loginpage = new LoginPage();

    @Test
    public void inputLP() {
        Loginpage.inputLP("222","23123123123");
        Assertions.assertEquals(Loginpage.ErrorAnswer(),"Введите корпоративную почту Andersen");
        Loginpage.driverQuit();
    }
}
