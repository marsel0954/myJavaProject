
package school.lesson9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class hw9 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Program Files\\Java\\myJavaProject\\JavaLessons\\src\\main\\resources\\chromedriver.exe"
        );
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://crm-trainee-react-dev.andersenlab.dev/login");

        WebElement login = driver.findElement(By.id("login"));
        login.sendKeys("m.gazizov@andersenlab.com");
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("9t5JX9nR4pE8");
        WebElement voiti = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/form/button"));
        voiti.click();

        WebElement arrowBar = driver.findElement(By.className("sidebar_arrow__2XyM_"));
        arrowBar.click();
       WebElement myprofile1 = driver.findElement(By.className("sidebarOption_option-text__27eEt"));
        myprofile1.click();
        WebElement myprofilepop = driver.findElement(By.className("popupMenu_option__3ZD4c"));
        myprofilepop.click();


        try {
            Thread.sleep(7000);
            driver.quit();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
