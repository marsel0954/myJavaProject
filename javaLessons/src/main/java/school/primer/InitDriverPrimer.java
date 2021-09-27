package school.primer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class InitDriverPrimer {
    public WebDriver  InitDriverPrimer(){
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Program Files\\Java\\myJavaProject\\JavaLessons\\src\\main\\resources\\chromedriver.exe"
        );
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://crm-trainee-react-dev.andersenlab.dev/login");
        return driver;
    }

}
