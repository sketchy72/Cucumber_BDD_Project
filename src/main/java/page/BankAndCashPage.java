package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BankAndCashPage extends BasePage {
	WebDriver driver;

	public BankAndCashPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/a/span[1]")
	WebElement BANK_AND_CASH_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")
	WebElement NEW_ACCOUNT_Element;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement ACCOUNT_TITLE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"description\"]")
	WebElement DESCRIPTION_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"balance\"]")
	WebElement INITIAL_BALANCE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account_number\"]")
	WebElement ACCOUNT_NUMBER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_person\"]")
	WebElement CONTACT_PERSON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_phone\"]")
	WebElement PHONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ib_url\"]")
	WebElement BANKING_URL;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")
	WebElement SUBMIT_BUTTON;

	public void bankandCash() {
		BANK_AND_CASH_ELEMENT.click();
	}

	public void newAccount() {
		NEW_ACCOUNT_Element.click();
	}

	public void enterAccountTitle(String accountTitle) {
		ACCOUNT_TITLE_ELEMENT.sendKeys(accountTitle + rng(999));
	}

	public void enterDescription(String description) {
		DESCRIPTION_ELEMENT.sendKeys(description + rng(999));
	}

	public void enterInitialBalance(String intialBalance) {
		INITIAL_BALANCE_ELEMENT.sendKeys(intialBalance + rng(999));
	}

	public void enterAccountNumber(String accountNumber) {
		ACCOUNT_NUMBER_ELEMENT.sendKeys(accountNumber + rng(999));
	}

	public void enterContactPerson(String contactPerson) {
		CONTACT_PERSON_ELEMENT.sendKeys(contactPerson + rng(999));
	}

	public void enterPhone(String phone) {
		PHONE_ELEMENT.sendKeys(phone + rng(999));
	}

	public void enterBankingUrl(String bankingUrl) {
		BANKING_URL.sendKeys(bankingUrl);
	}
	
	public void pressSubmitButton() {
		SUBMIT_BUTTON.click();
	}

}

