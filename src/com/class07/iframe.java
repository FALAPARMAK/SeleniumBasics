package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.CommonMethods;

public class iframe  extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
		//1. way name
		driver.switchTo().frame("iframe_a");
		
//		//2.way webElemement
//		WebElement ele = driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
//				driver.switchTo().frame(ele);
//		 //3. Way  //index
//		driver.switchTo().frame(0);
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input#name")).sendKeys("betul");
		driver.switchTo().defaultContent();

		//driver.quit();
	}

}
