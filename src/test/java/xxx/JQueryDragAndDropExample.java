package xxx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JQueryDragAndDropExample extends  TestClass{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");

        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(draggable, droppable).perform();

        String droppableText = droppable.findElement(By.tagName("p")).getText();
        if ("Dropped!".equals(droppableText)) {
            System.out.println("Drag and drop successful!");
        } else {
            System.out.println("Drag and drop failed.");
        }

    }
}
