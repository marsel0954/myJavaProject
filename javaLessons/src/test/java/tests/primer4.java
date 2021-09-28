package tests;

import org.junit.Test;
import school.primer.BasePage;
import school.primer.LoginPage;

public class primer4 {
    LoginPage Loginpage = new LoginPage();
    BasePage BasePage =  new BasePage();
    @Test
    public void inputLP(){
        Loginpage.inputLP("huntflow-test-16@andersenlab.com","159753CFThn");
    }
    public void Sidebararrowclick(){
        BasePage.Sidebararrowclick();
    }
    public void driverQuit(){

    }
}
