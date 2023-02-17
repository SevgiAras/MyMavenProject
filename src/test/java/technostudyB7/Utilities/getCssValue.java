package technostudyB7.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class getCssValue extends UtilityClass{
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com");
        WebElement searchBox =driver.findElement(By.id("inputValEnter"));

        searchBox.getAttribute("autocomplete");//we reached autocomplete attribute
        System.out.println("getAttribute(autocomplete):" +searchBox.getAttribute("autocomplete"));
        searchBox.getAttribute("name");//we reached name attribute
        System.out.println("getAttribute(name): " +searchBox.getAttribute("name"));

        searchBox.getAttribute("id");
        System.out.println(searchBox.getAttribute("id"));

        searchBox.getCssValue("background");//we got background value
        System.out.println(searchBox.getCssValue("background"));
        searchBox.getCssValue("font-size");
        System.out.println(searchBox.getCssValue("font-size"));
        searchBox.getCssValue("font-family");
        System.out.println(searchBox.getCssValue("font-family"));
        searchBox.getCssValue("color");
        System.out.println(searchBox.getCssValue("color"));

    }


}
