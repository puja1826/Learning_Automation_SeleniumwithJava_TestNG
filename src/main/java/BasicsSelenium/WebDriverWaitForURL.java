package BasicsSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
*/
public class WebDriverWaitForURL {

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");

		br.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		ElementUtil ele = new ElementUtil(driver);

		By emailId = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//input[@value='Login']");
		ele.doSendKeys(emailId, "naveenanimation20@gmail.com");
		ele.doSendKeys(password, "Selenium12345");
		ele.doClick(loginBtn);
		
		if(ele.waitForUrlFraction("route=account/account", 10)){
			System.out.println("Home page has the correct URL");
		}
		
		/*
		 * WebDriverWait wait=new WebDriverWait(driver,10); boolean
		 * b=wait.until(ExpectedConditions.urlContains("route=account/account")); if(b)
		 * {
		 * 
		 * System.out.println("Home page has the correct URL"); }
		 */

	}

}
