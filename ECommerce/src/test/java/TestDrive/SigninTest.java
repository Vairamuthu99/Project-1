package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.Baseclass;
import PageDrive.HomePage;
import PageDrive.SigninPage;

public class SigninTest extends Baseclass {

	@Test
	public void Login() {

		HomePage home = new HomePage(driver);
		home.Basic();
		home.Account();
		home.Signin();

		SigninPage login = new SigninPage(driver);
		login.Login(prop.getProperty("Email"), prop.getProperty("password"));
	}
}
