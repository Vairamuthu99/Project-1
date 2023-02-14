package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.Baseclass;
import PageDrive.HomePage;
import PageDrive.SearchByDBPage;

public class SearchByDBTest extends Baseclass {

	@Test
	public void SelectByDeptBrand() {

		HomePage home = new HomePage(driver);
		home.Basic();
		home.Area(prop.getProperty("Area"));

		SearchByDBPage Item = new SearchByDBPage(driver);
		Item.Card();
		Item.Checkout();
		Item.payment("msvairamuthu1999@gmail.com", "9994519036");
	}
}
