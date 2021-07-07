package BasicsSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectDropDownGetOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");
		driver.manage().window().maximize();

		driver.get("https://www.orangehrm.com/open-source/register-to-download/");
		By industry = By.id("Form_submitRequest_Industry");
		ElementUtil ele = new ElementUtil(driver);
		List<String> indus_list = ele.doSelectDropDownOptions(industry);
		ele.doSelectDropDownByValue(industry, "Education");

		if (indus_list.size() == 21) {

			System.out.println("Correct Size");
		}

		if (indus_list.contains("Education")) {
			System.out.println("Education matches");
		}

	}
}