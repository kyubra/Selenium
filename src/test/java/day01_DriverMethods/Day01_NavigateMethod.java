package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/kubraarslan/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        //Amazon sayfasina gidelim

        driver.navigate().to("https://amazon.com");
        //TechPro sayfasina gidelim

            Thread.sleep(3000);

        driver.navigate().to("https://techproeducation.com");
        //Tekrar amazon sayfasina donelim
        Thread.sleep(3000);
        driver.navigate().back();
        //Tekrar Facebook sayfasina gidelim
        Thread.sleep(3000);
        driver.navigate().forward();
        //Son sayfada sayfayi yenileyelim
        Thread.sleep(3000);
        driver.navigate().refresh();
        //Ve sayfayi kapalim.
        driver.close();
    }
}
