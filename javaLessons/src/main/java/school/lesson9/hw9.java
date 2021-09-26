
package school.lesson9;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hw9 {
    public static void main(String[] args) {
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Program Files\\Java\\myJavaProject\\JavaLessons\\src\\main\\resources\\chromedriver.exe"
        );
        WebDriver driver = new ChromeDriver();

        driver.get("https://crm-trainee-react-dev.andersenlab.dev/login");
        WebElement login = driver.findElement(By.id("login"));
        login.sendKeys("m.gazizov@andersenlab.com");
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("22erfsdf");
        WebElement voiti = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/form/button"));
        voiti.click();

        ///  driver.get("https://google.com");
      //  WebElement input = driver.findElement(By.xpath("//input[@aria-label=\"Поиск в Google\"]"));

      //  driver.quit();


    }
}