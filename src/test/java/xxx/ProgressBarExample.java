package xxx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgressBarExample extends TestClass{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/progress-bar");

        driver.manage().window().fullscreen();
        WebElement startButton = driver.findElement(By.id("startStopButton"));
        startButton.click();

        WebElement progressBar = driver.findElement(By.cssSelector(".progress-bar"));

        while (true) {
            String progressText = progressBar.getText();
            if (progressText.equals("100%")) {
                System.out.println("Progress completed.");
                break;
            }
        }

        //driver.quit();
    }
}
