package tests;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import school.primer.LoginPage;

public class primer2 {
    LoginPage Loginpage = new LoginPage();

    @Test
    public void inputLP() {
        Loginpage.inputLP("huntflow-test-16@andersenlab.com","159753CFThn");
       // Assertions.assertEquals(Loginpage.IconTop(),);
        Loginpage.driverQuit();
    }
}
