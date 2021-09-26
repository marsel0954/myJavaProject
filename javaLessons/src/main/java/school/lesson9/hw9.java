
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
        driver.get("https://google.com");
       // driver.get("https://crm-trainee-react-dev.andersenlab.dev/login");


        WebElement input = driver.findElement(By.xpath("//input[@aria-label=\"Поиск в Google\"]"));
        input.click();
      //  driver.quit();
    }
}