package technostudyB7.day10;

import org.openqa.selenium.JavascriptExecutor;
import technostudyB7.Utilities.UtilityClass;

public class Scroll extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://www.youTube.com/");

        wait(3);
        JavascriptExecutor js= (JavascriptExecutor) driver;
        // window.scrollBy(int x , int y) //positive y value means scroll down,negative y value scroll up and
                  // positive x value means scroll right, negative x value means scroll  left by specified pixel
        // window.scrollTo(0, "document.body,.scrollHeight") scroll to the end of the page
        // *argument[0].scrollIntToView(true):"// Scroll to the specified element

        js.executeScript("window.scrollBy(0, 2000)");//scrolled down by 3000pixels
        wait(2);
        js.executeScript("window.scrollBy(0, -2000)");//scrolled up by 3000pixels
        quitDriver(2);


    }
}
