package com.class06;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropppp {

	public static void main(String[] args) throws InterruptedException {
	 	// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/newowner/Selenium/chromedriver");
		System.setProperty("webdriver.gecko.driver", "/Users/newowner/Selenium/geckodriver");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		WebElement country=driver.findElement(By.cssSelector("select#continents"));
		Select select=new Select(country);
		List<WebElement>options=select.getOptions();
		System.out.println("All countries in DD : "+options.size());
		Thread.sleep(2000);
		Iterator<WebElement>it=options.iterator();
		while(it.hasNext()) {
			String text=it.next().getText(); 
			System.out.println(text);
		}
		select.selectByVisibleText("Antartica");
		select.selectByIndex(2);
		Thread.sleep(3000);
		
		WebElement commandDD=driver.findElement(By.id("selenium_commands"));
		Select selectt=new Select(commandDD);
		List<WebElement>com=selectt.getOptions();
		System.out.println("All commands size : "+com.size());
		Iterator<WebElement>itt=com.iterator();
		while(itt.hasNext()) {
			String textt=itt.next().getText();
			System.out.println(textt);
		}
		Thread.sleep(3000);
		select.selectByVisibleText("Navigation Commands");
		 driver.quit();
		
		 
		
	}

}
