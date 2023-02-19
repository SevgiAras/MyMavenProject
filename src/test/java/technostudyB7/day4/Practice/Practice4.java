package technostudyB7.day4.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import technostudyB7.Utilities.UtilityClass;

public class Practice4 extends UtilityClass {
/** Navigate to https://www.phptravels.net
 * Click on Account button
 * Click on Customer Sign Up
 * Fill the form
 * Check the "I am not robot" check box
 * Click on Sign Up button
 * Check if the title is "Login - PHPTRAVELS"
 * Enter same login information that you used during registration and click login
 * Verify the welcome message contains the first name that you used during registration then close the browser
 *
 * Note: You can use any locator you want.
 */
public static void main(String[] args) throws InterruptedException {
    driver.get("https://www.phptravels.net");

   WebElement dropAccountButton = driver.findElement(By.xpath("//button[@id='ACCOUNT']"));
dropAccountButton.click();
 WebElement signUpButton = driver.findElement(By.xpath("//a[text()='Customer Signup']"));
 signUpButton.click();

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
WebElement accountTypes =driver.findElement(By.xpath("//label[text()='Account Type']"));
accountTypes.click();

WebElement accountButton  =driver.findElement(By.xpath("//span[text()='Customer']"));
//Select selectCustomer  = new Select(accountButton);
//selectCustomer.selectByVisibleText("Customer");
accountButton.click();
WebElement customerBtn=driver.findElement(By.xpath("//li[@id='select2-account_type-result-container']"));
customerBtn.click();
//<span class="select2-selection__rendered" id="select2-account_type-container" role="textbox"
// aria-readonly="true" title="Customer">Customer</span>
Thread.sleep(2000);
//<button type="submit" id="button" class="btn btn-default btn-lg btn-block effect ladda-button waves-effect"
// data-style="zoom-in"><span class="ladda-label">Signup</span><span class="ladda-spinner"></span></button>
WebElement signUpFinish =driver.findElement(By.xpath("//button[@id='button']"));
signUpFinish.click();



}

}
