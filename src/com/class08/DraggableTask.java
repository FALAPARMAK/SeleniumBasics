package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.CommonMethods;

public class DraggableTask extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
//		   Ahead to https://jqueryui.com/droppable/
//			handle the frame
//			drag and drop
//			close browser
		//*[@id="content"]/div[2]
		CommonMethods .setUpDriver("chrome", "https://jqueryui.com/droppable/");
		//driver.switchTo().frame(0);
		//div[id='draggable']
		//driver.findElement(By.cssSelector("div[id='draggable']"));
		Thread.sleep(2000);
		WebElement frame=driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(frame);
		
	WebElement	source=driver.findElement(By.cssSelector("div[id='draggable']"));
	WebElement target=	driver.findElement(By.cssSelector("div[id='droppable']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).perform();
		
	}

}
