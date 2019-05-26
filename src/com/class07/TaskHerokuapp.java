package com.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.CommonMethods;

public class TaskHerokuapp extends CommonMethods  {

	public static void main(String[] args) throws InterruptedException {

		// Open chrome browser
//   	Go to “https://the-internet.herokuapp.com/”
//		Click on “Multiple Windows” link
//		Click on “Elemental Selenium”
//		Verify title of second window is “Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro”
//		Close second window
//		Click on “Click Here” link
//		Verify title if newly open window is “New Window”
//		Close second window
//		Verify title of second window is “The Internet”
//		Quit browser
		
		
		CommonMethods.setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		Thread.sleep(2000);
		String parent=driver.getWindowHandle();
		System.out.println(parent+" "+driver.getTitle());
		driver.findElement(By.linkText("Elemental Selenium")).click();
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title); 
		String expectedTitle="Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro";
		
		Set<String>windows=driver.getWindowHandles();
		Iterator<String>it=windows.iterator();
		String childID="";
		while(it.hasNext()) {
			String ID=it.next();
			if(!parent.equals(ID)) {
				childID=ID;
			}
		}//driver.close();
		
		Thread.sleep(2000);
		driver.switchTo().window(childID);
		Thread.sleep(2000);
		String tit=driver.getTitle();
		System.out.println(tit);
		if(tit.equalsIgnoreCase(expectedTitle)) {
			System.out.println("You are in the right page");
		}else {
			System.out.println("You are in the wrong page");
		}
		driver.close();
		
		Thread.sleep(4000);
		driver.switchTo().window(parent);
		Thread.sleep(4000);
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(4000);

		

		windows=driver.getWindowHandles();
		it=windows.iterator();
	    while(it.hasNext()) {
			String ID=it.next();
			if(!parent.equals(ID)) {
				childID=ID;
			}Thread.sleep(4000);
	    }
			driver.switchTo().window(childID);
			Thread.sleep(4000);
			title=driver.switchTo().window(childID).getTitle();
			expectedTitle="New Window";
			if(title.equalsIgnoreCase(expectedTitle)) {
	 			System.out.println("New Window is the right page");
			}else {
				System.out.println("You are in the wrong page");
			}
			driver.close();	
		//driver.quit();
		
	}
}