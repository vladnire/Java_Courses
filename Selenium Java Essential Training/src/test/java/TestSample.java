import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;;import java.util.concurrent.TimeUnit;

public class TestSample {
    public static void main(String[] args) throws InterruptedException {
        // Set the property of webdriver.chrome.driver to be the
        // location to your local chromedriver
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\jdk-15.0.1\\bin\\chromedriver.exe");

        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");

        // Accept conditions
        driver.switchTo().frame(0);
        WebElement agree = driver.findElement(By.id("introAgreeButton"));
        agree.click();

        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));

        // Enter something to search for
        element.sendKeys("stocks");

        element.submit();

        TimeUnit.SECONDS.sleep(3);

        driver.quit();
    }
}