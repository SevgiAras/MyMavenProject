package technostudyB7.day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class FacebookSignUP {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        //<input type="text" class="inputtext _58mg _5dba _2ph-"
        // data-type="text" name="firstname" value=""
        // aria-required="true" placeholder=""
        // aria-label="First name" id="u_3_b_L2"
        // tabindex="0" aria-describedby="js_3d">

        //<a role="button" class="_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy"
        // href="#" ajaxify="/reg/spotlight/" id="u_0_0_vX"
        // data-testid="open-registration-form-button" rel="async">Create new account</a>

        //<input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text"
        // name="lastname" value="" aria-required="true" placeholder=""
        // aria-label="Last name" id="u_e_d_KX">

        //<input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="reg_email__" value=""
        // aria-required="true" placeholder="" aria-label="Mobile number or email" id="u_2_g_WB">
        //<input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="reg_email_confirmation__" value=""
        // aria-required="true" placeholder="" aria-label="Re-enter email" id="u_2_j_GU">

        //<input type="password" class="inputtext _58mg _5dba _2ph-" data-type="password" autocomplete="new-password" name="reg_passwd__"
        // id="password_step_input" aria-required="true" placeholder="" aria-label="New password">

        //
        WebElement createAccountButton = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createAccountButton.click();

        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Sevgi");
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("akca");
        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("web@gmail.com");
        WebElement reEmailConfirm = driver.findElement(By.name("reg_email_confirmation__"));
        reEmailConfirm.sendKeys("web@gmail.com");
        WebElement password = driver.findElement(By.name("reg_passwd__"));
        password.sendKeys("1234qwe");

        WebElement monthDropDown =driver.findElement(By.id("month"));
        Select select =new Select(monthDropDown);
        select.selectByValue("4");

        WebElement dayDropDown =driver.findElement(By.id("day"));
        Select selectDay =new Select(dayDropDown);
        selectDay.selectByValue("1");

        WebElement yearDropDown =driver.findElement(By.id("year"));
        Select selectYear = new Select(yearDropDown);
        selectYear.selectByVisibleText("2010");
        WebElement radioButton = driver.findElement(By.cssSelector("input[value='1']"));
        radioButton.click();
        WebElement signUpButton = driver.findElement(By.cssSelector("button[name='websubmit']"))
                ;
        String signUpButtonText = signUpButton.getText();
        System.out.println(signUpButtonText);
















   // WebElement myAccountButton = driver.findElement(By.cssSelector("a[href='http://tutorialsninja.com/demo/index.php?route=account/account']"));
//        myAccountButton.click();
//
//        WebElement registerButton = driver.findElement(By.cssSelector("a[href='http://tutorialsninja.com/demo/index.php?route=account/register"));
//        registerButton.click();
//
//        WebElement name = driver.findElement(By.id("input-firstname"));
//        name.sendKeys("Techno");
//        WebElement lastname = driver.findElement(By.id("input-lastname"));
//        lastname.sendKeys("Study");
//        WebElement email = driver.findElement(By.id("input-email"));
//        email.sendKeys("technostudy@gmail.com");
//        WebElement phone = driver.findElement(By.id("input-telephone"));
//        phone.sendKeys("5698754256");
//        WebElement password = driver.findElement(By.id("input-password"));
//        password.sendKeys("techno1234");
//        WebElement passwordConfirm = driver.findElement(By.id("input-confirm"));
//        passwordConfirm.sendKeys("techno1234");
//        WebElement checkbox = driver.findElement(By.cssSelector("input[type='checkbox']"));
//        checkbox.click();
//        WebElement continueButton = driver.findElement(By.cssSelector("input[class='btn btn-primary']"));
//        continueButton.click();
//
//        WebElement successMessage = driver.findElement(By.cssSelector("div[id='content']>h1"));
//
//        if (successMessage.getText().equals("Your Account Has Been Created!")){
//            System.out.println("Your test has passed");
//            driver.quit();
//        }else {
//            System.out.println("Your test has not passed");
//            driver.quit();
    }
}
