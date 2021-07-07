package BasicsSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Global Wait, it will be applied for all the WebElements by default
//		only applicable for WebElements
//		Cannot be applied for WebElements:title,URL,alert
		driver.get("https://demo.opencart.com/index.php?route=account/register");

	}

}
