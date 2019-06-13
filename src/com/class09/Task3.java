package com.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.CommonMethods;

public class Task3 extends CommonMethods {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		TC 3: Verify element is enabled1.Open chrome browser
//		2.Go to “https://the-internet.herokuapp.com/”
//			3.Click on “Click on the “Dynamic Controls” link
//			4.Click on enable button
//			5.Enter “Hello” and verify text is entered successfully
//			6.Close the browser
		String url = "https://the-internet.herokuapp.com/";
	setUpDriver("chrome", url);
	driver.findElement(By.linkText("Dynamic Controls")).click();
	 WebDriverWait wait = new WebDriverWait(driver, 30);
	WebElement element=driver.findElement(By.cssSelector("button[onclick='swapInput()']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("button[onclick='swapInput()']"))));
	element.sendKeys("HELLO");
	
	
     driver.findElement(By.cssSelector("button[onclick='swapInput()']")).click();
    WebElement message= driver.findElement(By.id("message"));
     
     if(message.isDisplayed()) {
    	System.out.println( message.getText());
     }else {
    	 System.out.println("Message is not displayed");
     }
     driver.quit();
		
	}

}
