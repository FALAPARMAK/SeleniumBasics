package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * : Facebook dropdown verification Open chrome browser Go to
		 * “https://www.facebook.com” Verify: month dd has 12 month options day dd has
		 * 31 day options year dd has 115 year options Select your date of birth Quit
		 * browser
		 */
		System.setProperty("webdriver.chrome.driver", "/Users/newowner/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("u_0_c")).sendKeys("Betul");
		driver.findElement(By.id("u_0_e")).sendKeys("Tarik");
		driver.findElement(By.id("u_0_h")).sendKeys("23212223390");
		driver.findElement(By.id("u_0_o")).sendKeys("232123");

		WebElement monthsDD = driver.findElement(By.cssSelector(("select#month")));

		Select obj = new Select(monthsDD);
		// get all options
		List<WebElement> allOptions = obj.getOptions();
		System.out.println(allOptions.size());
		obj.selectByIndex(9);
		//obj.selectByVisibleText("April");
		Thread.sleep(2000);

		WebElement dayDD = driver.findElement(By.cssSelector("select#day"));
		Select obj1 = new Select(dayDD);
		List<WebElement> allOption = obj.getOptions();
		System.out.println(allOption.size());
		obj1.selectByIndex(2);
		//obj1.selectByValue("12");
		Thread.sleep(2000);

		WebElement yearDD = driver.findElement(By.cssSelector("select#year"));
		Select obj2 = new Select(yearDD);
		List<WebElement> allOpt = obj.getOptions();
		int size=allOpt.size();
		System.out.println(size);
		obj2.selectByValue("1995");
		Thread.sleep(2000);

		//driver.quit();
	}

}
