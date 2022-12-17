package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/kubraarslan/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println("Sayfa Basligi : " + driver.getTitle());
        System.out.println("Sayfa URL si" + driver.getCurrentUrl());
        //System.out.println(driver.getPageSource()); sayfanin kaynak kodlarini yazdirdik.
        System.out.println(driver.getWindowHandle()); // // Bize o window'a ait hash değerini verir. Biz bu hash değerlerini
        // bir string'e atayıp pencereler arası geçiş yapabiliriz
    }
}
