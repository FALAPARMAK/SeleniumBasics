package com.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import util.CommonMethods;

public class Herokuapp  extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		// Open chrome browser
//   	Go to “https://the-internet.herokuapp.com/”
//		Click on “Multiple Windows” link
//		Click on “Elemental Selenium”
//		Verify title of second window is “Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro”
//		Close second window
//		Click on “Click Here” link
//		Verify title if newly open window is “New Window”
//		Close second window
//		Verify title of second window is “”
//		Quit browser
		
		CommonMethods.setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[starts-with(text(),'Multiple')]")).click();
		Thread.sleep(2000);
		 String parent =driver.getTitle();
	     String parentId= driver.getWindowHandle();
	     System.out.println("title: "+parent+" "+" ID: "+parentId);
	    
	       
	     
	     driver.findElement(By.xpath("//a[starts-with(text(),'Elemental')]")).click();
	     Thread.sleep(2000);
	     Set<String> Windowss = driver.getWindowHandles();
	        Iterator<String> itt = Windowss.iterator();
	        parent=itt.next();
	        String childd= itt.next();
	        driver.switchTo().window(childd);
	        String str=driver.getTitle();
	       String ExpectedTitle= "Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro";
        if(str.equalsIgnoreCase(ExpectedTitle)) {
        	System.out.println("Title is correct");
        }
	        
        
      
		driver.close();
		
		
		
		
		driver.switchTo().window(parent); 
	   driver.findElement(By.xpath("//a[starts-with(text(),'Click')]")).click();
	   Windowss = driver.getWindowHandles();
	   itt = Windowss.iterator();
	   parent=itt.next();
		childd= itt.next();
		driver.switchTo().window(childd);
	   
		String ID=driver.getWindowHandle();
		String tit=driver.getTitle();
		if(tit.equalsIgnoreCase("New Window")) {
			System.out.println(tit+ " is correct");
		}driver.close();
		
		
		
		driver.switchTo().window(parent);
		String parentTittle=driver.getTitle();
		if(parentTittle.equalsIgnoreCase("The Internet")) {
			System.out.println(parentTittle+" is correct");
		}
		
		driver.quit();
		
		

	}

}
