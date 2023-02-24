package technostudyB7.day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.Utilities.UtilityClass;

import java.util.List;
import java.util.Set;

public class HowWndowsOpenAndClose extends UtilityClass {
    public static void main(String[] args) {
      //we opened the link and got the tittle  one by one
      //we closed

        String mainTabId = driver.getWindowHandle();
        List<WebElement> links = driver.findElements(By.cssSelector("a[target='_blank']"));
        for (WebElement link : links) {
            if (!link.getAttribute("href").contains("mailto")) {
                link.click();
                Set<String> idList = driver.getWindowHandles();

                for (String id : idList) {
                    if (!id.equals(mainTabId)) {
                        driver.switchTo().window(id);
                        System.out.println(driver.getTitle());
                        driver.close();
                    }
                    wait(2);

                }
            }

        }
    }
}
