package technostudyB7.day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class DropDownMenu {
    public static void main(String[] args) throws InterruptedException {
        //https://demo.seleniumeasy.com/basic-select-dropdown-demo.html

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
        //<select class="form-control" id="select-demo">
        //				<option value="" selected="" disabled="">Please select</option>
        //				 <option value="Sunday">Sunday</option>
        //				  <option value="Monday">Monday</option>
        //				  <option value="Tuesday">Tuesday</option>
        //				  <option value="Wednesday">Wednesday</option>
        //				  <option value="Thursday">Thursday</option>
        //				  <option value="Friday">Friday</option>
        //				  <option value="Saturday">Saturday</option>
        //			  </select>

        WebElement dropDown = driver.findElement(By.id("select-demo"));

        //create Select class object
        Select select =new Select(dropDown);
        select.selectByIndex(1);
        Thread.sleep(1000);
        select.selectByValue("Tuesday");
        Thread.sleep(1000);
        select.selectByVisibleText("Monday");

        String selectedOption = select.getFirstSelectedOption().getText();
        String expected = "Monday";
        if (selectedOption.equals(expected)){
            System.out.println("Pass");
        }else {
            System.out.println("FAiled");

        }
        driver.quit();

    }
}
