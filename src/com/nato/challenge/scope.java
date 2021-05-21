package com.nato.challenge;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./chromedriver_79new/chromedriver_79new.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer=driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement coloumn=driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coloumn.findElements(By.tagName("a")).size());
		//open different links in different tabs
		for(int i=1;i<coloumn.findElements(By.tagName("a")).size();i++)
			
		{
			String colinks=Keys.chord(Keys.CONTROL,Keys.ENTER);
			coloumn.findElements(By.tagName("a")).get(i).sendKeys(colinks);
		}
			Thread.sleep(5000L);
			Set<String> abc=driver.getWindowHandles();
			Iterator<String> it=abc.iterator();
			while(it.hasNext())
			{
				
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			
			}
		
		
		}
		
	

