package technostudyB7.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import technostudyB7.Utilities.UtilityClass;

import java.util.ArrayList;
import java.util.List;

public class FindElementExample2 extends UtilityClass {
    public static void main(String[] args) {
        /**1- Go to https://www.saucedemo.com/
         2- login with valid credentials
         3- Add 3 random products to the cart
         4- Click on the cart
         5- Click on the Check Out button
         6- Fill the form and click on Continue
         7- Check if you see your products*/

        driver.get("https://www.saucedemo.com/");
//
//        WebElement userNameButton= driver.findElement(By.xpath("//input[@id='user-name')"));
//        userNameButton.sendKeys("standard_user");
//        WebElement passwordButton= driver.findElement(By.xpath(" //input[@name='password']"));
//        passwordButton.sendKeys("secret_sauce");
//        WebElement loginButton =driver.findElement(By.xpath("//input[@data-test='login-button']"));
//        loginButton.click();
        WebElement userNameButton= driver.findElement(By.xpath("//input[@class='input_error form_input']"));
        userNameButton.sendKeys("standard_user");
        WebElement passwordButton= driver.findElement(By.xpath(" //input[@type='password']"));
        passwordButton.sendKeys("secret_sauce");
        WebElement loginButton =driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();
        List<WebElement> inventoryItems =driver.findElements(By.cssSelector(".inventory_item_name"));
        List<String>inventoryItemNames =new ArrayList<>();
        List<Integer>indexList= new ArrayList<>();
        //TODO: complete and explain this part

        while (inventoryItemNames.size()<3){
            int randomIndex = (int) (Math.random()*inventoryItems.size());
            if (indexList.contains(randomIndex)){
                continue;
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            indexList.add(randomIndex);
            inventoryItemNames.add(inventoryItems.get(randomIndex).getText());

            inventoryItems.get(randomIndex).click();
            WebElement addCartButton=driver.findElement(By.xpath("//button[text()='Add to cart']"));
            addCartButton.click();
            driver.navigate().back();
        }
        WebElement cartIcon = driver.findElement(By.className("shopping_cart_badge"));
        cartIcon.click();
        WebElement checkoutButton=driver.findElement(By.id("checkout"));
        checkoutButton.click();
        WebElement naneInput=driver.findElement(By.id("first-name"));
        naneInput.sendKeys("john");
        WebElement lastNAmeInput=driver.findElement(By.id("last-name"));
        lastNAmeInput.sendKeys("snow");
        WebElement zipCode =driver.findElement(By.id("postal-code"));
        zipCode.sendKeys("444444");
        WebElement continuee=driver.findElement(By.id("continue"));
        continuee.click();
      List<WebElement>checkOutItemsList= driver.findElements(By.className("inventory_items_name"));

      for (WebElement product: checkOutItemsList){
          System.out.println(inventoryItemNames.contains(product.getText()));
      }








    }
}
