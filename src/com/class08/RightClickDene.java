package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.CommonMethods;

public class RightClickDene extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		setUpDriver("chrome","https://www.saucedemo.com");
		WebElement right=driver.findElement(By.cssSelector("input#user-name"));
		Actions act=new Actions(driver);
		
		act.contextClick(right).build().perform();
		Thread.sleep(3000);
		act.release(right).perform();
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
	}

}
