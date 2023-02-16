package technostudyB7.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookAddressVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        String email= "sevgi012127";
        String password ="12345";



        driver.get("https://www.facebook.com");
        /*
        <input type="text" class="inputtext _55r1 _6luy" name="email" id="email"
        data-testid="royal_email" placeholder="Email or phone number" autofocus="1" aria-
        label="Email or phone number">
         */
        WebElement emailBox = driver.findElement(By.id("email"));
        emailBox.sendKeys(email);
        /*
        <input type="text" class="inputtext _55r1 _6luy" name="email" id="email"
         data-testid="royal_email" placeholder="Email or phone number" autofocus="1" aria-
         label="Email or phone number">
         */
        WebElement passwordBox = emailBox.findElement(By.cssSelector("input[type='password]"));
        passwordBox.sendKeys(password);
         WebElement logginButton =driver.findElement(By.name("login"));
         logginButton.click();

         driver.quit();
       // driver.close();

    }
}
