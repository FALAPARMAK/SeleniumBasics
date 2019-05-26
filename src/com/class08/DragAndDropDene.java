package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.CommonMethods;

public class DragAndDropDene extends   CommonMethods  {

	public static void main(String[] args) throws InterruptedException {
		setUpDriver("chrome", "https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(ele);
		WebElement source=driver.findElement(By.cssSelector("div#draggable"));
		WebElement target=driver.findElement(By.cssSelector("div#droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).build().perform();
		driver.close();
		
		
		
		
		 
		
		
	}

}
