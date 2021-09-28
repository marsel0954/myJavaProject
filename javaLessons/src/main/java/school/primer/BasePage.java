package school.primer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage extends InitDriverPrimer {
    public static final By SIDEBAR_ARROW = By.className("sidebar_arrow-button__10bs-");

    WebDriver driver = InitDriverPrimer();
    public void Sidebararrowclick(){
        driver.findElement(SIDEBAR_ARROW).click();
    }
}



