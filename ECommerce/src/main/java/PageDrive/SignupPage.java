package PageDrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDrive.Utilityclass;

public class SignupPage extends Utilityclass {

	WebDriver driver;

	public SignupPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='firstName']")
	WebElement fname;

	@FindBy(xpath = "//input[@id='lastName']")
	WebElement lname;

	@FindBy(xpath = "//input[@type='email']")
	WebElement eml;

	@FindBy(xpath = "//input[@id='fld-p1']")
	WebElement pass;

	@FindBy(xpath = "//input[@id='reenterPassword']")
	WebElement cpass;

	@FindBy(xpath = "//input[@id='phone']")
	WebElement num;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement sub;

	public void Firstname(String Firstname) {
		fname.sendKeys(Firstname);
	}

	public void Lastname(String Lastname) {
		lname.sendKeys(Lastname);
	}

	public void Email(String Email) {
		eml.sendKeys(Email);
	}

	public void Password(String password) {
		pass.sendKeys(password);
	}

	public void CPassword(String cpassword) {
		cpass.sendKeys(cpassword);
	}

	public void Number(String number) {
		num.sendKeys(number);
	}

	public void Submit() {
		sub.click();
	}
}
