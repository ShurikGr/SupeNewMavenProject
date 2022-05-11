import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
public class SeleniumTest {


    @Test
    public void testShowMessage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver = new ChromeDriver();

        driver.get("https://crossbrowsertesting.github.io/selenium_example_page.html");

        driver.manage().timeouts().implicitlyWait(1500,
                TimeUnit.MILLISECONDS);

        WebElement searchButton =
                driver.findElement(By.id("btn"));

        searchButton.click();

        WebElement searchText =
                driver.findElement(By.id("button-message"));

        WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"myform\"]/input[1]"));
        searchBox.sendKeys("Привет");

        WebElement searchButton1 =
                driver.findElement(By.name("checkbox"));

        searchButton1.click();

        WebElement searchButton2 =
                driver.findElement(By.id("dropdown"));

        searchButton2.click();

        WebElement searchButton3 =
                driver.findElement(By.xpath("//*[@id=\"dropdown\"]/option[4]"));

        searchButton3.click();

        WebElement searchButton4 =
                driver.findElement(By.name("radio"));

        searchButton4.click();


        Thread.sleep(1000);

//        driver.close();
//        driver.quit();
    }


}
