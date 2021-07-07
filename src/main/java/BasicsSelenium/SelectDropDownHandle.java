package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectDropDownHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");
		driver.manage().window().maximize();

		driver.get("https://www.orangehrm.com/open-source/register-to-download/");
		By industry = By.id("Form_submitRequest_Industry");
		By country = By.id("Form_submitRequest_Country");
		ElementUtil ele = new ElementUtil(driver);
		ele.doSelectDropDownByIndex(country, 3);
		ele.doSelectDropDownByValue(industry, "Education");
	}

}
