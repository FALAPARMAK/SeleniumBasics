package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import util.CommonMethods;

public class doubleClick extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		setUpDriver("chrome", "https://www.saucedemo.com");
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("double");
		Actions action = new Actions(driver);
		action.doubleClick(driver.findElement(By.cssSelector("input#user-name"))).perform();
		Thread.sleep(2000);
		
		
		
//	             senkeys  to the password textbox
//				 double click on the password text
//				 Close the browser 
		
		
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("12345");
		
	    action = new Actions(driver);
		action.doubleClick(driver.findElement(By.cssSelector("input[id#password]"))).perform();
		Thread.sleep(2000);
		driver.close();
	}

}
