package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FrameHandle {

	public static void main(String[] args) {
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");
		driver.manage().window().maximize();
		driver.get("https://classic.crmpro.com/index.html");

		By emailId = By.name("username");
		By password = By.name("password");
		By loginbtn = By.xpath("//input[@value='Login']");
		By contacts = By.xpath("//a[@title='Contacts']");

		ElementUtil ele = new ElementUtil(driver);

		ele.doSendKeys(emailId, "groupautomation");
		ele.doSendKeys(password, "Test@12345");
		ele.doClick(loginbtn);

		ele.waitForFrameAndSwitch("mainpanel", 10);
		ele.doClick(contacts);

	}

}
