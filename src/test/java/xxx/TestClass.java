package xxx;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.security.Key;

public class TestClass {

    static String path="C:/Users/pc/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",path);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.youtube.com/");

        Thread.sleep(2000);

        String search = "/html/body/ytd-app/div[1]/div/ytd-masthead/div[4]/div[2]/ytd-searchbox/form/div[1]/div[1]/input";

        driver.findElement(By.xpath(search)).sendKeys("masha i medved");

        String searchButton = "/html/body/ytd-app/div[1]/div/ytd-masthead/div[4]/div[2]/ytd-searchbox/button";
        driver.findElement(By.xpath(searchButton)).click();


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");

        js.executeScript("window.scrollBy(0,-1000)");



        //driver.quit();


    }

}
