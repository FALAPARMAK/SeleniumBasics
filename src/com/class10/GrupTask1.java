package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.CommonMethods;

public class GrupTask1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
//		Fill1.Open chrome browser
//		2.Go to “http://uitestpractice.com/”
//	    3.Click on “Forms” link
//		4.Fill out the entire form5.
//		Close the browser
//		MUST USE Functions: Test 
        String url="http://uitestpractice.com/";
		setUpDriver("chrome", url);
		driver.findElement(By.linkText("Form")).click();
		driver.findElement(By.id("firstname")).sendKeys("Tester");
		driver.findElement(By.id("lastname")).sendKeys("test");
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div[3]/label[3]")).click();
		driver.findElement(By.xpath("//input[@value='dance']")).click();
		driver.findElement(By.id("datepicker")).click();
		CommonMethods.selectValueFromDD(driver.findElement(By.cssSelector("select[class='form-control dropdown-header']")),"Canada");
	   
	   
		
		String expectedDate="6";        
		List<WebElement>element=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for(WebElement ele:element) {
			String text=ele.getText();
			if(text.equals(expectedDate)) {
				ele.click();
				System.out.println(ele.getText());
        System.out.println("Text is present");
        
			}
		}
		driver.findElement(By.id("phonenumber")).sendKeys("12345676");
		driver.findElement(By.id("username")).sendKeys("testt");
		driver.findElement(By.id("email")).sendKeys("safvvnjg@gmail.com");
		driver.findElement(By.id("comment")).sendKeys("I am a tester.");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("656765");
		driver.findElement(By.cssSelector("button[class='btn btn-default ']")).click();
		Thread.sleep(12000);
		
		driver.quit();
		
	}

}
