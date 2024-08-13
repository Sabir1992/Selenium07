package xxx;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.Assert.assertEquals;

public class Form {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:/Users/pc/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");


        ChromeOptions optionsChrome = new ChromeOptions();
//        EdgeOptions optionsEdge=new EdgeOptions();
        optionsChrome.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(optionsChrome);
//        WebDriver driver2 = new EdgeDriver(optionsE);

        driver.get("https://demoqa.com");


        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");


        String forms="/html/body/div[2]/div/div/div[2]/div/div[2]";
        driver.findElement(By.xpath(forms)).click();
//        js.executeScript("document.body.style.zoom = '" + 0.7 + "'");
        String pform="/html/body/div[2]/div/div/div/div[1]/div/div/div[2]/div/ul/li";
        driver.findElement(By.xpath(pform)).click();
        String chooseFile="/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[8]/div[2]/div/input";
        js.executeScript("window.scrollBy(0,800)");
        //    driver.findElement(By.xpath(chooseFile)).click();
//        String fname="firstName";


        driver.findElement(By.id("firstName")).sendKeys("ilkin");
        driver.findElement(By.id("lastName")).sendKeys("adilzada");
        driver.findElement(By.id("userEmail")).sendKeys("adilzadeilkin@gmail.com");
        driver.findElement(By.id("userNumber")).sendKeys("0505555555");
        String gender="/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[3]/div[2]/div[1]/label";
        driver.findElement(By.xpath(gender)).click();
        js.executeScript("window.scrollBy(0,400)");
        String hobbi1="/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[7]/div[2]/div[1]/label";
        String hobbi2="/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[7]/div[2]/div[3]/label";
        driver.findElement(By.xpath(hobbi2)).click();
        driver.findElement(By.xpath(hobbi1)).click();
        String subject="/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[6]/div[2]/div/div/div[1]/div[2]/div/input";
        driver.findElement(By.xpath(subject)).sendKeys("QA Automation");
        driver.findElement(By.xpath(chooseFile)).sendKeys("C:\\Users\\pc\\Desktop\\testqa.jpg");
        driver.findElement(By.id("currentAddress")).sendKeys("Baku city");
        js.executeScript("window.scrollBy(0,400)");
        driver.findElement(By.id("submit")).click();
        String EmailPath="/html/body/div[5]/div/div/div[2]/div/table/tbody/tr[2]/td[2]";
        WebElement elementMail = driver.findElement(By.xpath(EmailPath));
        String actualResult=elementMail.getText();
        String expResult="adilzadeilkin@gmail.com";
         assertEquals(expResult,  "adilzadeilkin@gmail.com");



    }
}