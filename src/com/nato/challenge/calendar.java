package com.nato.challenge;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./chromedriver_79new/chromedriver_79new.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		//april 14
		Thread.sleep(5000L);
		while(!driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='datepicker-switch']")).getText().contains("April"))
		{
		driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='next']")).click();
		}
		List<WebElement> dates=driver.findElements(By.className("day"));
		int count=driver.findElements(By.className("day")).size();
		for(int i=0;i<count;i++)
		{
			String text=driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase("14"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
		
	}

}
