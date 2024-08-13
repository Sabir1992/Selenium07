package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;
    protected JavascriptExecutor js;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.js = (JavascriptExecutor) driver;
        PageFactory.initElements(driver, this);   //Form page classinda @FindBy annotasiyasinan baslayan webelementleri ise salir
    }

    public void click(WebElement element) {
        element.click();
    }

    public void sendKeys(WebElement element, String text) {
        element.sendKeys(text);
    }

    public void scrollBy(int x, int y) {
        js.executeScript("window.scrollBy(" + x + "," + y + ")");
    }
}
