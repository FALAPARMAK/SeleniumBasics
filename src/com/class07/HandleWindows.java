package com.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/newowner/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().fullscreen();
		driver.get("http://uitestpractice.com/Students/Switchto");
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Opens in a new window")).click();
		
		Thread.sleep(3000);
	
		
		Set<String>id=driver.getWindowHandles();
		Iterator<String>it=id.iterator();
		String parent=it.next();
	 	String parentID=driver.getWindowHandle();
		String child=it.next();
		String childID=driver.getWindowHandle();
		
		
		System.out.println(driver.switchTo().window(parent).getTitle()+parentID);
		driver.close();
		System.out.println(driver.switchTo().window(child).getTitle()+childID);
		Thread.sleep(3000);
		//driver.switchTo().window(parent);
		driver.close();
	}

}
