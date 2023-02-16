package technostudyB7.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FundingElements {
    public static void main(String[] args) throws InterruptedException {


        //set up the browser driver (Selenium gonna knock door of browser driver(chrome driver)
        WebDriverManager.chromedriver().setup();

        // to open the browser
        WebDriver driver =new ChromeDriver();

        //
        driver.get("https://techno.study/");
        Thread.sleep(3000);
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);
        driver.navigate().back();
        driver.navigate().forward();

        //finding the webelement on facebook page(connect with friends and the world around you on facebook.)
        WebElement  sloganTest =driver.findElement(By.className("_8eso"));

        //WebElement sloganTest = driver.findElement(By.className("_8eso"));

       String expSloganTest = "connect with friends and the world around you on facebook.";
       String actSloganTest =  sloganTest.getText();

       if (expSloganTest.equals(actSloganTest)){
           System.out.println("verification is done :PASS");

       }else {
           System.out.println("verification is:FAILED");
           System.out.println("actual slogan text is: " + actSloganTest);
           driver.close();
      }


    }
}
