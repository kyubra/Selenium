package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Home_Work1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/kubraarslan/Documents/selenium libraries/drivers/chromedriver");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

       driver.navigate().to("https://www.youtube.com");
       driver.navigate().to("https://www.amazon.com");
       driver.navigate().back();
       driver.navigate().forward();
       driver.navigate().refresh();
       driver.quit();


    }
}
