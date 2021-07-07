package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoCart {

	public WebDriver driver;

	@BeforeSuite
	public void setupDB() {
		System.out.println("BS-Setup DB");

	}

	@BeforeTest
	public void createUser() {
		System.out.println("BT---------Create User");

	}

	@BeforeClass
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("naveenanimation20@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		System.out.println("BC---------Launch Browser");

	}

	@BeforeMethod
	public void logintoApp() {
		System.out.println("BM----Login to APP");
	}

	@Test
	public void accountPageTitleTest() {

		String text = driver.getTitle();
		System.out.println("The title of the page:" + text);
		Assert.assertEquals(text, "My Account"); // Assert is a class, its a static method
	}

	@Test
	public void logoutLinkTest() {

		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());

	}

	@Test
	public void searchBarTest() {
		Assert.assertTrue(driver.findElement(By.name("search")).isDisplayed());
	}

	@AfterMethod
	public void logout() {

		driver.findElement(By.linkText("Logout")).click();

	}

	@AfterClass

	public void closeBrowser() {
		driver.quit();

	}

	@AfterTest

	public void deleteUser() {

		System.out.println("AT----Delete User"); // It picks the test cases based on alphabetic order
	}

	@AfterSuite

	public void disconnectDB() {

		System.out.println("AS------Db Disconnected");
	}
}