import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestSample  {
    public static void main(String[] args) {

            // Set the property for webdriver.chrome.driver to be the location to your local              download of chromedriver
            System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");


            // Create new instance of ChromeDriver
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();

            // And now use this to visit Google
            driver.get("http://www.google.bg");

            WebElement button = driver.findElement(By.id("L2AGLb"));
            button.click();


            // Find the text input element by its name
            WebElement element = driver.findElement(By.name("q"));

            // Enter something to search for
            element.sendKeys("Cheese!");

            // Now submit the form
            element.submit();

            //Close the browser
            driver.quit();
    }
}


//public class TestSample  {
//        public static void main(String[] args) {
//        System.setProperty("webdriver.gecko.driver","C://drivers/geckodriver.exe");
//        WebDriver driver = new FirefoxDriver(); //Creating an object of FirefoxDriver
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("https://www.google.com/");
//        WebElement agree = driver.findElement(By.id("L2AGLb"));
//        agree.click();
//        driver.findElement(By.name("q")).sendKeys("Browserstack Guide"); //name locator for text box
////      WebElement searchbutton = driver.findElement(By.name("btnK"));//name locator for google search
//                WebElement element = driver.findElement(By.name("q"));
//                element.submit();
////      searchbutton.click();
//        driver.quit();
//    }
//}


