package com.class10;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.CommonMethods;

public class GrupTask3 extends CommonMethods{

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		TC 1: Table headers and rows verification
//		1.Open chrome browser
//		2.Go to “https://jqueryui.com/”
//		 3.Click on “Datepicker”
//		4.Select August 10 of 2019
		//5.Verify date “08/10/2019” has been entered succesfully
//		6.Close browser
		
		String url="https://jqueryui.com/";
		setUpDriver("chrome", url);
		driver.findElement(By.linkText("Datepicker")).click();
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id='datepicker']")).click();
	     while(!driver.findElement(By.cssSelector("[class='ui-datepicker-title']")).getText().contains("August 2019")) {
	            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	           }
//		  
       List<WebElement> cell= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
	     System.out.println("Size of rows : "+cell.size());
      for(int i=1; i<cell.size(); i++) {
    	 WebElement dates= cell.get(i);
    	
    	 if(dates.getText().equals("10")) {
    		 dates.click();
    	 }
      }
    	 String expectedDate=driver.findElement(By.id("datepicker")).getAttribute("value");
    	 if(expectedDate.equals("08/10/2019")) {
    		 System.out.println("Test passed");
    	 }else {
    		 System.out.println("Test failed");
    	 }
      
      
    	  driver.quit();
       
	     
////	
	}

}
