package BasicsSelenium;

import org.openqa.selenium.WebDriver;

public class JavaScriptUtilConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");
		driver.manage().window().maximize();
		driver.get("https://classic.crmpro.com/index.html");
		JavaScriptUtil jsUtil=new JavaScriptUtil(driver);
		
//		jsUtil.generateAlert("This is CRM PRO page");
		
		jsUtil.getPageInnerText();
	}

}
