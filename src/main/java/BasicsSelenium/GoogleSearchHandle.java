package BasicsSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("Selenium ide");

		List<WebElement> SuggList = driver.findElements(By.xpath("//ul[@role='listbox']//div[@class='wM6W7d']/span"));

		for (WebElement e : SuggList) {
			if (e.getText().equals("Selenium ide")) {
				e.click();
				break;
			}

		}
	}

}
