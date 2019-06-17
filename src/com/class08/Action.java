package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import util.CommonMethods;

public class Action extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Actions");
		Actions act=new Actions(driver);
		
		
		//act.click(driver.findElement(By.xpath("//button[@name='click']"))).perform();
		//Thread.sleep(2000);
		act.doubleClick(driver.findElement(By.xpath("//button[@name='dblClick']"))).perform();
		Thread.sleep(2000);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		Thread.sleep(3000);
		act.dragAndDrop(source, target).build().perform();
		
//		
//		System.setProperty("webdriver.chrome.driver","/Users/newowner/Selenium/chromedriver");
//		WebDriver driver=new ChromeDriver();
//		driver.get("http://uitestpractice.com");
//		Actions act=new Actions(driver);
//		//
//		
//		;
//		
//		Thread.sleep(3000);
//		WebElement source=driver.findElement(By.id("draggable"));
//		WebElement target=driver.findElement(By.id("droppable"));
//		Thread.sleep(3000);
//		act.dragAndDrop(source, target).build().perform();
//		
	}
	
}
