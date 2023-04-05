package Step_definition;

import Base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;


public class InvalidLoginTest extends TestBase {

    //@Given("^I am on the landing page$")
    //public void iAmOnTheLandingPage() {
        //System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        //driver = new ChromeDriver();
        //driver.manage().window().maximize();
        //driver.navigate().to("https://magento.softwaretestingboard.com/");
    //}

    //@And("^I click sign In$")
    //public void iClickSignIn() {
        //driver.findElement(By.className("authorization-link")).click();
    //}

    @When("^I enter my \"([^\"]*)\"$")
    public void iEnterMy(String username) throws Throwable {
        driver.findElement(By.id("email")).sendKeys(username);
    }

    @And("^I click my \"([^\"]*)\"$")
    public void iClickMy(String password) throws Throwable {
        driver.findElement(By.name("login[password]")).sendKeys(password);
    }

    @When("^I press the login button$")
    public void iPressTheLoginButton() throws InterruptedException {
        driver.findElement(By.id("send2")).click();
        Thread.sleep(5000);
    }

    @Then("^I should get the correct \"([^\"]*)\"$")
    public void iShouldGetTheCorrect(String errorMessage) throws Throwable {




    }
}
