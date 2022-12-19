package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_LocatersGetMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/kubraarslan/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


       // Amazon sayfasina gidelim
        driver.get("https://www.amazon.com");
        //Search bolumunu locate edip iphone aratalim
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
        //Arama sonuc yazisinda iphone yazisini locate edip konsola yazdiralim
        WebElement aramaSonucYazisi = driver.findElement(By.className("a-color-state a-text-bold"));
        System.out.println(aramaSonucYazisi.getText());


        //sayfai kapatalim

        driver.close();
    }
}
