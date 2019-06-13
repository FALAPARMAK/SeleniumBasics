package com.class12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import util.CommonMethods;

public class FlightSearch extends CommonMethods {
	/*
	 * TC 12356 search flight verification Step1; navigate to url Step2; enter
	 * details Step3; verify search is succesfull
	 */

	String url = "https://www.aa.com/homePage.do";

	@BeforeMethod
	public void setUp() {
		setUpDriver("chrome", url);
	}
	
	@Test
	public void searchFlight() {
sendText(driver.findElement(By.name("originAirport")), "DCA");
sendText(driver.findElement(By.name("destinationAirport")), "JCA");
driver.findElement(By.xpath("//input[@id='aa-leavingOn']")).click();
WebElement months=driver.findElement(By.xpath("//div[contains(@class,'header ui-helper-clearfix ui-corner-left')]/div"));
	
	while(!months.getText().contains("December")){
			
	driver.findElement(By.xpath("//a[@title='Next']")).click();
	months=driver.findElement(By.xpath("//div[contains(@class,'header ui-helper-clearfix ui-corner-left')]/div"));
	}
	List<WebElement>cells=driver.findElements(By.xpath("//div[contains(@class,'datepicker-group-first')]/table/tbody/tr/td"));
	
	for(WebElement cell:cells) {
		if(cell.getText().equals("24")) {
			cell.click();
		}
	}
	
	}
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}

}
