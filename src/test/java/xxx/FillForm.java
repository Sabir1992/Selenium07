package xxx;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class FillForm extends TestClass {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", TestClass.path);

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Open the form URL
            driver.get("https://demoqa.com/automation-practice-form");

            // Maximize the browser window
            driver.manage().window().maximize();

            // Fill out the form
            driver.findElement(By.id("firstName")).sendKeys("John");
            driver.findElement(By.id("lastName")).sendKeys("Doe");
            driver.findElement(By.id("userEmail")).sendKeys("johndoe@example.com");

            // Gender radio button (e.g., Male)
            driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();

            driver.findElement(By.id("userNumber")).sendKeys("1234567890");

            // Date of birth (using JavaScript to avoid interaction issues)
            WebElement dateOfBirthInput = driver.findElement(By.id("dateOfBirthInput"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('readonly',0);", dateOfBirthInput);
            dateOfBirthInput.clear();
            dateOfBirthInput.sendKeys("01 Jan 1990");
            dateOfBirthInput.sendKeys(Keys.TAB);

            // Subjects (e.g., type "Math" and select the suggestion)
            WebElement subjectsInput = driver.findElement(By.id("subjectsInput"));
            subjectsInput.sendKeys("Math");
            subjectsInput.sendKeys(Keys.TAB);

            // Wait for the checkbox to be clickable and select it
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement sportsCheckbox = wait.until(ExpectedConditions.elementToBeClickable(By.id("hobbies-checkbox-1")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sportsCheckbox);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", sportsCheckbox);

            // Upload Picture
            WebElement uploadElement = driver.findElement(By.id("uploadPicture"));
            uploadElement.sendKeys("C:\\Users\\pc\\Desktop\\testqa.jpg");

            driver.findElement(By.id("currentAddress")).sendKeys("123 Main St, Springfield");

            // State and City (e.g., NCR and Delhi)
            driver.findElement(By.id("react-select-3-input")).sendKeys("NCR");
            driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);
            driver.findElement(By.id("react-select-4-input")).sendKeys("Delhi");
            driver.findElement(By.id("react-select-4-input")).sendKeys(Keys.ENTER);

            // Submit the form
            driver.findElement(By.id("submit")).click();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            //driver.quit();
        }
    }
}
