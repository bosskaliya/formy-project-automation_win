import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Milan");

        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Y");

        WebElement jobTitle = driver.findElement(By.id("job-title"));
        jobTitle.sendKeys("tester");

        WebElement education = driver.findElement(By.id("radio-button-1"));
        education.click();

        WebElement sex = driver.findElement(By.id("checkbox-1"));
        sex.click();

        WebElement experiance = driver.findElement(new By.ByCssSelector("option[value='1']"));
        experiance.click();

        WebElement datepicker = driver.findElement(By.id("datepicker"));
        datepicker.sendKeys("02/11/2022");
        datepicker.sendKeys(Keys.RETURN);

        WebElement submit = driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a"));
        submit.click();

        driver.quit();
    }
}
