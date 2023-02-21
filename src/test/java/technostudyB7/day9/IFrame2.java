package technostudyB7.day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.Utilities.UtilityClass;

public class IFrame2 extends UtilityClass {
    public static void main(String[] args) {
    /*
    * Type your name in the input box
    * click the check box
    * print "Not a friendly Topic"
    * */



        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);
        WebElement nameInput= driver.findElement(By.tagName("input"));
        nameInput.sendKeys("sevgi");
        driver.switchTo().frame(0);

        WebElement checBox= driver.findElement(By.xpath("//input[@id='a']"));
        checBox.click();
        driver.switchTo().defaultContent();
        WebElement header = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
        System.out.println(header.getText());

        quitDriver(4);
    }
}
