package Review;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/newowner/Selenium/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.toolsqa.com/automation-practice-form/");
        
       String title= driver.getTitle();
        System.out.println(title);
        if(title.equals("Demo Form for practicing Selenium Automation")) {
        	System.out.println("You are in the right location ");
        }else {
        	System.out.println("You are in the wrong location ");
        }
        driver.findElement(By.name("firstname")).sendKeys("Betul");
       String getText= driver.findElement(By.name("firstname")).getText();
        Thread.sleep(2000);
        System.out.println(getText);
      List<WebElement>links=  driver.findElements(By.tagName("a"));
        
     System.out.println("There are "+ links.size()+" links");
        for(WebElement link:links) {
        	System.out.println(link.getText());
        }
        
        
        
        driver.quit();
	}

}
