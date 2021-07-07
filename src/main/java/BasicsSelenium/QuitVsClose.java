package BasicsSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuitVsClose {

	public static void main(String[] args) {
 
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		String title = driver.getTitle();
		System.out.println("Title of the page:" + title);
		System.out.println("The Current Url of the Page:" +driver.getCurrentUrl());
		//driver.quit();
		
		driver.close();
		System.out.println(driver.getCurrentUrl());
		
		

	}

}
