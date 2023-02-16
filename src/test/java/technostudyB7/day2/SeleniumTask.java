package technostudyB7.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTask {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
        driver.manage().window().maximize();

       WebElement messageBox = driver.findElement(By.id("user-message"));
       messageBox.sendKeys("Hello ");
       WebElement buttonBox = driver.findElement(By.cssSelector("button[class='btn btn-default']"));
       buttonBox.click();

       WebElement result =  driver.findElement(By.id("display"));
        System.out.println(result.getText());

        String expResult="Hello";
        String actResult=result.getText();


        if (expResult.equals(actResult)){
            System.out.println("it is verified :Pass");
        }else {
            System.out.println("verification is Failed");
            System.out.println("verification is:"+ actResult);

            driver.quit();

        }


    }
}
