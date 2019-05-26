package Review;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/newowner/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='u_0_c']")).sendKeys("	ABCDE");
		driver.findElement(By.xpath("//input[@id='u_0_e']")).sendKeys("HJKLJH");
		driver.findElement(By.cssSelector("input[id='u_0_h']")).sendKeys("betul@hotmail.com");
		driver.findElement(By.cssSelector("input[id='u_0_o']")).sendKeys("123432");
		WebElement months=driver.findElement(By.cssSelector("select[id='month']"));
		Select month=new Select(months);
		month.selectByVisibleText("Sep");
		
		WebElement days=driver.findElement(By.id("day"));
		Select day=new Select(days);
		day.selectByIndex(2);
		 
		WebElement years=driver.findElement(By.xpath("//select[@aria-label='Year']"));
		Select year=new Select(years);
		year.selectByVisibleText("1990");
		driver.quit();
	}

}
