package com.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.CommonMethods;

public class Task2 extends CommonMethods {

	public static void main(String[] args) {
		// TC 2: Verify element is clickable1.Open chrome browser
		// 2.Go to “https://the-internet.herokuapp.com/”
		// 3.Click on “Click on the “Dynamic Controls” link
		// 4.Select checkbox and click Remove
		// 5.Click on Add button and verify “It's back!” text is displayed
		// 6.Close the browser

		String url = "https://the-internet.herokuapp.com/";
		CommonMethods.setUpDriver("chrome", url);
		driver.findElement(By.xpath("//a[text()='Dynamic Controls']")).click();
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();

		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement ele = driver.findElement(By.cssSelector("button[onclick='swapCheckbox()']"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(ele));

		WebElement element = driver.findElement(By.xpath("//button[text()='Add']"));
		element.click();
		WebElement elementt = driver.findElement(By.id("message"));
		// WebDriverWait waittt=new WebDriverWait(driver,40);
		// waittt.until(ExpectedConditions.visibilityOf(elementt));

		if (elementt.isDisplayed()) {
			String text = elementt.getText();
			System.out.println(text);
		} else {
			System.out.println("text is not displayed");
		}
		driver.quit();

	}

}
