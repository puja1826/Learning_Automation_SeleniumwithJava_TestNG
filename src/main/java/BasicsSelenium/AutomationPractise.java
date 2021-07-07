package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationPractise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//a[@title='Women']")).click();

		driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']")).click();

		String text = driver.findElement(By.xpath("//h1[contains(text(),'Faded Short Sleeve T-shirts'")).getText();

		System.out.println(text);
	}

}
