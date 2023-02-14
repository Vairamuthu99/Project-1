package TestDrive;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import BaseDrive.Baseclass;

public class BrokenLinksTest extends Baseclass {
	
	@Test
	public void BrokenLinkTest() {

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links = " + links.size());

		for (int i = 0; i < links.size(); i++) {
			WebElement E1 = links.get(i);
			String url = E1.getAttribute("href");
			verifyLinks(url);
		}

	}

	public static void verifyLinks(String linkUrl) {
		try {
			URL link = new URL(linkUrl);
			HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
			httpConn.setConnectTimeout(2000);
			httpConn.connect();
			if (httpConn.getResponseCode() >= 404 ) {
				System.out.println(linkUrl + " - " + httpConn.getResponseMessage() + " is broken link");
			} else {
				System.out.println(linkUrl + " - " + httpConn.getResponseMessage());
			}
		} catch (Exception e) {
		}
		
	} 
}
