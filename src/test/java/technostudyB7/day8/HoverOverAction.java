package technostudyB7.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import technostudyB7.Utilities.UtilityClass;

import java.time.Duration;

public class HoverOverAction extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://www.etsy.com/");



        /*
        * Hover over Jewelery
        * earring
        * click on Clip-On Earrings
        * Check if the url has Clip-On Earrings
        * */
//<span id="catnav-primary-link-10855" class="wt-text-black"

        WebElement Jewelery = driver.findElement(By.id("catnav-primary-link-10855"));
        Actions actions =new Actions(driver);
        Action hoverOverJewelery =actions.moveToElement(Jewelery).build();
        hoverOverJewelery.perform();

//<span id="catnav-primary-link-10855"
        WebDriverWait wait =new WebDriverWait(driver, 10);
        WebElement earrings = driver.findElement(By.id("catnav-primary-link-10855"));
        wait.until(ExpectedConditions.visibilityOf(earrings));
        Action hoverOverEarringAction=actions.moveToElement(earrings).build();
        hoverOverEarringAction.perform();
        //<a id="catnav-l3-10904" class="wt-display-block wt-text-black wt-text-link-no-underline "
        // href="/c/jewelry/earrings/clip-on-earrings?ref=catnav-10855" role="menuitem" tabindex="-1">
        //                                    Clip-On Earrings
        //                                </a>

        WebElement clipOnEarring = driver.findElement(By.xpath("//*[@id=\"desktop-category-nav\"]/div[2]/div/div[1]/div/div/div/section[5]/div/ul[2]/li[3]"));
        wait.until(ExpectedConditions.visibilityOf(clipOnEarring));
        clipOnEarring.click();
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl.contains("clip-on-earrings"));




    }
}
