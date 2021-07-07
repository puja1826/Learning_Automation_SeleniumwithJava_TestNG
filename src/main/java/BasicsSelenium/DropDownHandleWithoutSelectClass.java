package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDownHandleWithoutSelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");
		driver.manage().window().maximize();

		driver.get("https://www.orangehrm.com/open-source/register-to-download/");
		ElementUtil ele = new ElementUtil(driver);

		By industry = By.xpath("//select[@id='Form_submitRequest_Industry']/option");
		ele.DropDownHandleValue(industry, "Education");

	}

}
