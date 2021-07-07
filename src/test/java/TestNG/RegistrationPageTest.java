package TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationPageTest extends BaseTest {

	@DataProvider()
	public Object[][] registratonData() {
		return new Object[][]  {
			{"test", "1","test321@gmail.com","0123456789","test123","test123"},
			{"rest" , "2","rest@gmail.com","1234567890","rest123","rest123"},
			
					};	
					
	}
	
	@Test(dataProvider = "registratonData")
	public void doRegistration(String fName,String lName,String email,String phone,String pass,String Cpass ) {
		driver.findElement(By.id("input-firstname")).clear();
		driver.findElement(By.id("input-firstname")).sendKeys(fName);
		driver.findElement(By.id("input-firstname")).clear();
		driver.findElement(By.id("input-lastname")).sendKeys(lName);
		driver.findElement(By.id("input-lastname")).clear();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-telephone")).sendKeys(phone);
		driver.findElement(By.id("input-telephone")).clear();
		driver.findElement(By.id("input-password")).sendKeys(pass);
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-confirm")).sendKeys(Cpass);
		driver.findElement(By.xpath("//input[@value='0']")).click();
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		
		
		
	}
}
