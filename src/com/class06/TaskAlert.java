package com.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskAlert {

	public static void main(String[] args) throws InterruptedException {
		// : JavaScript alert text verification
//		Open chrome browser
//		Go to “https://www.seleniumeasy.com/test/javascript-alert-box-demo.html”
//		Verify
//		alert box with text “I am an alert box!” is present
//		confirm box with text “Press a button!” is present
//		prompt box with text “Please enter your name” is present
//		Quit browser
		System.setProperty("webdriver.chrome.driver", "/Users/newowner/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

		driver.findElement(By.cssSelector("button[class*='btn btn-default']")).click();
 
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		String text = alert.getText();
		System.out.println(text);
		if (text.equalsIgnoreCase("I am an alert box!")) {
			alert.accept();
		}

		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
		
		Alert alert1 = driver.switchTo().alert();
	 	Thread.sleep(2000);
		String text1 = alert1.getText();
		System.out.println(text1);
		Thread.sleep(2000);
		if (text1.equalsIgnoreCase("Press a button!")) {
			alert1.accept();
		}
		driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']")).click();
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(2000);
		String text2 = alert2.getText();
		System.out.println(text2);
		Thread.sleep(2000);
		if(text2.equalsIgnoreCase("Please enter your name")) {
			alert2.accept();
			
		}
		driver.quit();
	}

}
