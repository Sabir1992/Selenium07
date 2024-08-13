package xxx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerExample extends  TestClass{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/date-picker");
        driver.manage().window().fullscreen();



        WebElement dateInput = driver.findElement(By.id("datePickerMonthYearInput"));
        dateInput.click();

        WebElement monthDropdown = driver.findElement(By.className("react-datepicker__month-select"));
        monthDropdown.click();
        monthDropdown.findElement(By.xpath("//option[text()='August']")).click();

        WebElement yearDropdown = driver.findElement(By.className("react-datepicker__year-select"));
        yearDropdown.click();
        yearDropdown.findElement(By.xpath("//option[text()='2025']")).click();

        WebElement day = driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__day') and text()='15']"));
        day.click();

        String selectedDate = dateInput.getAttribute("value");
        System.out.println("Selected Date: " + selectedDate);

    }
}
