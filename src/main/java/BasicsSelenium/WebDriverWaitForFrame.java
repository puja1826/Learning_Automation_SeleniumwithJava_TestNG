package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitForFrame {

	public static void main(String[] args) {
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");
		driver.manage().window().maximize();
		driver.get("https://classic.crmpro.com/index.html");
		ElementUtil ele = new ElementUtil(driver);
		By emailId = By.name("username");
		By password = By.name("password");
		By loginbtn = By.xpath("//input[@value='Login']");
		By contacts = By.xpath("//a[@title='Contacts']");

		ele.doSendKeys(emailId, "groupautomation");
		ele.doSendKeys(password, "Test@12345");
		ele.doClick(loginbtn);

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("mainpanel"));
		ele.doClick(contacts);
	}

}
