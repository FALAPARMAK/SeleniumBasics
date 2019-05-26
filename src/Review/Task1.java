package Review;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		
			

		System.setProperty("webdriver.chrome.driver", "/Users/newowner/Selenium/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.toolsqa.com/automation-practice-form/");
        driver.findElement(By.cssSelector("input[id='sex-0']")).click();
       List<WebElement>list= driver.findElements(By.cssSelector("input[id='exp-0']"));
       Thread.sleep(2000);
       
       int i=0;
		for(WebElement exp: list) {
			i++;
			if(exp.isEnabled()) {
				exp.click();
				Thread.sleep(1000);
				if(i==4) {
					break;
				}
			}
		}
		 List<WebElement>listt= driver.findElements(By.cssSelector("input[id='exp-0']"));
		Iterator<WebElement>radios=listt.iterator();
		
		while(radios.hasNext()) {
			radios.next().click();
			Thread.sleep(1000);
		}
		
		
		
		
		driver.quit();
		
		
	}

}
