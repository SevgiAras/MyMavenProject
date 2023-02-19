package technostudyB7.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import technostudyB7.Utilities.UtilityClass;

public class SendKeysAction extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/auto-complete");
        WebElement input =driver.findElement(By.cssSelector("div[class=\"auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3\"]"));
        Actions actions=new Actions(driver);
        Action useShiftKeyAction =actions.moveToElement(input).click().keyDown(Keys.SHIFT).sendKeys("s").keyUp(Keys.SHIFT).sendKeys("ena").build();
        useShiftKeyAction.perform();

        quitDriver(30);
    }
}
