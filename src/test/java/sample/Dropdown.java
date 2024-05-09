package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testingshastra.com/");
		driver.manage().window().maximize();
		driver.findElement(
				By.xpath("//div[@id='popmake-22568']//button[@class='pum-close popmake-close' and @type='button']"))
				.click();
		WebElement element = driver.findElement(By.xpath("//select[@id='input_5_4']"));
		Select courses = new Select(element);
		// 1-Select-Byvalue
		// courses.selectByValue("Automation Testing (Python Selenium)");
		// 2-Select-ByVisibleText
		// courses.selectByVisibleText("REST API Testing");
		// 3-Select-ByIndex
		// courses.selectByIndex(6);
		// 4.Without using Select Class
		List<WebElement> allOptions = courses.getOptions();
		for (WebElement option : allOptions) {
			if (option.getText().equals("Automation Testing (Python Selenium)")) {
				option.click();
				break;

			}

		}

	}

}
