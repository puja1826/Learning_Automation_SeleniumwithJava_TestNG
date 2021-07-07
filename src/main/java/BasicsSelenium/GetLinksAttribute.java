package BasicsSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetLinksAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Printing the href attribute of the website
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");

		br.launchUrl("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());

		linklist.stream().filter(e -> e.getAttribute("href") != null)
				.filter(e -> !e.getAttribute("href").equals("blank"))
				.filter(e -> !e.getAttribute("href").contains("javascript"))
				.forEach(e -> System.out.println(e.getAttribute("href")));

	}

}
