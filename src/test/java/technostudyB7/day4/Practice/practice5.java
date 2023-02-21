package technostudyB7.day4.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import technostudyB7.Utilities.UtilityClass;

import java.time.Duration;

public class practice5 extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://www.phptravels.net");

        WebElement dropAccountButton = driver.findElement(By.xpath("//button[@id='ACCOUNT']"));
        dropAccountButton.click();
        WebElement signUpButtonn = driver.findElement(By.xpath("//a[text()='Customer Signup']"));
        signUpButtonn.click();

        WebElement firstNameButton =driver.findElement(By.xpath("//input[@name='first_name']"));
        firstNameButton.sendKeys("neda");
        WebElement lastNAmeButton =driver.findElement(By.xpath("//input[@name='last_name']"));
        lastNAmeButton.sendKeys("Sena");
        WebElement phoneButton =driver.findElement(By.xpath("//input[@name='phone']"));
        phoneButton.sendKeys("123456789");
        WebElement emailButton =driver.findElement(By.xpath("//input[@name='email']"));
        emailButton.sendKeys("sena123@gmail.com");
        WebElement passwordButton =driver.findElement(By.xpath("//input[@name='password']"));
        passwordButton.sendKeys("123456");

        //WebElement iAnNotARobotCheckBox=driver.findElement(By.id("recepcha--anchor"));
      //  iAnNotARobotCheckBox.click();
        WebElement cookiesButton =driver.findElement(By.id("cookie_stop"));
        cookiesButton.click();
        WebElement signUpButton = driver.findElement(By.id("button"));
        WebDriverWait wait=new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(signUpButton));
        signUpButton.click();





//        WebElement accountTypes =driver.findElement(By.xpath("//label[text()='Account Type']"));
//        accountTypes.click();
//
//        WebElement accountButton  =driver.findElement(By.xpath("//span[text()='Customer']"));
//        accountButton.click();
//        WebElement customerBtn=driver.findElement(By.xpath("//li[@id='select2-account_type-result-container']"));
//        customerBtn.click();
//        WebElement signUpFinish =driver.findElement(By.xpath("//button[@id='button']"));
//        signUpFinish.click();



    }
}
