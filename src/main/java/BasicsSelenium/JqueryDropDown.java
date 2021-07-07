package BasicsSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JqueryDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		driver.findElement(By.id("justAnInputBox")).click();
		List<WebElement> optionList = driver.findElements(By.cssSelector("span.comboTreeItemTitle "));
		for (int i = 0; i <= optionList.size(); i++) {
//			System.out.println(optionList.size());
			String text = optionList.get(i).getText();
			System.out.println(text);

			if (text.equals("choice 1")) {

				optionList.get(i).click();
				break;

			}
		}

	}

}
