package school.primer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends InitDriverPrimer {
    public static final By LOGIN_BUTTON = By.xpath("//*[@id=\"root\"]/div/div/form/button");
    public static final By PASSWORD = By.id("pass");
    public static final By LOGIN = By.id("login");
    public static final By ERRORLOGIN = By.xpath("//*[@id=\"root\"]/div/div/form/div[1]/div/span");
    public static final By IMAGETOPBAR = By.xpath("//*[@id=\"root\"]/div/nav/div/a/svg");
    WebDriver driver = InitDriverPrimer();

    public void inputLP(String login, String password){
        driver.findElement(LOGIN).sendKeys(login);
        driver.findElement(PASSWORD).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();

    }
    public String ErrorAnswer(){
        String er1 = driver.findElement(ERRORLOGIN).getAttribute("innerText");
        return er1;
    }

    public void IconTop(){
        driver.findElement(IMAGETOPBAR); // что с ним делать?
    }

    public void driverQuit(){
        try {
            Thread.sleep(7000);
            driver.quit();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
