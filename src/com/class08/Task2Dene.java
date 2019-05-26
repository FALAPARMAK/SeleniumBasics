package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.CommonMethods;

public class Task2Dene extends CommonMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Ahead to http://uitestpractice.com/Students/Index
//		Click on the Actions
//		Handle the drag and drop
//		Close the browser
		
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Index");
		//driver.findElement(By.cssSelector("a[href$='Actions']")).click();
		driver.findElement(By.linkText("Actions")).click();
		//WebElement source=driver.findElement(By.cssSelector("div#draggable"));
		//WebElement target=driver.findElement(By.cssSelector("div#droppable"));
		
		WebElement one=driver.findElement(By.xpath("//li[text()='1']"));
		WebElement two=driver.findElement(By.xpath("//li[text()='2']"));
		WebElement three=driver.findElement(By.xpath("//li[text()='3']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(one).clickAndHold().moveToElement(two).clickAndHold().moveToElement(three).build().perform();
		driver.close();
	}

}
