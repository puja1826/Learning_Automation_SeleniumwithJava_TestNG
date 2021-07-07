package BasicsSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindElementsLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");

		br.launchUrl("https://www.tesco.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		// Find Element return type is WebElement
		// Find Elements return type is List<WebElements>
		// List is Order Based
		// length is for array
		// Size is for array list
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links in the page:" + linklist.size());

		
		/*
		 * // Method 1: for (int i = 1; i <= linklist.size(); i++) { String text =
		 * linklist.get(i).getText(); System.out.println(text);
		 * 
		 * if(!text.isEmpty()){ System.out.println(text); }
		 * 
		 * 
		 * }
		 */
		//For Each Loop
		/*
		 * for(WebElement e:linklist) { if(!e.getText().isEmpty()) {
		 * System.out.println(e.getText()); } }
		 */
	// Streams
	/*
	 * linklist .stream() .filter(e->!e.getText().isEmpty())
	 * .forEach(e->System.out.println(e.getText()));
	 */
		
		//Parallel Streams
		
		linklist.parallelStream().filter(e->!e.getText().isBlank()).forEach(e->System.out.println(e.getText()));
		
	}

}
