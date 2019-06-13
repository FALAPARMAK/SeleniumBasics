package Review;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsUsingWebdriver extends MethodsReuse {
	public static void main(String[] args) throws InterruptedException {
		String to="Dublin, Ireland (DUB)";
		String URL ="https://www.travelocity.com/Flights?SEMCID=TRAVELOCITY-US.MULTILOBF.GOOGLE.GT-c-EN.FLIGHT&&SEMDTL=a1752860948.b138198135423.d1277162028531.e1c.f11t2.g1kwd-28170460.h1e.i1.j19007576.k1.l1g.m1.n1&gclid=EAIaIQobChMI9a7rtPfB4gIVE9VkCh0bagcREAAYAiAAEgI1R_D_BwE&gclsrc=aw.ds";
		MethodsReuse.browserSetUp("chrome", URL);
		driver.findElement(By.cssSelector("input[id='flight-origin-flp']")).sendKeys("Alexandria, LA (AEX-Alexandria In");

		driver.findElement(By.cssSelector("input[id='flight-destination-flp']")).sendKeys(to);
		
		driver.findElement(By.cssSelector("input[id='flight-departing-flp']")).sendKeys("01/31/2020");
		driver.findElement(By.cssSelector("input[id='flight-returning-flp']")).sendKeys("01/31/2020");
		
		driver.findElement(By.xpath("//button[@data-gcw-change-submit-text='Search']")).click();

		driver.findElement(By.cssSelector("div[class='bold announce-able']")).isDisplayed();
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[class='bold announce-able']")));
		//driver.findElement(By.cssSelector("div[class='bold announce-able']")).click();
		
		boolean present=driver.findElement(By.cssSelector("div[class='bold announce-able']")).isDisplayed();
		System.out.println("is Element present "+present);
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		driver.quit();
	}
}
