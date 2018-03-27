package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import pageObjects.ContactPage;

import static junit.framework.TestCase.assertTrue;

public class ContactPageSteps {
    TestContext testContext;
    ContactPage contactPage;

    public ContactPageSteps(TestContext context) {
        testContext = context;
        contactPage = testContext.getPageObjectManager().getContactPage();
    }

    @When("^he goes to Contact Page he sees name field$")
    public void user_sees_name_field() {
        assertTrue("Contact page is not loaded!", contactPage.is_loaded());
        assertTrue("Name field is not displayed!", contactPage.getName_field().isDisplayed());
    }

    @When("^he sees phone field$")
    public void user_sees_phone_number_field() {
        assertTrue("Phone number field is not displayed!", contactPage.getPhone_field().isDisplayed());
    }

    @When("^he sees email field$")
    public void user_sees_email_field() {
        assertTrue("Email field is not displayed!", contactPage.getEmail_field().isDisplayed());
    }

}