package Test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test1 {
    @Test
    public void test1()  {

        /*This test open the section review by mega menu*/
        System.setProperty("webdriver.chrome.driver", "/Users/User/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        driver.get("https://www.podium.com");

        driver.findElement(By.xpath("//*[@id=\"page\"]/nav/div[2]/div[1]/ul/li[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"page\"]/nav/div[2]/div[1]/ul/li[1]/ul/li[1]/a/div/span")).click();






    }
}

