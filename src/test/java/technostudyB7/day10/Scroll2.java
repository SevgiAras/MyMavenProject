package technostudyB7.day10;

import org.openqa.selenium.JavascriptExecutor;
import technostudyB7.Utilities.UtilityClass;

import javax.swing.text.Utilities;

public class Scroll2 extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://triplebyte.com/");

        wait(3);
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight);");//scroll to button
        wait(2);
        js.executeScript("window.scrollTo(0,0)");//scrolled to the of the page
        quitDriver(2);
    }
}
