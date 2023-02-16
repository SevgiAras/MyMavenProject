package technostudyB7.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Task2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
        driver.manage().window().maximize();
        int i= 5;
        int k=7;
        /*<input type="text" class="form-control" placeholder="Enter value" id="sum1"> */
        /* <input type="text" class="form-control" placeholder="Enter value" id="sum2"> */
        /* <button type="button" onclick="return total()" class="btn btn-default">Get Total</button>  */
        WebElement firstNumber = driver.findElement(By.id("sum1"));
        firstNumber.sendKeys("5");

        WebElement secondNumber = driver.findElement(By.id("sum2"));
        secondNumber.sendKeys("7");

        WebElement total = driver.findElement(By.cssSelector("button[onclick='return total()']"));
        total.click();


        WebElement sum =driver.findElement(By.id("display"));
        System.out.println(sum.getText());

        Integer expSum=12;
        String actSum= sum.getText();
        if (expSum.equals(actSum)){
            System.out.println("verification is done :PAss");
            System.out.println(actSum);
        }else {
            System.out.println("verification is failed");
            //System.out.println("verification is ."+ actSum);
            System.out.println(sum.getText());
        }



    }
}
