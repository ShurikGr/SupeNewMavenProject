import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MainTest {

    @Test
    public void testFirstSelenium() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver = new ChromeDriver();

        driver.get("https://google.com");

        driver.getTitle(); // => "Google"

        driver.manage().timeouts().implicitlyWait(500,
                TimeUnit.MILLISECONDS);

        WebElement consent =
                driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div"));
        consent.click();


        WebElement searchBox = driver.findElement(By.name("q"));
//        WebElement searchButton = driver.findElement(By.name("btnK")); // Не сработала, так как их 2 на странице.
        WebElement searchButton =
                driver.findElement(By.xpath("//div[3]/center/input[1]\n"));


        searchBox.sendKeys("Selenium");
        searchButton.click();

        Thread.sleep(1000);

        searchBox = driver.findElement(By.name("q"));
        searchBox.getAttribute("value"); // => "Selenium"

        Thread.sleep(1000);
        driver.close();
        driver.quit();
    }


}

