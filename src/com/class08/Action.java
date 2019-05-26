package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.CommonMethods;

public class Action extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Actions");
		Actions act=new Actions(driver);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		Thread.sleep(3000);
		act.dragAndDrop(source, target).build().perform();
		

	}

}
