package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/login");

		By email = By.id("input-email");
//		By password = By.id("input-password");
//		By login = By.xpath("//input[@value='Login']");
//
		// WebDriver Wait--Class
		// Can be applied for any web Elements
		// not a global wait
		// can be applied for non Web elements
		ElementUtil ele = new ElementUtil(driver);

		ele.doPresenceofElementLocated(email, 10);

	}

}
