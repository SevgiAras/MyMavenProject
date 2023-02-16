package technostudyB7.day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class UrlToBe {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        WebDriverWait wait =new WebDriverWait(driver,10);
        driver.manage().window().maximize();

        driver.get("https://www.seleniumeasy.com");


        driver.navigate().to("https://www.amazon.com/");

        wait.until(ExpectedConditions.urlToBe("https://www.amazon.com/"));







    }


    }


