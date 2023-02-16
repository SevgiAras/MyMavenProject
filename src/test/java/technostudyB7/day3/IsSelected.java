package technostudyB7.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
     //<input type="checkbox" id="isAgeSelected" value="">

        /*
        1. visit a page
        2. locate the check box
        3.select box
        4.verify if it is selected
         */

        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
         WebElement checkBox = driver.findElement(By.id("isAgeSelected"));
         checkBox.click();
         Thread.sleep(2000);

         // verification
        if (checkBox.isSelected()){
            System.out.println("Pass");

        }else {
            System.out.println("Failed");

        }
        driver.quit();
    }
}
