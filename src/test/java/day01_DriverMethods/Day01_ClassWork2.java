package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day01_ClassWork2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/kubraarslan/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//Bu method sayfadaki her bir webelement icin
                                                                          //maksimum beleme suresini belirler.

        //ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.

        driver.get("https://www.facebook.com");
        String actualTitile = driver.getTitle();
        if(actualTitile.contains("facebook")){
            System.out.println("Title Testi Passed");

        }else System.out.println("Title Testi Failed"+actualTitile);

        //Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        //yazdirin.
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains("facebook")){
            System.out.println("Url Testi PASSED");
        }else System.out.println("URL Testi FAILED"+actualUrl);

        //https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com");

        //Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String actualWalartTitle = driver.getTitle();
        String expectedWalmartTitle = "Walmart.com";
        if (actualWalartTitle.contains(expectedWalmartTitle)){
            System.out.println("Title testi Passed");

        }else System.out.println("Title Testi Failed");
        //Tekrar “facebook” sayfasina donun
        driver.navigate().back();
        //Sayfayi yenileyin
        driver.navigate().refresh();
        // Browser’i kapatin
        driver.close();
    }
}
