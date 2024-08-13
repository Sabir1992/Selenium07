package xxx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderExample {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/pc/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/slider");

        driver.manage().window().fullscreen();
        Thread.sleep(2000);

        WebElement slider = driver.findElement(By.cssSelector(".range-slider"));

        Actions actions = new Actions(driver);

        actions.clickAndHold(slider)
                .moveByOffset(40, 0)
                .release()
                .perform();
        Thread.sleep(3000);

        actions.clickAndHold(slider)
                .moveByOffset(-40, 0)
                .release()
                .perform();

        //driver.quit();
    }
}
