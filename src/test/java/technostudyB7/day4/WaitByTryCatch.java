package technostudyB7.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitByTryCatch {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
       /*
             T.C
       1.visit the page
       2.Click on start button
       3.get text "hello World"
       */
        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");

        //<div id="start">
        //    <button>Start</button>
        //  </div>
        //<div id="finish" style=""><h4>Hello World!</h4></div>



        WebElement startButton = driver.findElement(By.cssSelector("#start>button"));
        startButton.click();
         String text ="";
         while (text.equals("")){
             try {  WebElement hiddenGetText = driver.findElement(By.cssSelector("#finish>h4"));
                 text=hiddenGetText.getText();
             }catch (NoSuchElementException ex){
                 System.out.println("trying to find the hidden text");
             }
         }
        System.out.println(text);
}
}
