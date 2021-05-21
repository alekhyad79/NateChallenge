package com.nato.challenge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "rahul";
		System.setProperty("webdriver.chrome.driver", "./chromedriver_79new/chromedriver_79new.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.name("enter-name")).sendKeys(text);
		// driver.findElement(By.id("alertbtn")).click();
		// System.out.println(driver.switchTo().alert().getText());
		// driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

	}

}
