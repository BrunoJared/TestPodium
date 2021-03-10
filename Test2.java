package Test;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test2 {
    @Test
    public void test2()  {

        /* this test open the section automotive and execute the function Watch Demo*/


        System.setProperty("webdriver.chrome.driver", "/Users/User/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        driver.get("https://www.podium.com/automotive/");


        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div[1]/div/div[2]/div[2]/div[1]/a")).click();





        driver.close();
    }
}

