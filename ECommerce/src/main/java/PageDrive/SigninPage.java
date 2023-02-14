package PageDrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDrive.Utilityclass;

public class SigninPage extends Utilityclass {

	WebDriver driver;

	public SigninPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='fld-e']")
	WebElement Eml;

	@FindBy(xpath = "//input[@id='fld-p1']")
	WebElement Pas;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement Sub;

	public void Login(String Email, String password) {
		Eml.sendKeys(Email);
		Pas.sendKeys(password);
		Sub.click();
	}
}
