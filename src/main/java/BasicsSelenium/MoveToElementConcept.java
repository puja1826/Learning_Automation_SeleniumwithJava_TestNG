package BasicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");

		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();

		Actions move = new Actions(driver);
		WebElement login = driver.findElement(By.xpath("//a[@id='ctl00_HyperLinkLogin']"));
//		WebElement TravelAgent = driver.findElement(By.xpath("//a[text()='Travel Agent Login']"));
		WebElement spiceClub = driver.findElement(By.xpath("//a[text()='SpiceClub Members']"));
		WebElement members = driver.findElement(By.xpath("//a[text()='Member Login']"));

		// Actions
		move.moveToElement(login).perform();
		move.moveToElement(spiceClub).build().perform();
		move.moveToElement(members).build().perform();
		

//		move.moveToElement(TravelAgent).build().perform();
//		TravelAgent.click();
//		Thread.sleep(3000);
//		move.moveToElement(spiceClub).perform();
//		Thread.sleep(3000);
//		move.moveToElement(members).perform();

	}

}
