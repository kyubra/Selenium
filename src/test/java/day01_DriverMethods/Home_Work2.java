package day01_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Home_Work2 {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Users/kubraarslan/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com");
        System.out.println("Onceki konum : " +driver.manage().window().getPosition());
        System.out.println("Onceki size : "+driver.manage().window().getSize());
        driver.manage().window().setPosition(new Point(80,12));
        driver.manage().window().setSize(new Dimension(800,600));

        Dimension currentSize = driver.manage().window().getSize();
        if (currentSize.getWidth() == 800 && currentSize.getHeight()==600){
            System.out.println("Size test Passed");
        }else System.out.println("Size Test Failed");

        Point cuurentPosition =driver.manage().window().getPosition();
        if(cuurentPosition.getX()==80 && cuurentPosition.getY()== 12){
            System.out.println("Position Test Passed");
        }else System.out.println("Position Test Failed ");



    }
}