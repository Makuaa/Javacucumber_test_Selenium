package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateNewUserPage {
    public int random;

    //Declare Your elements and locators here

    @FindBy(how = How.LINK_TEXT,using = "Create an Account")
    public static WebElement CreateNewAccountLink;

    @FindBy(how = How.ID_OR_NAME,using = "firstname")
    public static WebElement NewUserFirstname;

    @FindBy(how = How.ID_OR_NAME,using = "lastname")
    public static WebElement NewUserLastname;

    @FindBy(how = How.CLASS_NAME,using = "checkbox")
    public static WebElement NewUserCheckbox;

    @FindBy(how = How.ID_OR_NAME,using = "email_address")
    public static WebElement NewUserEmailaddress;

    @FindBy(how = How.ID_OR_NAME,using = "password")
    public static WebElement NewUserPassword;

    @FindBy(how = How.ID_OR_NAME,using = "password-confirmation")
    public static WebElement PasswordConfirmation;

    @FindBy(how = How.XPATH,using = "//span[text() = 'Create an Account' ]")
    public static WebElement CreateAccountButton;

    @FindBy(how = How.XPATH,using = "/html/body/div[2]/header/div[1]/div/ul/li[1]/span)")
    public static WebElement AccountSuccessMessage;

    //Declare Your methods here
    public void clickCreateAccountLink() {CreateNewAccountLink.click(); }
    public void enternewuserfirstname() {NewUserFirstname.sendKeys("Jane"); }
    public void enternewuserlastname() {NewUserLastname.sendKeys("Doe"); }
    public void subscribetonewsletter() {NewUserCheckbox.click(); }
    public void enternewuseremail() {
        random = 100 + (int) (Math.random()*((1000-1)+1));
        NewUserEmailaddress.sendKeys("Janedoe" + random + "@gmail.com"); }
    public void enterNewUserPassword() {NewUserPassword.sendKeys("Testing123!"); }
    public void confirmUserPassword() {PasswordConfirmation.sendKeys("Testing123!"); }
    public void clickCreateAccountButton() {CreateAccountButton.click(); }
    public void assertSuccessfulAccountCreation() {
        String ExpectedLoggedInMessage = "Welcome, Jane Doe!";
        String ActualLoggedInMessage = AccountSuccessMessage.getText();
        Assert.assertEquals(ExpectedLoggedInMessage, ActualLoggedInMessage);
        System.out.println(ActualLoggedInMessage);
    }







}
