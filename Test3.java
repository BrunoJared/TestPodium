package Test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test3 {

    @Test
    public void Test3() {

        /*This test will access the section Pricing by Mega Menu and request a quote sending the form with the
        respective requisition  informationn*/

        System.setProperty("webdriver.chrome.driver", "/Users/User/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.podium.com/");

        driver.findElement(By.xpath("//*[@id=\"theme-white\"]/nav/div/div[1]/ul/li[5]/a")).click();

        //Form
        driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Bruno" + Keys.TAB); // First Field
        driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Jared" + Keys.TAB);  // Second Field
        driver.findElement(By.xpath("//*[@id=\"Company\"]")).sendKeys("Testing" + Keys.TAB);  // Third Field
        driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("brunojared7@gmail.com" + Keys.TAB);  // Fourth Field
        driver.findElement(By.xpath("//*[@id=\"MobilePhone\"]")).sendKeys("0000000" + Keys.TAB);

        driver.findElement(By.xpath("//*[@id=\"pricing-page\"]/div/div[1]/div[2]/div/form[2]/input[6]")).click();


        driver.close();



    }

}
