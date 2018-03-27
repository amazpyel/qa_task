package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class HomePage{
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindAll(@FindBy(how = How.ID, using = "mainpage-video"))
    private WebElement mainVideo;

    public void open_contact_form() {
        driver.navigate().to("https://contactis.pl/contact/");
    }

    public void navigate_to_HomePage() {
        driver.get("https://contactis.pl/");
    }

    public boolean is_loaded() {
        return mainVideo.isDisplayed();
    }


}