package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firsTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/kubraarslan/Documents/selenium libraries/drivers/chromedriver");
        /*
             En temel haliyle otomasyon yapmak icin Class'imiz da otomasyon icin gerekli olan web driver'in yerini gostermemiz gerekir.
             Bunun icin Java kutuphanesinden System.setProperty() methodunun icine ilk olarak driver'i yazariz. Ikinci olarak driver'in fiziki
             yolunu kpyalariz.
         */
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");




    }
}
