package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.CommonMethods;

public class TaskDynamicTable extends CommonMethods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TC 1: Table headers and rows verification
//
//		Open chrome browser
//		Go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
//		Login to the application
//		Verify customer “Susan McLaren” is present in the table
//		Click on customer details
//		Update customers last name
//		Verify updated customers name is displayed in table
//		Close browser
		
		setUpDriver("chrome","http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx" );
		driver.findElement(By.cssSelector("input[name$='username']")).sendKeys("Tester");
		sendText(driver.findElement(By.cssSelector("input[id*='password']")), "test");
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		//ctl00_MainContent_orderGrid
		List<WebElement>rows=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
		//List<WebElement>rows=driver.findElements(By.cssSelector("table[class='SampleTable']/tbody/tr"));
		System.out.println(rows.size());
	}

}
