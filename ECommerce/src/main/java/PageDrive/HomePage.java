package PageDrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDrive.Baseclass;
import BaseDrive.Utilityclass;

public class HomePage extends Utilityclass {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//img[@alt='United States'])[1]")
	WebElement Img;

	@FindBy(xpath = "//span[@class='store-display-name']")
	WebElement Location;

	@FindBy(xpath = "//a[@href='/site/store-locator']")
	WebElement FLocation;

	@FindBy(xpath = "//span[@class='location-zip-code-form-drawer-caret-title']")
	WebElement Zip;

	@FindBy(xpath = "//input[@class='tb-input form-control zip-code-input v-medium']")
	WebElement City;

	@FindBy(xpath = "//button[@data-cy='SubmitButton']")
	WebElement Update;
	
	@FindBy(xpath = "//div[@class='make-this-store-container']")
	WebElement FStore;

	@FindBy(xpath = "//a[@href='https://www.bestbuy.com']")
	WebElement MainPg;

	@FindBy(xpath = "//span[@class='v-p-right-xxs line-clamp']")
	WebElement Acc;

	@FindBy(xpath = "//a[@class='c-button c-button-secondary c-button-sm sign-in-btn']")
	WebElement Sgi;

	@FindBy(xpath = "//a[@class='c-button c-button-outline c-button-sm create-account-btn']")
	WebElement Cac;

	public void Basic() {
		Img.click();

	}

	public void Area(String Area) {
		Location.click();
		FLocation.click();
		Zip.click();
		City.sendKeys(Area);
		Update.click();
		FStore.click();
		MainPg.click();
	}

	public void Account() {
		Acc.click();
	}

	public void Signin() {
		Sgi.click();
	}

	public void Caccount() {
		Cac.click();
	}
}
