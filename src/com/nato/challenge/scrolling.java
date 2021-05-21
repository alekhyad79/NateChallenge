package com.nato.challenge;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class scrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./chromedriver_79new/chromedriver_79new.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
		
		List<WebElement>abc=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		
		for(int i=0;i<abc.size();i++)
		{
			
			sum=sum+Integer.parseInt(abc.get(i).getText());
		}
		System.out.println(sum);
		int k=Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(sum, k);
	}

}
