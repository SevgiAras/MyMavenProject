package technostudyB7.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisabled {
    public static  void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        /*
        1.visit a page
        2.locate the enable button
        3.click on the button
        4.verify if it is enabled
         */
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");

        //<form id="input-example
        //<h4 class="subheader">Enable/disable</h4>
        //<button autocomplete="off" type="button" onclick="swapInput()">Enable</button>
        WebElement enableButton= driver.findElement(By.cssSelector("#input-example>button"));
        WebElement inputField = driver.findElement(By.cssSelector("#input-example>input"));
        boolean isInputFieldEnabled= inputField.isEnabled();
        System.out.println(" before click on enable button:" +isInputFieldEnabled);
        enableButton.click();
        Thread.sleep(5000);
        boolean isInputFieldEnabled2= inputField.isEnabled();
        System.out.println("after click on enable button:"+ isInputFieldEnabled2);





    }

}
