package technostudyB7.day11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import technostudyB7.Utilities.UtilityClass;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class RobotClass extends UtilityClass {
    public static void main(String[] args) throws AWTException {
        driver.get("http://demo.guru99.com/test/upload/");
        wait(3);
//        Robot robot =new Robot();
//
//        for (int i=0; i<21; i++){
//            robot.keyPress(KeyEvent.VK_TAB);
//            robot.keyRelease(KeyEvent.VK_TAB);
//            wait(1);
//        }
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);
//        wait(2);
//
//        StringSelection stringSelection =new StringSelection("\"C:\\Users\\user\\OneDrive\\Desktop\\A list Of will do\"");
//        Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
//        clipboard.setContents(stringSelection,stringSelection);
//
//
//        robot.keyPress(KeyEvent.VK_CONTROL);
//        robot.keyPress(KeyEvent.VK_V);
//        robot.keyRelease(KeyEvent.VK_V);
//        wait(1);
//        robot.keyRelease(KeyEvent.VK_CONTROL);
//     robot.keyPress(KeyEvent.VK_ENTER);
//     WebElement checkBox =driver.findElement(By.className("field_check"));
//     checkBox.click();
//
//     WebElement submitButton = driver.findElement(By.id("submitbutton"));
//     submitButton.click();
//        WebDriverWait wait=new WebDriverWait(driver, 10);
//        WebElement testMssg= driver.findElement(By.id("res"));
//
//        wait.until(ExpectedConditions.visibilityOf(testMssg));
//        System.out.println(testMssg.getText().contains("succesfully"));
//



        Robot robot=new Robot();


        for (int i = 0; i <21 ; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            wait(1);
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
     StringSelection stringSelection =new StringSelection("\"C:\\Users\\user\\OneDrive\\Desktop\\A list Of will do\"");

        Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection,stringSelection);
        wait(2);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        wait(1);

        WebElement checkBox = driver.findElement(By.className("field_check"));
        checkBox.click();

        WebElement submitButton= driver.findElement(By.id("submitbutton"));
        submitButton.click();

        WebDriverWait wait=new WebDriverWait(driver,10);
        WebElement successMessage= driver.findElement(By.id("res"));

        wait.until(ExpectedConditions.visibilityOf(successMessage));



        System.out.println(successMessage.getText().contains("successfully"));

    }
}
