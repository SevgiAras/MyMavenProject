package technostudyB7.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionDragAndDrop extends UtilityClass{
    public static void main(String[] args) {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        /*
        <div class="dragableBox" id="box3" dragableelement="2" style="visibility: visible;">Washington</div>
         */
        WebElement washington = driver.findElement(By.id("box3"));
        WebElement unitedStates = driver.findElement(By.id("box103"));
        Actions actions =new Actions(driver);
        Action dragAndDropWashington =actions.dragAndDrop(washington,unitedStates).build();
        dragAndDropWashington.perform();

    }
}
