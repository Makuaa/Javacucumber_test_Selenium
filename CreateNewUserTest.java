package Step_definition;

import Base.TestBase;
import Pages.CreateNewUserPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class CreateNewUserTest extends TestBase {



    @And("^I enter first name$")
    public void iEnterFirstName() {
        CreateNewUserPage File = PageFactory.initElements(driver,CreateNewUserPage.class);
        File.enternewuserfirstname();

    }

    @And("^I enter last name$")
    public void iEnterLastName() {
        CreateNewUserPage File = PageFactory.initElements(driver,CreateNewUserPage.class);
        File.enternewuserlastname();

    }

    @And("^I sign up for news letter$")
    public void iSignUpForNewsLetter() {
        CreateNewUserPage File = PageFactory.initElements(driver,CreateNewUserPage.class);
        File.subscribetonewsletter();
    }

    @And("^I enter email$")
    public void iEnterEmail() throws InterruptedException {
        CreateNewUserPage File = PageFactory.initElements(driver,CreateNewUserPage.class);
        File.enternewuseremail();


        Thread.sleep(5000);
    }

    @And("^I enter new user password$")
    public void iEnterNewUserPassword() {
        CreateNewUserPage File = PageFactory.initElements(driver,CreateNewUserPage.class);
        File.enterNewUserPassword();

    }

    @And("^I confirm password$")
    public void iConfirmPassword() {
        CreateNewUserPage File = PageFactory.initElements(driver,CreateNewUserPage.class);
        File.confirmUserPassword();


    }

    @When("^I click the create account button$")
    public void iClickTheCreateAccountButton() throws InterruptedException {
        CreateNewUserPage File = PageFactory.initElements(driver,CreateNewUserPage.class);
        File.clickCreateAccountButton();


        Thread.sleep(5000);
    }

    @Then("^my account should be created succesfully$")
    public void myAccountShouldBeCreatedSuccesfully() {
        CreateNewUserPage File = PageFactory.initElements(driver,CreateNewUserPage.class);
        File.assertSuccessfulAccountCreation();



    }
}
