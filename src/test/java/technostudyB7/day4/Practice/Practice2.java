package technostudyB7.day4.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice2 {
    /**
     * Navigate to "http://tutorialsninja.com/demo/"
     * Click on Laptops & Notebooks
     * Click on Show All Laptops & Notebooks
     * Sort the products according to their price(Lowest first)
     * Click on the second one.
     * Click on the add to cart
     * check if you see the success message
     * */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://tutorialsninja.com/demo/");
        //<a href="http://tutorialsninja.com/demo/index.php?route=product/category&amp;path=18"
        // class="dropdown-toggle" data-toggle="dropdown"
        // aria-expanded="false">Laptops &amp; Notebooks</a>
        WebElement laptopButton =driver.findElement(By.linkText("Laptops & Notebooks"));
        laptopButton.click();

        //<a href="http://tutorialsninja.com/demo/index.php?route=product/category&amp;path=18"
        // class="see-all">Show All Laptops &amp; Notebooks</a>
        WebElement showsAllLaptops = driver.findElement(By.linkText("Show All Laptops & Notebooks"));
        showsAllLaptops.click();

        //id="input-sort"
        WebElement sortButton= driver.findElement(By.id("input-sort"));
        sortButton.click();

        Select sortButtonSelect =new Select(sortButton);
        sortButtonSelect.selectByVisibleText("Price (Low > High)");
        //<img src="http://tutorialsninja.com/demo/image/cache/catalog/demo/macbook_1-228x228.jpg"
        // alt="MacBook" title="MacBook" class="img-responsive">
        WebElement macBook = driver.findElement(By.linkText("MacBook"));
        macBook.click();

        //<button type="button" id="button-cart" data-loading-text="Loading..."
        // class="btn btn-primary btn-lg btn-block">Add to Cart</button>

        //WebElement chartButton = driver.findElement(By.id("button-cart"));
        //chartButton.click();
        WebElement addToCartButton = driver.findElement(By.id("button-cart"));
        addToCartButton.click();
  //<div class="alert alert-success alert-dismissible">Success: You have added <a href="http://tutorialsninja.com/demo/index.php?route=product/product&amp;product_id=43">MacBook</a>
        // to your <a href="http://tutorialsninja.com/demo/index.php?route=checkout/cart">shopping cart</a>!<button type="button" class="close"
        // data-dismiss="alert">×</button></div>
       // WebElement successMessage = driver.findElement(By.cssSelector("div[id='product-product']>div"));
       // System.out.println(successMessage.getText().contains("success"));
        WebElement success = driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']"));

    }
}
