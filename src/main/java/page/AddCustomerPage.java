package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCustomerPage extends BasePage {

	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/a/span[1]")
	WebElement CUSTOMER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Add Customer')]")
	WebElement ADD_CUSTOMER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")
	WebElement COMPANY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
	WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]")
	WebElement PHONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"address\"]")
	WebElement ADDRESS_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"city\"]")
	WebElement CITY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"state\"]")
	WebElement STATE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"zip\"]")
	WebElement ZIP_CODE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"country\"]")
	WebElement COUNTRY_ELEMENT;

	public void customer() {
		CUSTOMER_ELEMENT.click();
	}

	public void addCustomer() {
		ADD_CUSTOMER_ELEMENT.click();
	}

	public void enterUsername(String username) {
		FULL_NAME_ELEMENT.sendKeys(username + rng(999));
	}

	public void enterCompanyName(String company) {
		selectDropdown(COMPANY_ELEMENT, company);
	}

	public void enterEmail(String email) {
		EMAIL_ELEMENT.sendKeys(rng(99) + email);
	}

	public void enterPhone(String phone) {
		PHONE_ELEMENT.sendKeys(phone + rng(99));
	}

	public void enterAddress(String add) {
		ADDRESS_ELEMENT.sendKeys(add);
	}

	public void enterCity(String city) {
		CITY_ELEMENT.sendKeys(city);
	}

	public void enterState(String state) {
		STATE_ELEMENT.sendKeys(state);
	}

	public void enterZipCode(String zip) {
		ZIP_CODE_ELEMENT.sendKeys(zip);
	}

	public void enterCountry(String country) {
		selectDropdown(COUNTRY_ELEMENT, country);
	}
}