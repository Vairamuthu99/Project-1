package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.Baseclass;
import PageDrive.HomePage;
import PageDrive.SignupPage;

public class SignupTest extends Baseclass {

	@Test
	public void MultipleSignup() {

		HomePage home = new HomePage(driver);
		home.Basic();
		home.Account();
		home.Caccount();

		SignupPage signup = new SignupPage(driver);
		signup.Firstname(prop.getProperty("Firstname"));
		signup.Lastname(prop.getProperty("Lastname"));
		signup.Email(generateNewEmail());
		signup.Password(prop.getProperty("password"));
		signup.CPassword(prop.getProperty("cpassword"));
		signup.Number(prop.getProperty("number"));
		signup.Submit();
	}
}
		
