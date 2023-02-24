package technostudyB7.day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.Utilities.UtilityClass;

import java.util.Collections;
import java.util.Set;

public class Window extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://www.selenium.dev/");

        String mainPageId = driver.getWindowHandle();

        WebElement registerNowButton = driver.findElement(By.xpath("//a[text()='Get Tickets']"));
        registerNowButton.click();

        Set<String> allIds = Collections.singleton(driver.getWindowHandle());
        for (String id: allIds){
            if (!id.equals(mainPageId)){
                driver.switchTo().window(id);
            }
        }
       // driver.close();// we closed active window.
       driver.switchTo().window(mainPageId);//we must switch to yhe other window to use it
                                             //After we closed the active window
        System.out.println(driver.getTitle());

    }
}
