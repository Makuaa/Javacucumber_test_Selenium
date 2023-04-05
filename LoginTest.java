package Step_definition;

import Base.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest extends TestBase {

    @Given("^I am on the homepage$")
    public void i_am_on_the_homepage() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://magento.softwaretestingboard.com/");

    }

    @When("^I click sign in$")
    public void i_click_sign_in() throws Throwable {
        driver.findElement(By.className("authorization-link")).click();

    }

    @When("^I enter username$")
    public void i_enter_username() throws Throwable {
        driver.findElement(By.id("email")).sendKeys("davidzoe@gmail.com");

    }

    @When("^I enter password$")
    public void i_enter_password() throws Throwable {
        driver.findElement(By.name("login[password]")).sendKeys("Testing123!");

    }

    @When("^I click the login button$")
    public void i_click_the_login_button() throws Throwable {
        driver.findElement(By.id("send2")).click();
        Thread.sleep(5000);

    }

    @Then("^I should be logged in successfully$")
    public void i_should_be_logged_in_successfully() throws Throwable {

        driver.quit();


    }

}
