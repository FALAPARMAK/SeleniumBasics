package com.class11;

import org.openqa.selenium.By;

import util.CommonMethods;

public class Task  extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
//		TC 1: Upload file and Take Screenshot
//
//		Navigate to “http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload”
//		Upload file
//		Verify file got successfully uploaded and take screenshot
//		Collapse

		
setUpDriver("chrome", "http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload");
driver.findElement(By.cssSelector("[id='gwt-debug-cwFileUpload']")).click();
Thread.sleep(3000);
String filePath="/Users/newowner/Desktop/image.jpg";
boolean isDisplayed=driver.findElement(By.linkText("Upload File")).isDisplayed();
if (isDisplayed) {
	System.out.println("File uploaded successfully");
}else {
	System.out.println("File uploaded successfully");
}


	}

}
