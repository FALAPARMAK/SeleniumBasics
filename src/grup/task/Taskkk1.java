package grup.task;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.openqa.selenium.support.ui.Select;

public class Taskkk1 {

	public static void main(String[] args) throws InterruptedException {
	/*
		 * TC 1: Users Application Form Fill
		 * 1.Open chrome browser
		 * 2.Go to “http://uitestpractice.com/”
		 * 3.Click on “Forms” link
		 * 4.Fill out the entire form
		 * 5.Close the browser
		 * 
		 * MUST USE Functions: 
		 */
		
		System.setProperty("webdriver.chrome.driver", "/Users/newowner/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://uitestpractice.com/");
		driver.findElement(By.xpath("//a[text()='Form']")).click();
		driver.findElement(By.id("firstname")).sendKeys("Betul");
		driver.findElement(By.id("lastname")).sendKeys("Korkmaz");
		
		List<WebElement> element=driver.findElements(By.xpath("//label[@class='radio-inline']"));
		
		for(WebElement ele:element) {
			String text=ele.getText();
			if(text.equalsIgnoreCase("single")) {
				ele.click();
				break;
			}
		}
		List<WebElement> listt=driver.findElements(By.xpath("//label[@class='checkbox-inline']"));

		for(WebElement ele1:listt) {
			String text=ele1.getText();
			if(text.equalsIgnoreCase("cricket")) {
				ele1.click();
				break;
			}
		}
		WebElement countryDD=driver.findElement(By.xpath("//select[@id='sel1']"));
		Select select=new Select(countryDD);
		Thread.sleep(4000);
		select.selectByVisibleText("Canada");
		
		
		driver.findElement(By.cssSelector("input[id='datepicker']")).click();
			
		WebElement month=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		//Iterator<WebElement>mm=month.iterator();
		 
		System.out.println("Size : "+month.getSize());
		while(!month.getText().contains("Sep")){
			driver.findElement(By.cssSelector("a[title='Next']")).click();
			month=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
			
			
		}
		
		
		
//		
//		while(mm.hasNext()) {
//			String monthText=mm.next().getText();
//			if(!monthText.equalsIgnoreCase("September")) {
//				driver.findElement(By.cssSelector("a[title='Next']")).click();
//			}
//		
		
		
		
		////a[text()='1']
		Thread.sleep(4000);
		//driver.quit();
		
	}

}
