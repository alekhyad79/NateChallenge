package com.nato.challenge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class hello {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./chromedriver_win32_latest/chromedriver_latest.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		//driver.findElement(By.cssSelector("input[name='q']")).sendKeys("alexa");
		driver.findElement(By.cssSelector("input[class='gNO89b']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[class='gNO89b']")).getText());
	
		

	}

}
