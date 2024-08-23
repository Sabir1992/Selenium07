package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import page.FormPage;

import static org.junit.Assert.assertEquals;

import java.util.Map;

public class FormStepDefinition2 {

    private WebDriver driver;
    private FormPage formPage;



    @Given("I am on the Form Page page2")
    public void i_am_on_the_form_page_page2() {
        String chromeDriverPath = "C:/Users/pc/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        ChromeOptions optionsChrome = new ChromeOptions();
        optionsChrome.addArguments("--start-maximized");

        driver = new ChromeDriver(optionsChrome);
        driver.get("https://demoqa.com");

        formPage = new FormPage(driver);


    }

    @When("I fill the form with the following details2:")
    public void i_fill_the_form_with_the_following_details2(Map<String, String> formData) throws InterruptedException {
        String firstName = formData.get("First Name");
        String lastName = formData.get("Last Name");
        String email = formData.get("Email");
        String phoneNumber = formData.get("Phone Number");
        String subject = formData.get("Subject");
        String imagePath = formData.get("Image Path");
        String address = formData.get("Address");

        formPage.fillForm(firstName, lastName, email, phoneNumber, subject, imagePath, address);
    }

    @Then("I should see the submitted email2 as {string}")
    public void i_should_see_the_submitted_email2_as(String expectedEmail) {
        String actualResult = formPage.getSubmittedEmail();
        assertEquals(expectedEmail, actualResult);
        // driver.quit();
    }
}

