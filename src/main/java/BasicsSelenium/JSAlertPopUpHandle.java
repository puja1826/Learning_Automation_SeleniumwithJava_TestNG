package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JSAlertPopUpHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		
		driver.switchTo().alert();
		
	}

}
