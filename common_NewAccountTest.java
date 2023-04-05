package Step_definition;

import Base.TestBase;
import Pages.CreateNewUserPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class common_NewAccountTest extends TestBase {

    @Before
    public void setup() throws IOException {
        initialize();
    }
    @Given("^I am on the landing screen$")
    public void iAmOnTheLandingScreen() {
        driver.manage().deleteAllCookies();
        driver.get(CONFIG.getProperty("URL"));
        driver.manage().window().maximize();

    }

    @When("^I click the create account link$")
    public void iClickTheCreateAccountLink() {
        CreateNewUserPage File = PageFactory.initElements(driver,CreateNewUserPage.class);
        File.clickCreateAccountLink();
    }
}
