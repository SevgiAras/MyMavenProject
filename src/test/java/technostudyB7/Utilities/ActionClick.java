package technostudyB7.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClick extends UtilityClass {
    public static void main(String[] args) {
        /*
        1=what is action class
        action class that we use it for special actions
        2= like what
        however, double click,hold an element,rightclick, drag and drop an element
        control keyboard button[enter, shift...]
        3=how do you use it?
        i create an object of actions class than an action
         */
        driver.get("https://demoqa.com/buttons");

        WebElement  doubleClickButton = driver.findElement(By.id("doubleClickBtn"));
        Actions actions =new Actions(driver);
        Action action= actions.doubleClick(doubleClickButton).build();
        action.perform();

        WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));

        Action rightClickAction = actions.contextClick(rightClickButton).build();
        rightClickAction.perform();

        WebElement clickMeButton = driver.findElement(By.xpath("//button[text()='Click Me']"));
        Action clickMeAction =actions.click(clickMeButton).build();
       clickMeAction.perform();

       //2.Way of using these Actions
        //Dob;eClick
        Action doubleClickAction2= actions.moveToElement(doubleClickButton).doubleClick().build();
        doubleClickAction2.perform();

       //RightClick
        Action rightClick2 = actions.moveToElement(rightClickButton).contextClick().build();
        rightClick2.perform();

        //click me
        Action clickButton2 =actions.moveToElement(clickMeButton).click().build();
        clickButton2.perform();


driver.quit();

    }
}