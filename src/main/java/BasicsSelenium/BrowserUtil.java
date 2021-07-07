package BasicsSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	public WebDriver driver;

	public WebDriver initDriver(String browserName) {

		System.out.println("The Name of the browser:" + browserName);

		switch (browserName.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:

			System.out.println("Please choose the correct browser" + browserName);
			break;
		}
		return driver;
	}

	public void launchUrl(String url) {
		if (url.isEmpty()) {
			System.out.println("url is blank or empty");
			return;
		}
		if (url.contains("http") || url.contains("https")) {
			driver.get(url);
		}
	}

	/**
	 * 
	 * This method is used to get the page title
	 * 
	 * @return this will return title of the page (String)
	 */
	public String doGetTitle() {
		return driver.getTitle();
	}

	public String getPageCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();
	}

}
