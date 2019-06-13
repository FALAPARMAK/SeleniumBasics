package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.CommonMethods;

public class Dene3  extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		
//			// TODO Auto-generated method stub
//			TC 1: Table headers and rows verification
//			1.Open chrome browser
//			2.Go to “https://jqueryui.com/”
//			 3.Click on “Datepicker”
//			4.Select August 10 of 2019
			//5.Verify date “08/10/2019” has been entered succesfully
//			6.Close browser
		String url="https://jqueryui.com/";
		setUpDriver("chrome", url);
		driver.findElement(By.linkText("Datepicker")).click();
	   WebElement frame=driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("datepicker")).click();
		
		while(!driver.findElement(By.cssSelector("div[class='ui-datepicker-title']")).getText().contains("August 2019")) {
			driver.findElement(By.cssSelector("span[class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		
		


	List<WebElement>cells=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		System.out.println(cells.size());
		
		for(int i=0; i<cells.size(); i++) {
			
				WebElement element=cells.get(i);
				if(element.getText().equals("10")) {
				driver.findElement(By.linkText("10")).click();
			}
		}
		String text=driver.findElement(By.id("datepicker")).getText();
		Thread.sleep(2000);
		System.out.println("Date is : "+text);
		driver.quit();
	}}
