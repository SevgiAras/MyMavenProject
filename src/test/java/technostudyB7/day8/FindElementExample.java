package technostudyB7.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import technostudyB7.Utilities.UtilityClass;

import java.util.List;

public class FindElementExample extends UtilityClass {
    /**1- Go to https://www.saucedemo.com/
     2- login with valid credentials
     3- Click on Sauce Labs Backpack and add to the cart
     4- Click on Back To Products
     5- Click on Sauce Labs Bolt T-Shirt and add to the cart
     6- Click on the cart
     7- Click on the Check Out button
     8- Fill the form and click on Continue
     9- Check if you see your products*/

    public static void main(String[] args) {
        driver.get("https://www.saucedemo.com/");

        WebElement userNameButton= driver.findElement(By.xpath("//input[@class='input_error form_input']"));
        userNameButton.sendKeys("standard_user");
      WebElement passwordButton= driver.findElement(By.xpath(" //input[@type='password']"));
      passwordButton.sendKeys("secret_sauce");
      WebElement loginButton =driver.findElement(By.xpath("//input[@type='submit']"));
       loginButton.click();
       WebElement product1 =driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
       product1.click();
       WebElement cartButton= driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
       cartButton.click();
       //WebElement backButton=driver.findElement(By.xpath("//button[@id='back-to-products']"));
       //backButton.click();
        driver.navigate().back();
       WebElement product2=driver.findElement(By.xpath("//div[@class='inventory_item_desc']"));
       product2.click();
       WebElement cartButton2=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
       cartButton2.click();
       WebElement cartButton3=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
       cartButton3.click();
       WebElement checkoutButton=driver.findElement(By.xpath("//button[@name='checkout']"));
       checkoutButton.click();

       WebElement firstName=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
       firstName.sendKeys("ss");
       WebElement lastName=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
       lastName.sendKeys("tt");
       WebElement postalCode=driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']"));
       postalCode.sendKeys("trgtrr");
       WebElement continueButton=driver.findElement(By.xpath("//input[@type='submit']"));
       continueButton.click();

        List<WebElement>inventoryItemNames = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(inventoryItemNames.get(1).getText().equals(product1));
        System.out.println(inventoryItemNames.get(1).getText().equals(product2));
        quitDriver(2);
    }
}
