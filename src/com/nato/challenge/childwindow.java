package com.nato.challenge;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./chromedriver_79new/chromedriver_79new.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector("a.blinkingText")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		driver.findElement(By.cssSelector("a[href*='mailto']")).getText();
 		driver.findElement(By.cssSelector(".im-para.red")).getText();
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String emailID=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentid);
		driver.findElement(By.id("username")).sendKeys(emailID);
		
	}

}
