package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C04_ClassWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/kubraarslan/Documents/selenium libraries/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //   a.web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com");
       //Search(ara) “city bike”
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike", Keys.ENTER);
      //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın

        List<WebElement>aramaSonucu =driver.findElements(By.className("sg-col-inner"));

        System.out.println("Arama Sonuc Yazisi"+aramaSonucu.get(0).getText());

        //Arama sonuc yazusunu konsola yazdiriniz.
        String [] sonucSayisi = aramaSonucu.get(0).getText().split(" ");
        System.out.println("Arama Sonucu Yazisi2 = " +sonucSayisi[2]);

        //Sonuc Sayisini Lamda Ile Yazdirin

        Arrays.stream(aramaSonucu.get(0).getText().split(" ")).limit(3).skip(2).forEach(System.out::println);



        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        List<WebElement> ilkWE = driver.findElements(By.className("s-image"));
        ilkWE.get(0).click();



    }

}
