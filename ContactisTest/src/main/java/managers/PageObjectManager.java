package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.ContactPage;
import pageObjects.HomePage;


public class PageObjectManager {
    private WebDriver driver;
    private HomePage homePage;
    private ContactPage contactPage;


    public PageObjectManager(WebDriver driver) {

        this.driver = driver;

    }


    public HomePage getHomePage(){

        return (homePage == null) ? homePage = new HomePage(driver) : homePage;

    }


    public ContactPage getContactPage() {

        return (contactPage == null) ? contactPage = new ContactPage(driver) : contactPage;

    }
}
