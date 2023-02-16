package technostudyB7.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchGoogle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();


        //<title>bamboo pen - Google Search</title>
        /*
        1- go to google page
        2-locate search box
        3-send bamboo pen keys to the box
        4-get the tittle of rhe new opened page
        5- do verification with actual one and expected one
         */

       /*
       <input class="gLFyf" jsaction="paste:puy29d; mouseenter:MJEKMe; mouseleave:iFHZnf;"
       maxlength="2048" name="q" type="text" aria-autocomplete="both" aria-haspopup="false"
        autocapitalize="off" autocomplete="off" autocorrect="off" role="combobox" spellcheck="false"
         value="bamboo pen" aria-label="Search" data-ved="0ahUKEwjtwPHqn5H9AhVhIjQIHfFcBoMQ39UDCAs">/*/


        String input= "bamboo pen";
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(input+ Keys.ENTER);

        //verification
        String actualTitle =driver.getTitle();
        String expectedTittle= "bamboo pen- Google search";

      if (expectedTittle.equals(actualTitle)){
          System.out.println("verification  is done:Pass");
      }else {
          System.out.println("Verification is failed ");
          System.out.println("verification is : "+ actualTitle);
      }



    }
}
