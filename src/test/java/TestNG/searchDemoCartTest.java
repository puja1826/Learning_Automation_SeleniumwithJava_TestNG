package TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class searchDemoCartTest extends BaseTest {

	@DataProvider()
	public Object[][] searchData() {
		return new Object[][] { { "Mac" }, { "PC" },

		};

	}

	
	@Test(dataProvider = "searchData")
	public void searchcontext(String search) {
		driver.findElement(By.xpath("//input[@placeholder='Search']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(search);
		driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();

	}
}
