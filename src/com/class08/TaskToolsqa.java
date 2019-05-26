package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.CommonMethods;

public class TaskToolsqa  extends CommonMethods{

//	Navigate to https://www.toolsqa.com
//      Hover over the Tutorial menu
//      Click on Software Testing Tutorial
//      Close the browser
	public static void main(String[] args) {
		
		CommonMethods.setUpDriver("chrome", "https://www.toolsqa.com");
		WebElement element=driver.findElement(By.xpath("//span[text()='menu-text']"));
		Actions action=new Actions(driver);
		action.moveToElement(element).click().perform();
		driver.findElement(By.linkText("Software Testing Tutorial")).click();
		driver.close();
		
		
		
		

	}

}
