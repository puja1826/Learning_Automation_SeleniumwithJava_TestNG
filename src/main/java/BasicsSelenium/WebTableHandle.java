package BasicsSelenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(
				"https://www.espncricinfo.com/series/kwibuka-women-s-twenty20-2021-1265208/kenya-women-vs-namibia-women-7th-match-1265219/full-scorecard");

		getScoreCard("Queentor Abel").stream()
		.forEach(e -> System.out.println(e + " "));
	}
	
	/*
	 * public static String getWicketTakerName(String bowler) { return driver
	 * .findElement (By.xpath("//a[text()='"+bowler+
	 * "']/parent::td//following-sibling::td[@class='text-left']")) .getText(); }
	 */

	public static List<String> getScoreCard(String bowler) {
		List<WebElement> wicketList = driver
				.findElements(By.xpath("//a[text()='" + bowler + "']/parent::td//following-sibling::td"));
		List<String> wicketvallist = new ArrayList<String>();
		for (int i = 0; i <= wicketList.size() - 1; i++) {
			String text = wicketList.get(i).getText();
			if (!text.isBlank()) {
				wicketvallist.add(text);
			}
		}
		return wicketvallist;
	}

}
