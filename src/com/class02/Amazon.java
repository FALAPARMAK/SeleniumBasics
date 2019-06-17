package com.class02;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/newowner/Selenium/chromedriver" );
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		String title=driver.getTitle();
		
		if(title.equalsIgnoreCase("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")) {
			System.out.println("This is the right tittle");
		}else {
			System.out.println("Sorry!This is not right tittle");
		}
		
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sell=ts.getScreenshotAs(OutputType.FILE);
		
		
		try {
			FileUtils.copyFile(sell,new File("Users/newowner/Desktop/screen/sell.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("selfie not taken");
		}
		Thread.sleep(3000);
        driver.close();
	}
	

}
