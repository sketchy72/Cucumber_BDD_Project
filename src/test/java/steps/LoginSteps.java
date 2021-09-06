package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.BankAndCashPage;
import page.BasePage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginSteps extends BasePage {

	WebDriver driver;
	LoginPage loginpage;
	BankAndCashPage bankandcashpage;

	@Before
	public void beforeTest() {

		driver = BrowserFactory.init();
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		bankandcashpage = PageFactory.initElements(driver, BankAndCashPage.class);
	}

	@Given("^User is on Techfios login page$")
	public void User_is_on_Techfios_login_page() {
		driver.get("https://www.techfios.com/billing/?ng=admin/");
	}

	@When("^User enters Username as \"([^\"]*)\"$")
	public void User_enters_Username_as(String Username) throws Throwable {
		loginpage.enterUsername(Username);
	}

	@When("^User enters Password as \"([^\"]*)\"$")
	public void User_enters_Password_as(String password) throws Throwable {
		loginpage.enterPassword(password);
	}

	@When("^User clicks Signin button$")
	public void User_clicks_on_Sigin_button() throws Throwable {
		loginpage.submit();
	}

	@Then("^User should land on Dashboard page$")
	public void User_should_land_on_Dashboard_page() throws Throwable {
		String ExpectedTitle = "Dashboard- iBilling";
		String ActualTitle = loginpage.getPageTitle();
		Assert.assertEquals(ExpectedTitle, ActualTitle);
	}

	@When("^User clicks on Bank and Cash option on dashboard$")
	public void User_clicks_on_Bank_and_Cash_option_on_dashboard() throws Throwable {
		bankandcashpage.bankandCash();
	}

	@When("^User clicks on New Account option$")
	public void User_clicks_on_New_Account_option() throws Throwable {
		bankandcashpage.newAccount();
	}

	@When("^User enters AccountTitle as \"([^\"]*)\"$")
	public void User_enters_AccountTitle_as(String AccountTitle) throws Throwable {
		bankandcashpage.enterAccountTitle(AccountTitle);
	}

	@When("^User enters Description as \"([^\"]*)\"$")
	public void User_enters_Description_as(String Description) throws Throwable {
		bankandcashpage.enterDescription(Description);
	}

	@When("^User enters InitialBalance as \"([^\"]*)\"$")
	public void User_enters_InitialBalance_as(String IntialBalance) throws Throwable {
		bankandcashpage.enterInitialBalance(IntialBalance);
	}

	@When("^User enters AccountNumber as \"([^\"]*)\"$")
	public void User_enters_AccountNumber_as(String AccountNumber) throws Throwable {
		bankandcashpage.enterAccountNumber(AccountNumber);
	}
	
	@When("^User enters ContactPerson as \"([^\"]*)\"$")
	public void User_enters_ContactPerson_as(String ConactPerson) throws Throwable {
		bankandcashpage.enterContactPerson(ConactPerson);
	}
	
	@When("^User enters Phone as \"([^\"]*)\"$")
	public void User_enters_Phone_as(String ContactPhone) throws Throwable {
		bankandcashpage.enterPhone(ContactPhone);
	}
	
	@When("^User enters url as \"([^\"]*)\"$")
	public void User_enters_url_as(String BankingUrl) throws Throwable {
		bankandcashpage.enterBankingUrl(BankingUrl);
		Thread.sleep(5000);
	}
	
	@Then("^User clicks submit button$")
	public void User_clicks_submit_button() throws Throwable {
		bankandcashpage.pressSubmitButton();
		Thread.sleep(3000);
	}
		
	@After
	public void tearDown() {
		driver.close();
		driver.quit();

	}

}