package com.class12;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class BrokenLinkExample {
	
	WebDriver driver;
	String url="http://newtours.demoaut.com/";
	

	@BeforeMethod
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/newowner/Selenium/chromedriver");
	    driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
	}
	@Test
	public void Links() {
		List<WebElement>links=driver.findElements(By.tagName("a"));
//		System.out.println("Total links="+links.size());
		for(WebElement link:links) {
			String linkText=link.getAttribute("href");
			
			
			
			try {
			URL url=new URL(linkText);
			HttpURLConnection con=(HttpURLConnection)url.openConnection();
			int code=con.getResponseCode();
			if(code==200) {
				
				System.out.println("link is valid "+link.getText());
			}else {
				System.out.println("link is not valid");
			}
			
			}catch(Exception  e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	}


