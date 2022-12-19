package day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Examples {
    public static void main(String[] args) {

        /*
        İlk once Browser'ı maximize edelimç Sonra tum fayda icin max bekleme suresi olarak 15 saniye belirtelim.
        Sirasiyla amazon,facebook ve youtube sayfalarina gidelim.
        Amazon sayfasina tekrar dönelim.
        Amazon sayfasinin URL'sini https://www.amazon.com/ adresine esit oldugunu test edelim.
        Sayfanin konumu ve pozisyonunu yazdiralim.
        Sayfanin konumunu ve size'ını istedigimiz sekilde ayarlayalim.
        Istedigimiz sekilde olup olmadigini test edelim.
        Sayfayi kapatalim.
 */
        System.setProperty("webdriver.chrome.driver","/Users/kubraarslan/Documents/selenium libraries/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().to("https://www.amazon.com");
        driver.navigate().to("https://www.facebook.com");
        driver.navigate().to("https://www.youtube.com");
        driver.navigate().back();
        driver.navigate().back();

        String actualUrl = driver.getCurrentUrl();
        if(actualUrl.contains("www.amazon.com")){
            System.out.println("PASSED");
        }else System.out.println("FAILED ");

        System.out.println("Sayfanin konumu : " +driver.manage().window().getPosition());
        System.out.println("Sayfanin boyutlari :" +driver.manage().window().getSize());
        driver.manage().window().setSize(new Dimension(600,600));
        driver.manage().window().setPosition(new Point(50,50));

        Dimension actualYeniSize = driver.manage().window().getSize();
        if (actualYeniSize.getWidth()==600 && actualYeniSize.getHeight()==600){
            System.out.println("Size Testi Passed");
        }else System.out.println("Size Testi Failed");

        Point actualYeniKonum = driver.manage().window().getPosition();
        if (actualYeniKonum.getX()==50 && actualYeniKonum.getY()==50){
            System.out.println("Konum Testi Passed");
        }else System.out.println("Konum Testi Failed");
        driver.close();
    }
}
