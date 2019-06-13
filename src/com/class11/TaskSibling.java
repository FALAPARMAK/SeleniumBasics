package com.class11;

import org.openqa.selenium.By;

import util.CommonMethods;

public class TaskSibling  extends CommonMethods{

	public static void main(String[] args) {
	setUpDriver("chrome", "https://opensource-demo.orangehrmlive.com/");
	
	
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	//driver.findElement(By.xpath("//input[@id='txtPassword']/following-sibling::span")).sendKeys("admin123");
	//driver.findElement(By.xpath("//input[@id='txtPassword']/../span")).sendKeys("admin123");
	driver.findElement(By.xpath("//div[@id='divPassword']/input")).sendKeys("admin123");
	
	
	
	
	
	}

}
