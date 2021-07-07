package BasicsSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRMTestUseCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");

		br.launchUrl("https://www.orangehrm.com/open-source/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		System.out.println(br.doGetTitle());

		By firstName = By.id("Form_submitRequest_FirstName");
		By companyName = By.id("Form_submitRequest_CompanyName");
		By jobTitle = By.id("Form_submitRequest_JobTitle");
		By phone = By.id("Form_submitRequest_Phone");
		By lastName = By.xpath("//input[@id='Form_submitRequest_LastName']");
		By email = By.xpath("//input[@id='Form_submitRequest_Email']");

		ElementUtil ele = new ElementUtil(driver);
		ele.doSendKeys(firstName, "Test");
		ele.doSendKeys(companyName, "Axis");
		ele.doSendKeys(jobTitle, "Manager");
		ele.doSendKeys(phone, "01234567890");
		ele.doSendKeys(lastName, "Axis");
		ele.doSendKeys(email, "test12345@gmail.com");

	}

}
