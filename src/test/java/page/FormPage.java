package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormPage extends BasePage {

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div[2]")
    private WebElement formsButton;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[1]/div/div/div[2]/div/ul/li")
    private WebElement practiceFormButton;

    @FindBy(id = "firstName")
    private WebElement firstNameInput;

    @FindBy(id = "lastName")
    private WebElement lastNameInput;

    @FindBy(id = "userEmail")
    private WebElement emailInput;

    @FindBy(id = "userNumber")
    private WebElement phoneNumberInput;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[3]/div[2]/div[1]/label")
    private WebElement genderRadioButton;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[7]/div[2]/div[1]/label")
    private WebElement hobbi1Checkbox;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[7]/div[2]/div[3]/label")
    private WebElement hobbi2Checkbox;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[6]/div[2]/div/div/div[1]/div[2]/div/input")
    private WebElement subjectInput;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[8]/div[2]/div/input")
    private WebElement chooseFileInput;

    @FindBy(id = "currentAddress")
    private WebElement currentAddressInput;

    @FindBy(id = "submit")
    private WebElement submitButton;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[2]/div/table/tbody/tr[2]/td[2]")
    private WebElement emailResultText;

    public FormPage(WebDriver driver) {
        super(driver);
    }

    public void openForms() {
        click(formsButton);
    }

    public void openPracticeForm() {
        click(practiceFormButton);
    }

    public void fillForm(String firstName, String lastName, String email, String phoneNumber, String subject, String filePath, String address) throws InterruptedException {
        sendKeys(firstNameInput, firstName);
        sendKeys(lastNameInput, lastName);
        sendKeys(emailInput, email);
        sendKeys(phoneNumberInput, phoneNumber);
        click(genderRadioButton);
        scrollBy(0, 400);
        Thread.sleep(3000);
        click(hobbi1Checkbox);
        click(hobbi2Checkbox);
        sendKeys(subjectInput, subject);
        sendKeys(chooseFileInput, filePath);
        sendKeys(currentAddressInput, address);
        scrollBy(0, 400);
        Thread.sleep(3000);
        click(submitButton);
    }

    public void openForm() {
        // Logic to navigate to the form page or ensure it's visible
        // For example:
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[2]/div/ul/li")).click(); // Navigate to form page
    }

    public String getSubmittedEmail() {
        return emailResultText.getText();
    }
}
