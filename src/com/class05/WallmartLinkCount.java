package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WallmartLinkCount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/newowner/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://walmart.com");
		int count=0;
	 	List<WebElement>list=driver.findElements(By.tagName("a"));
		for(WebElement itemList:list) {
			String str=itemList.getText();
			if(!str.isEmpty()) {
				System.out.println(str);
				count++;
			}
		}System.out.println("Total number : "+count);
		driver.quit();
		 

	}

}
