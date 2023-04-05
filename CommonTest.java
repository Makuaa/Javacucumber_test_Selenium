package Step_definition;

import Base.TestBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import java.io.IOException;

public class CommonTest extends TestBase {
    @Before
    public void setup() throws IOException {
        initialize();
    }

    @Given("^I am on the home page$")
    public void iAmOnTheHomePage() {
        driver.manage().deleteAllCookies();
        driver.get(CONFIG.getProperty("URL"));
        driver.manage().window().maximize();
    }

    @When("^I click the sign in link$")
    public void iClickTheSignInLink() {
        driver.findElement(By.className("authorization-link")).click();
    }
}
