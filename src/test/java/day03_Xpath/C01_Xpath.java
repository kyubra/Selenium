package day03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {

public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","/Users/kubraarslan/Documents/selenium libraries/drivers/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//    https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
    driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
//    2- Add Element butonuna basin
    Thread.sleep(3000);
    //WebElement addButonu = driver.findElement(By.xpath("//*[@onclick='addElement()']"));
    WebElement addButonu = driver.findElement(By.xpath("//*[text()='Add Element']"));

    //Xpath kullaniminda locate edecegimiz webelement text'e sahipse yukardaki sekilde kullanabiliriz.

    addButonu.click();

//    3Delete butonu’nun gorunur oldugunu test edin
    WebElement deleteButonu = driver.findElement(By.xpath("//*[@onclick='deleteElement()']"));
    if (deleteButonu.isDisplayed()){
        System.out.println("Test Passed");
    }else System.out.println("Test Failed");
//    4Delete tusuna basin
    Thread.sleep(3000);
    deleteButonu.click();
//    5“Add/Remove Elements” yazisinin gorunur oldugunu test edin

    WebElement addRemoveandElement = driver.findElement(By.xpath("//h3"));
    if(addRemoveandElement.isDisplayed()){
        System.out.println("Test Passed");
    }else System.out.println("Test Failed");

}
}
