package technostudyB7.day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import technostudyB7.Utilities.UtilityClass;

public class IFrame3 extends UtilityClass {
    public static void main(String[] args) {
        /*
         * Type your name in the input box
         * click the check box
         * print "Not a friendly Topic"
         *choose the 3rd element from the dropdown menu
         * print "Not aFriendly Topic
        * */
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);

        WebElement nameInput= driver.findElement(By.tagName("input"));
        nameInput.sendKeys("sevgi");

        driver.switchTo().frame(0);

        WebElement checBox= driver.findElement(By.xpath("//input[@id='a']"));
        checBox.click();

        driver.switchTo().defaultContent();

        //WebElement header = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
        //System.out.println(header.getText());

        driver.switchTo().defaultContent().switchTo().frame(1);//we combine 2 switch

        WebElement animals=driver.findElement(By.id("animals"));
        Select select= new Select(animals);
        select.selectByIndex(2);

        driver.switchTo().defaultContent();




    }
}
