package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_ClassWork {
    /*Yeni bir package olusturalim : day01
    Yeni bir class olusturalim : C03_GetMethods
    Amazon sayfasina gidelim. https://www.amazon.com/
    Sayfa basligini(title) yazdirin
    Sayfa basliginin “Amazon” icerdigini test edin
    Sayfa adresini(url) yazdirin
    Sayfa url’inin “amazon” icerdigini test edin.
    Sayfa handle degerini yazdirin
    Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
    Sayfayi kapatin.
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/kubraarslan/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        //Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //    Sayfa basligini(title) yazdirin
        System.out.println("Sayfa Basligi : "+driver.getTitle());
        //    Sayfa basliginin “Amazon” icerdigini test edin

        String actualTitle = driver.getTitle();
        if (actualTitle.contains("Amazon")){
            System.out.println("Title testi PASSED");
        }else
            System.out.println("Title testi FAILED");

        //    Sayfa adresini(url) yazdirin
        System.out.println("Sayfa URL si : "+driver.getCurrentUrl());

        //    Sayfa url’inin “amazon” icerdigini test edin.
         String actualURL = driver.getCurrentUrl();
         if (actualURL.contains("amazon")){
             System.out.println("URL Test Passed");
         }else System.out.println("URL Testi Failed");


        //    Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());

        //    Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String sayfakodlari = driver.getPageSource();
        if (sayfakodlari.contains("Gateway")){
            System.out.println("Source Kodu Passed");
        }else System.out.println("Source Kodu Failed");

        //    Sayfayi kapatin.
        driver.close();

    }

}
