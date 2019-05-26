package com.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import util.CommonMethods;

public class Deneme extends CommonMethods{
	public static void main(String[] args) throws InterruptedException {
//		Open chrome browser
//			Go to “https://the-internet.herokuapp.com/”
//				Click on “Multiple Windows” link
//				Click on “Elemental Selenium”
//				Verify title of second window is “Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro”
//				Close second window
//				Click on “Click Here” link
//				Verify title if newly open window is “New Window”
//				Close second window
//				Verify title of second window is “The Internet”
//				Quit browser
			CommonMethods.setUpDriver("chrome", "https://the-internet.herokuapp.com/");
	        driver.findElement(By.xpath("//a[starts-with(text(),'Multiple')]")).click();
	        driver.findElement(By.xpath("//a[starts-with(text(),'Elemental')]")).click();
			Set<String>ids=driver.getWindowHandles();
			Thread.sleep(2000);
			Iterator<String> it=ids.iterator();
			String parentID=it.next();
			Thread.sleep(2000);
			String childID=it.next();
			String childTitle=driver.switchTo().window(childID).getTitle();
			Thread.sleep(2000);
			String expectedTitle="Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro";
			if(childTitle.equalsIgnoreCase(expectedTitle)) {
			    System.out.println("Child window title is expected title");
			}else {
				System.out.println("It is not expected title");
			}
		   driver.close();
			
//			
			driver.findElement(By.xpath("//a[starts-with(text(),'Click')]")).click();
			childID=driver.getWindowHandle();
			Thread.sleep(2000);
			childTitle=driver.switchTo().window(childID).getTitle();
			System.out.println(childTitle);
			
			Thread.sleep(2000);
			if(childTitle.equalsIgnoreCase("New Window")) {
				System.out.println("'New Window' is the correct title");
//				
			}else {
				System.out.println("it is Not the expected  title ");
			}
			driver.close();
			
//			
			//String child2ID=driver.getWindowHandle();
		    String parentTitle=driver.switchTo().window(parentID).getTitle();
		    System.out.println(driver.getTitle());
			if(parentTitle.equalsIgnoreCase("The Internet")) {
				System.out.println("it is the correct title");
//				
			}else {
				System.out.println("it is Not the expected  title ");
			}
			driver.quit();
//		  
		}

}
