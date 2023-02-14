package PageDrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDrive.Utilityclass;

public class SearchByDBPage extends Utilityclass {

	WebDriver driver;

	public SearchByDBPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//nav[@class='hamburger-menu']")
	WebElement Menu;

	@FindBy(xpath = "//button[@data-id='node-1136']")
	WebElement Toys;

	@FindBy(xpath = "//button[@data-id='node-1097']")
	WebElement Games;

	@FindBy(xpath = "//a[@data-lid='ubr_tg_gpc_cards']")
	WebElement Cards;

	@FindBy(xpath = "//button[@data-sku-id='6521101']")
	WebElement Addchart;

	@FindBy(xpath = "//a[@data-track='']")
	WebElement Gochart;

	@FindBy(xpath = "//input[@checked='']")
	WebElement Pick;

	@FindBy(xpath = "//button[@data-track='Checkout - Top']")
	WebElement Cout;
	
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

	public void Card() {
		Menu.click();
		Toys.click();
		Games.click();
		Cards.click();
		
	}

	public void Checkout() {
		Addchart.click();
		Gochart.click();
		Pick.click();
		Cout.click();
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
