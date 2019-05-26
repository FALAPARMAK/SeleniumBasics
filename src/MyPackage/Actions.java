package MyPackage;

import org.openqa.selenium.By;

import util.CommonMethods;

public class Actions extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		CommonMethods.setUpDriver("chrome","https://www.toolsqa.com" );
		driver.findElement(By.xpath("//span[text()='DEMO SITES']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='IFrame practice page']")).click();
		
	} 

}
