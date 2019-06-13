package MyPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.CommonMethods;

public class Table  extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		String url="https://the-internet.herokuapp.com/tables";
		CommonMethods.setUpDriver("chrome", url);
		//number of columns
		List<WebElement>cols=driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
		for(WebElement col:cols) {
			String textColumn=col.getText();
			System.out.println(textColumn);
		}
		//number of rows
		List<WebElement>rows=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		for(WebElement r:rows) {
			System.out.println(r.getText());
			
		}System.out.println("  -----------------cell by cell ------------");
		
		// all data cell by cell
		//1. way
		List<WebElement> cells=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td"));
		for(WebElement cell:cells) {
			System.out.println(cell.getText());
		}System.out.println("-----------------nested loop-------------------");
		//2. way
		for(int i=1; i<=rows.size(); i++ ) {
			for(int j=1; j<= cols.size(); j++) {
				Thread.sleep(1000);
   String allText=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td["+j+"]")).getText();
		System.out.println(allText);	
			
		
			
			}
		}
		driver.quit();
	}

}
