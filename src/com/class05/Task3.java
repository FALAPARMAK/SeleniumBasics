package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

 	public static void main(String[] args) throws InterruptedException {
		//Check all Years of Experience radio buttons are clickable
		//* -----------------------------------------------
		//* Check all Automation Tools checkboxes are clickable
		//* and keep “Selenium WebDriver” option as selected
		
		System.setProperty("webdriver.chrome.driver", "/Users/newowner/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		List<WebElement> radioExp=driver.findElements(By.xpath("//input[@name='exp']"));
		Thread.sleep(1000);
		for (WebElement radio: radioExp) {
			if(radio.isEnabled()) {
				radio.click();
				Thread.sleep(2000);
			}
		}
		Thread.sleep(1000);
		 List<WebElement>element=driver.findElements(By.cssSelector("input[id='profession-0']"));
		for(WebElement web:element) {
			if(web.isEnabled()) {
			String str=web.getAttribute("value");
			
				System.out.println(str);
				if(str.equals("Manual Tester")) {
					web.click();
				}
			}	
			
		}
 
	}

}
