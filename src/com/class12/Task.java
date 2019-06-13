package com.class12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import util.CommonMethods;

public class Task extends CommonMethods {
//	
//			TC 1: OrangeHRM Login
//
//			Navigate to “https://opensource-demo.orangehrmlive.com/”
//			Login to the application
//			Verify user is successfully logged in
//
//			Note: must use properties file
	 
	@Test
	public void File() {
	String filePath="src/configs/creentials.properties";
	Properties pro = null;
	try {
	FileInputStream fis=new FileInputStream(filePath);
	pro=new Properties();
	pro.load(fis);
	
	}catch(FileNotFoundException e){ 
		e.printStackTrace();
	} 
	 catch (IOException e) {
		e.printStackTrace();
	}
	CommonMethods.setUpDriver(pro.getProperty("browser"), pro.getProperty("url"));
	driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
	
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.cssSelector("input#btnLogin")).click();
	
	//
	
	
	
	}
	
	
}
