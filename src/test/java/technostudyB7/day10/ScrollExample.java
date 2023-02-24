package technostudyB7.day10;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import technostudyB7.Utilities.UtilityClass;

import java.util.List;

public class ScrollExample extends UtilityClass {
    public static void main(String[] args) {
        /*
        * Go to "https://youTube.com/"'
        * Scroll down until there are at least 300 videos  on the page
        * Print the name of the 100th video
        * */

        driver.get("https://youTube.com/");

       wait(2);
        List<WebElement> videoList = driver.findElements(By.id("video-title"));
        System.out.println(videoList.size());


        while (videoList.size()<100){

       JavascriptExecutor js =(JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0, 500)");
       wait(2);
       videoList =driver.findElements(By.id("video-tittle"));

}

        System.out.println(videoList.size());
        System.out.println(videoList.get(99).                   getText());

        quitDriver(3);


    }
}
