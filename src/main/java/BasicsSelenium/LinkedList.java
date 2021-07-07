package BasicsSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");

		br.launchUrl("https://tuclothing.sainsburys.co.uk/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("The List of links on the webpage" + links.size());
		
		links.stream().filter(e->e.getAttribute("href")!=null)
              .forEach(e -> System.out.println(e.getAttribute("href")));
		
		

	}

}
