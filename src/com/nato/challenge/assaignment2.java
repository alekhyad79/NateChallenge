package com.nato.challenge;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assaignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./chromedriver_79new/chromedriver_79new.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input#checkBoxOption2")).click();
		String name=driver.findElement(By.cssSelector("label[for='benz']")).getText();
		System.out.println(name);
		driver.findElement(By.id("dropdown-class-example")).sendKeys(name);
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys(name);
		driver.findElement(By.cssSelector("input[id='alertbtn']")).click();
		/*
		 driver.get("http://the-internet.herokuapp.com/");
		 driver.findElement(By.cssSelector("a[href*='nested']")).click();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.id("content")).getText());
		
		/*
		driver.findElement(By.cssSelector("a[href='/windows']")).click();
		driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		
		System.out.println(driver.findElement(By.cssSelector("div.example h3")).getText());
		driver.switchTo().window(parentid);
		System.out.println(driver.findElement(By.cssSelector("div.example h3")).getText());
		*/
	}

}
