package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.CommonMethods;

public class Task  extends CommonMethods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Table headers and rows verification

//		Open chrome browser
//		Go to “https://the-internet.herokuapp.com/”
//		Click on “Click on the “Sortable Data Tables” link
//		Verify tables consist of 4 rows and 6 columns
//		Print name of all column headers
//		Print data of all rows
		
		setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[@href='/tables']")).click();
	List<WebElement>rows=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
	System.out.println("Number of rows ="+rows.size());
		
	for(WebElement ele:rows) {
		System.out.println(ele.getText());
	}
	
	
	List<WebElement>cols=driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
	System.out.println("Number of rows ="+cols.size());
	}

}
