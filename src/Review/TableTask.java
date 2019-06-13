package Review;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class TableTask extends MethodsReuse {

	
		public static void main(String[] args) throws InterruptedException {
			MethodsReuse.browserSetUp("chrome", "https://the-internet.herokuapp.com/tables");

			List<WebElement> list = driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
			System.out.println(list.size());
			for (int i = 1; i < list.size(); i++) {
				
				System.out.println(list.get(i).getText());
			}

		List<WebElement>rows=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		String name="Doe";
		
		for(int i=1; i<rows.size(); i++) {
			String text=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]")).getText();
			Thread.sleep(2000);
			if(text.equalsIgnoreCase(name)) {
				driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td/a[1]")).click();
				System.out.println();
				
			}
		}//driver.close();
}
}