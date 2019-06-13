package com.class11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import util.CommonMethods;

public class Amazon  extends CommonMethods{

	public static void main(String[] args) {
		String url="https://www.amazon.com/";
		setUpDriver("chrome", url);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File self=ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(self, new File("screenshots/Amazon.jpg"));
	
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("Selfie not taken");
		}
		
	}

}
