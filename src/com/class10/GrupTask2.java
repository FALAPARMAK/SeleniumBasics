package com.class10;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.CommonMethods;

public class GrupTask2  extends CommonMethods
{

	public static void main(String[] args) throws InterruptedException {
		
//		TC 1: Table headers and rows verification
//		1.Open browser and go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
//			2.Login to the application
//			3.Create an Order
//			4.Verify order of that person is displayed in the table “List of All Orders”
//			5.Click on edit of that specific order
		    //6.Verify each order details
//			7.Update street address
//			8.Verify in the table that street has been updated9.Close browser
		
	    String	url="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
		setUpDriver("chrome",url );
		
		sendText(driver.findElement(By.cssSelector("input[id='ctl00_MainContent_username']")), "Tester");
		sendText(driver.findElement(By.cssSelector("[id='ctl00_MainContent_password']")),"test");
		
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		driver.findElement(By.xpath("//a[text()='Order']")).click();
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")).click();
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys("150");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtUnitPrice")).sendKeys("2000");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtDiscount")).sendKeys("20");
		driver.findElement(By.cssSelector("[value='Calculate']")).click();
		
		sendText(driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")), "Askar");
		sendText(driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")),"2290.north Street");
		
	    
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys("Plano");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys("Tx");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys("78090");
		
		driver.findElement(By.cssSelector("input[id='ctl00_MainContent_fmwOrder_cardList_1']")).click();
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys("12345677899009");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("11/20");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
		driver.findElement(By.xpath("//a[text()='View all orders']")).click();
		
		List<WebElement>rows=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
		System.out.println("Number of size : "+rows.size());
		Iterator<WebElement>it=rows.iterator();
		
		 
		while(it.hasNext()) {
			String Rowstext=it.next().getText();
			System.out.println(Rowstext);
		}
		
		
		
		String expectedValue="Askar";
		for(int i=1; i<=rows.size(); i++) {
			String text=driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr["+i+"]")).getText();
		
			if(text.contains(expectedValue)) {
				Thread.sleep(1000);
			
				System.out.println(expectedValue+" has been  succesfully displayed");
				break;
			}else {
				System.out.println("There is no new order");
			}
		
			System.out.println(text);
		}
		driver.findElement(By.cssSelector("[id='ctl00_MainContent_orderGrid_ctl03_OrderSelector']")).click();
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[2]/td[13]/input")).click();
		
		sendText(driver.findElement(By.cssSelector("[id='ctl00_MainContent_fmwOrder_TextBox2']")), "NewYork Avenue");
		
		//sendText(driver.findElement(By.cssSelector("table[id='ctl00_MainContent_orderGrid']")),"NewYork Avenue");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton")).click();
		 driver.findElement(By.partialLinkText("View all orders")).click();
		 
		 String text=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[2]/td[6]")).getText();
		
		 String expectedText="NewYork Avenue";
		 if(text.equalsIgnoreCase(expectedText)) {
			 System.out.println("Street has been succesfully updated");
		 }else {
			 System.out.println("There is no update");
			 
		 }
		 
		 
		//driver.quit();
		
	}

}
