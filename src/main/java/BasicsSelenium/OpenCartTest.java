package BasicsSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");

		br.launchUrl("https://demo.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		System.out.println(br.doGetTitle());

		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By telePhone = By.id("input-telephone");
		By password = By.id("input-password");
		By confpassword = By.id("input-confirm");
		By agree = By.xpath("//input[@name='agree']");
		By continueButton=By.xpath("//input[@value='Continue']");
		By header=By.xpath("//*[@id=\"content\"]/h1");

		ElementUtil ele = new ElementUtil(driver);

		ele.doSendKeys(firstName, "Test120");
		ele.doSendKeys(lastName, "PT");
		ele.doSendKeys(email, "test124567@gmail.com");
		ele.doSendKeys(telePhone, "01234567890");
		ele.doSendKeys(password, "test");
		ele.doSendKeys(confpassword, "test");
		ele.doClick(agree);
		ele.doClick(continueButton);
		System.out.println(ele.doGetText(header));
		

	}

}
