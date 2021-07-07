package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchWithoutLoop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
        Thread.sleep(4000);
        driver.findElement(By.name("search_query")).sendKeys("dress");
	}

}
