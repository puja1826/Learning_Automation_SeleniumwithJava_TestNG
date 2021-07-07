package BasicsSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TotalImagesOnPage {
	// WebScrapping- basically used to check pricing and images and products is
	// introduced

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");

		br.launchUrl("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		List<WebElement> imgList = driver.findElements(By.tagName("img"));
		System.out.println("the Total no of images" + imgList.size());

		for (WebElement e : imgList) {

			String SrcVal = e.getAttribute("src");
			String AltVal = e.getAttribute("alt");
			System.out.println(SrcVal + ":" + AltVal);
			

		}
	}

}
