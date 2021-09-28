package tests;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import school.primer.LoginPage;

public class primer3 {
    LoginPage Loginpage = new LoginPage();

    @Test
    public void inputLP() {
        Loginpage.inputLP("222","23123123123");
        Loginpage.EyeButton();
        Loginpage.driverQuit();
    }
}
