package technostudyB7.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import technostudyB7.Utilities.UtilityClass;

public class ArrowKeysAction extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/auto-complete");


        /*  /move to element
        * click on the element
        * type b
        * press doen arrow key
        * press Enter key
        * */

        WebElement input = driver.findElement(By.id("autoCompleteMultipleContainer"));
        Actions actions =new Actions(driver);
        Action typBAction =actions.moveToElement(input).click().sendKeys("b").build();
        typBAction.perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Action arrowKeyAction =actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build();
        arrowKeyAction.perform();

        quitDriver(30);
    }


}
