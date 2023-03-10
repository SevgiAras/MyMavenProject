package technostudyB7.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickAndHold extends UtilityClass{
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        WebElement washington =driver.findElement(By.id("box3"));
        WebElement unitedStates = driver.findElement(By.id("box103"));
        Actions actions=new Actions(driver);

        Action clickAndHoldWashington = actions.clickAndHold(washington).moveToElement(unitedStates).release().build();
        clickAndHoldWashington.perform();
Thread.sleep(2000);
        WebElement madrid =driver.findElement(By.id("box7"));
        WebElement spain =driver.findElement(By.id("box107"));

        Action clicAndkHoldMadrid =actions.clickAndHold(madrid).moveToElement(spain).release().build();
        clicAndkHoldMadrid.perform();

    }
}
