package com.exm;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alertt {

	public static void main(String[] args) throws InterruptedException {
		
		
//			Open chrome browser
//			Go to “https://www.seleniumeasy.com/test/javascript-alert-box-demo.html”
//			Verify
//			alert box with text “I am an alert box!” is present
//			confirm box with text “Press a button!” is present
//			prompt box with text “Please enter your name” is present
//			Quit browser
		
		System.setProperty("webdriver.chrome.driver", "/Users/newowner/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println(text);
		if(text.equals("I am an alert box!")) {
			alert.accept();
		}
		Thread.sleep(7000);
		driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
		Alert alert2=driver.switchTo().alert();
		String text2=alert2.getText();
		if(text2.equals("Press a button!")) {
	 		alert2.accept();
		}
		Thread.sleep(7000);
		driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
		Alert alert3=driver.switchTo().alert();
		String text3=alert3.getText();
		if(text3.equals("Please enter your name")) {
			alert3.accept();
		}
		driver.quit();
	}

}
