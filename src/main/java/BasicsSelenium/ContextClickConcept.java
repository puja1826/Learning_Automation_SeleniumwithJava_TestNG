package BasicsSelenium;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContextClickConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();

		Actions act = new Actions(driver);

		WebElement rightclckbtn = driver.findElement(By.xpath("//span[text()='right click me']"));
		act.contextClick(rightclckbtn).build().perform();

		List<WebElement> list = driver.findElements(
				By.cssSelector("ul.context-menu-list.context-menu-root li.context-menu-item.context-menu-icon span"));

		for (WebElement e : list) {

			System.out.println(e.getText());
			if (e.getText().equals("Copy")) {
				e.click();
			}
			if (e.getText().equals("Edit")) {
				e.click();
			}
			if (e.getText().equals("Cut")) {
				e.click();
				break;
			}

		}

		WebDriverWait wait = new WebDriverWait(driver, 5);

		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alert.getText());
		alert.accept();
	}

}
