package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.Baseclass;
import PageDrive.HomePage;
import PageDrive.SearchItemPage;

public class SearchItemTest extends Baseclass {

	@Test
	public void SelectItem() {

		HomePage home = new HomePage(driver);
		home.Basic();
		home.Area(prop.getProperty("Area"));

		SearchItemPage item = new SearchItemPage(driver);
		item.Search("Sony - WHRF400 RF Wireless Headphones - Black");
		item.Chartout();
		item.payment("msvairamuthu1999@gmail.com", "9994519036");
	}
}
