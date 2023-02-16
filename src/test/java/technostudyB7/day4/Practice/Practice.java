package technostudyB7.day4.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Practice {
    /* Click on MyAccount
     * Click on Register
     * Fill the form
     * Accept the privacy policy
     * Click on Continue*/
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://tutorialsninja.com/demo/");

        //By.cssSelector("a[href='http://tutorialsninja.com/demo/index.php?route=account/account']"
       WebElement myAccount
               = driver.findElement(By.cssSelector("a[href='http://tutorialsninja.com/demo/index.php?route=account/account']"));
       myAccount.click();

       //<a href="http://tutorialsninja.com/demo/index.php?route=account/register">Register</a>
//<a href="http://tutorialsninja.com/demo/index.php?route=account/register">Register</a>
        WebElement registerAccount
                = driver.findElement(By.cssSelector("a[href='http://tutorialsninja.com/demo/index.php?route=account/register"));
       registerAccount.click();
       //<input type="text" name="firstname" value="" placeholder="First Name" id="input-firstname" class="form-control">
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Maria");

        //<input type="text" name="lastname" value="" placeholder="Last Name" id="input-lastname" class="form-control">
        WebElement lastName =driver.findElement(By.name("lastname"));
        lastName.sendKeys("alara");
        //<input type="email" name="email" value="" placeholder="E-Mail" id="input-email" class="form-control">
        WebElement eMail= driver.findElement(By.name("email"));
        eMail.sendKeys("mary212@gmail.com");
        //<input type="tel" name="telephone" value="" placeholder="Telephone" id="input-telephone" class="form-control">
        WebElement tlePhoneNumber =driver.findElement(By.name("telephone"));
        tlePhoneNumber.sendKeys("1234567");
        //<input type="password" name="password" value="" placeholder="Password" id="input-password" class="form-control">
        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("sdfghjkl");
        //<input type="password" name="password" value="" placeholder="Password" id="input-password" class="form-control">
        WebElement passwConfirm = driver.findElement(By.id("input-confirm"));
        passwConfirm.sendKeys("sdfghjkl");

        //<label class="radio-inline">
        //                <input type="radio" name="newsletter" value="0" checked="checked">
      //                No</label>

       //<input type="submit" value="Continue" class="btn btn-primary">

        WebElement checkbox = driver.findElement(By.cssSelector("input[type='checkbox']"));
        checkbox.click();
        WebElement continueButton = driver.findElement(By.cssSelector("input[class='btn btn-primary']"));
        continueButton.click();
        //<div id="content" class="col-sm-9">
        //      <h1>Your Account Has Been Created!</h1>
        //      <p>Congratulations! Your new account has been successfully created!</p> <p>You can now take advantage of member privileges to enhance your online shopping experience with us.</p> <p>If you have ANY questions about the operation of this online shop, please e-mail the store owner.</p> <p>A confirmation has been sent to the provided e-mail address. If you have not received it within the hour, please <a href="http://tutorialsninja.com/demo/index.php?route=information/contact">contact us</a>.</p>
        //      <div class="buttons">
        //        <div class="pull-right"><a href="http://tutorialsninja.com/demo/index.php?route=account/account" class="btn btn-primary">Continue</a></div>
        //      </div>
        //      </div>
        WebElement message =driver.findElement(By.cssSelector("div[id='content']>h1"));

        if (message.getText().equals("Your Account Has Been Created!")){
            System.out.println("your account test has passed");
  driver.quit();

        }else{

            System.out.println("your account has not failed");
            System.out.println(message.getText());
            driver.quit();

        }














    }
    }