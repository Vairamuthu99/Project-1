package PageDrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDrive.Utilityclass;

public class SearchItemPage extends Utilityclass {

	WebDriver driver;

	public SearchItemPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='text']")
	WebElement Sea;

	@FindBy(xpath = "//span[@class='header-search-icon']")
	WebElement sea;

	@FindBy(xpath = "//button[@data-sku-id='6267219']")
	WebElement Checkout;

	@FindBy(xpath = "//a[@data-track='']")
	WebElement Gochart;

	@FindBy(xpath = "//input[@checked='']")
	WebElement area;

	@FindBy(xpath = "//button[@data-track='Checkout - Top']")
	WebElement Fcheckout;

	@FindBy(xpath = "//button[@class='c-button c-button-secondary c-button-lg cia-guest-content__continue guest']")
	WebElement Gcheckout;

	@FindBy(xpath = "//input[@id='user.emailAddress']")
	WebElement Ema;

	@FindBy(xpath = "//input[@id='user.phone']")
	WebElement Phn;

	@FindBy(xpath = "//input[@id='text-updates']")
	WebElement box;

	@FindBy(xpath = "//button[@class='btn btn-lg btn-block btn-secondary']")
	WebElement pay;

	//@FindBy(xpath = "//button[@class='btn btn-lg btn-block btn-primary']")
	//WebElement Fpay;

	public void Search(String Search) {
		Sea.sendKeys(Search);
		sea.click();
	}

	public void Chartout() {
		Checkout.click();
		Gochart.click();
		area.click();
		Fcheckout.click();
		Gcheckout.click();
	}

	public void payment(String emailAddress, String phone) {
		Ema.sendKeys(emailAddress);
		Phn.sendKeys(phone);
		box.click();
		pay.click();
		//Fpay.click();
	}
}
