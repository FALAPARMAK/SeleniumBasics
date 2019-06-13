package com.class12;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

import util.CommonMethods;

public class ReadingPropertyFile {

	
	@Test
	public void redFile() {
		String filePath="src/configs/creentials.properties";
		Properties prop = null;
		try {
		FileInputStream fis=new FileInputStream(filePath);
	    prop=new Properties();
		prop.load(fis);
		
		}catch(FileSystemNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//System.out.println(prop.get("browser"));
		//System.out.println(prop.get("url"));
		
		CommonMethods.setUpDriver(prop.getProperty("browser"), prop.getProperty("url"));
		CommonMethods.driver.quit();
		
		
	}
}
