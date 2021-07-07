package BasicsSelenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/login");

		By email = By.id("input-email");
//    	By password = By.id("input-password");
//	    By login = By.xpath("//input[@value='Login']");
//	    
	    Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
	    		.withTimeout(Duration.ofSeconds(10))
	    		.withMessage("Element not availaible....")
	    		.pollingEvery(Duration.ofMillis(2))
	    		.ignoring(NoSuchElementException.class,StaleElementReferenceException.class);
	    		
	    		wait.until(ExpectedConditions.presenceOfElementLocated(email)).sendKeys("test@gmail.com");
	    		             

	}

}
