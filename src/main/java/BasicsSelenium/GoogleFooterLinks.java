package BasicsSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleFooterLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		List<WebElement> footerList=driver.findElements(By.xpath("//div[@class='o3j99 c93Gbe']//a"));
		
		for(WebElement e:footerList) {
			String text=e.getText();
			
			if(text.equals("Business")) {
				e.click();
				break;
			}
		}
	}

}
