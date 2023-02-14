package BaseDrive;

import java.io.FileInputStream;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utilityclass {

	public static WebDriver driver;
	public Properties prop;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	public WebDriver initializeDriver() throws Exception {
		prop = new Properties();
		String propPath = System.getProperty("user.dir") + "\\src\\main\\java\\config\\config.properties";
		FileInputStream file = new FileInputStream(propPath);
		prop.load(file);
		String browser = prop.getProperty("browser");
		if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("IE")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}

	public String generateNewEmail() {
		Date date = new Date();
		return date.toString().replace(" ", "_").replace("?", "_") + "@gmail.com";
	}
}
/*
 * public void dragdown() {
		driver.switchTo().frame(0);
		WebElement slider = driver.findElement(By.xpath("//ul[@class='hamburger-menu-flyout-list']"));
		Actions actobj =new Actions(driver);
		actobj.dragAndDropBy(slider, 100, 0).build().perform();
	}
 * 
 * public void carrier() {
		WebElement menu =driver.findElement(By.xpath("//span[contains(text(),'Curriculum')]"));
		WebElement chlmenu = driver.findElement(By.xpath("//span[contains(text(),'Research')]"));
		Actions obj = new Actions(driver);
		obj.moveToElement(menu).build().perform();
		obj.moveToElement(chlmenu).doubleClick(chlmenu).build().perform();
	}
 * 
 * public void mouseover() { driver.get(
 * "https://www.bestbuy.com/site/apple-iphone-12-5g-64gb-black-verizon/6009897.p?skuId=6009897"
 * ); driver.manage().window().setSize(new Dimension(826, 816)); { WebElement
 * element = driver.findElement(By.cssSelector(".primary-image")); Actions
 * builder = new Actions(driver); builder.moveToElement(element).perform(); } {
 * WebElement element = driver.findElement(By.tagName("body")); Actions builder
 * = new Actions(driver); builder.moveToElement(element, 50, 50).perform(); }
 * js.executeScript("window.scrollTo(0,4)");
 * js.executeScript("window.scrollTo(0,619.2000122070312)");
 * js.executeScript("window.scrollTo(0,1317.5999755859375)");
 * js.executeScript("window.scrollTo(0,1527.199951171875)");
 * js.executeScript("window.scrollTo(0,1720)"); { WebElement element =
 * driver.findElement(By.cssSelector(".c-button-primary")); Actions builder =
 * new Actions(driver); builder.moveToElement(element).perform(); } { WebElement
 * element = driver.findElement(By.cssSelector(".c-button-primary")); Actions
 * builder = new Actions(driver); builder.moveToElement(element).perform(); }
 * driver.findElement(By.cssSelector(".c-button-primary")).click(); }
 * 
 * 
 * public void mouseover() { WebElement menu
 * =driver.findElement(By.xpath("//button[@data-sku-id='6009897']")); Actions
 * obj = new Actions(driver); obj.moveToElement(menu).click().build().perform();
 * } } public String takeScreenshot(String Testname,WebDriver driver) throws
 * Exception { File srcScreenshot =
 * ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); String
 * screenshotFilePath =
 * System.getProperty("user.dir")+"\\Screenshots\\"+Testname+".png";
 * FileUtils.copyFile(srcScreenshot, new File(screenshotFilePath)); return
 * screenshotFilePath ; }
 */
