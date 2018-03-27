package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import pageObjects.HomePage;

import static junit.framework.TestCase.assertTrue;

public class HomePageSteps {
    TestContext testContext;
    HomePage homePage;

    public HomePageSteps(TestContext context) {
        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();
    }

    @Given("^user is on Home Page$")
    public void user_is_on_Home_Page(){
        homePage.navigate_to_HomePage();
        assertTrue("Home page is not loaded!", homePage.is_loaded());
        homePage.open_contact_form();
    }

}