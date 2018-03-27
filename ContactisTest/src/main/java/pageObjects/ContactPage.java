package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ContactPage{
    public ContactPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "subject")
    private WebElement subject_field;

    @FindBy(how = How.ID, using = "name")
    private WebElement name_field;

    @FindBy(how = How.ID, using = "email")
    private WebElement email_field;

    @FindBy(how = How.ID, using = "phone")
    private WebElement phone_field;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    private WebElement submit_button;

    public void submit_form(String name_field, String email_field, String phone_field) {
        this.name_field.sendKeys(name_field);
        this.email_field.sendKeys(email_field);
        this.phone_field.sendKeys(phone_field);
        submit_button.click();
        try { Thread.sleep(5000);}
        catch (InterruptedException e) {}
    }

    public boolean is_loaded() {
        return subject_field.isDisplayed();
    }

    public WebElement getEmail_field() {
        return email_field;
    }

    public WebElement getName_field() {
        return name_field;
    }

    public WebElement getPhone_field() {
        return phone_field;
    }

    public WebElement getSubject_field() {
        return subject_field;
    }

    public WebElement getSubmit_button() {
        return submit_button;
    }
}
