package com.class11;

import org.openqa.selenium.By; 

import util.CommonMethods;

public class Homework  extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
//		TC 1: OrangeHRM Login
//		1.Navigate to “https://opensource-demo.orangehrmlive.com/”
//		2.Login to the application by writing xpath based on “parent and child relation”
//			
//			TC 1: OrangeHRM Login
//			3.Navigate to “https://opensource-demo.orangehrmlive.com/”
//			4.Login to the application by writing xpath based on “following and preceding siblings”
		String url="https://opensource-demo.orangehrmlive.com/";
		setUpDriver("chrome", url);
		driver.findElement(By.xpath("//div[@id='divUsername']/input")).sendKeys("Admin");
		driver.findElement(By.xpath("//div[@id='divPassword']/input")).sendKeys("admin123");
	driver.findElement(By.xpath("//div[@id='divLoginButton']/input")).click();
	Thread.sleep(4000);
		driver.quit();
		
		
		
	}

}
