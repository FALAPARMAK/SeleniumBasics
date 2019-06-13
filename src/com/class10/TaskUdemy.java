package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.CommonMethods;

public class TaskUdemy extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String url = "https://www.path2usa.com/travel-companions";
		setUpDriver("chrome", url);
		// April 14
		driver.findElement(By.id("travel_date")).click();
		
		//WebElement month=driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']"));
		
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May")) {
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
			
		}	 
		
		List<WebElement> dates = driver.findElements(By.cssSelector(".day"));
		int count = dates.size();
		System.out.println(count);
		
		for(int i=0; i<count; i++) {
			WebElement date=dates.get(i);
			Thread.sleep(2000);
			String text=date.getText();
			if(text.equalsIgnoreCase("29")) {
				date.click();
				break;
			}
		}
		
		
		//driver.quit();
//		String url="https://www.path2usa.com/travel-companions";
//        setUpDriver("chrome",url);
//        //April 14
//        driver.findElement(By.id("travel_date")).click();
//        WebElement month=driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']"));
//        
//        while(!month.getText().contains("June")) {
//            driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next']")).click();
//        
//            }
//    
//        
//        List<WebElement >dates=driver.findElements(By.cssSelector(".day"));
//        int count=dates.size();
//        
//        for(int i=0; i<count; i++) {
//            WebElement date=dates.get(i);
//            
//            String text=date.getText();
//            
//            if(text.equalsIgnoreCase("30")) {
//                date.click();
//                System.out.println(text);
//                break;
//            }
//        }

	}

}
