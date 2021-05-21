package com.nato.challenge;

import java.util.concurrent.TimeUnit;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SubmitApplicationChallenge {

	@SuppressWarnings("unused")
	public static void main(String[] args)

	{
		HashMap<String, String> nate_dict = new HashMap<String, String>();
		nate_dict.put("city", "London");
		nate_dict.put("name", "nate");
		nate_dict.put("password", "07000000000");
		nate_dict.put("email", "nate@nate.tech");
		nate_dict.put("gender", "female");

		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://nate-eu-west-1-prediction-test-webpages.s3-eu-west-1.amazonaws.com/tech-challenge/page1.html");
		driver.findElement(By.cssSelector("input[type='button']")).click();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("span.custom-select-trigger")).click();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		List<WebElement> dd = driver.findElements(By.cssSelector("span[class*=undefined]"));
		for (int i = 0; i < dd.size(); i++) {
			if (dd.get(i).getText().contains(new String(nate_dict.get("city")))) {
				dd.get(i).click();
				break;
			}
		}
		driver.getWindowHandles();
		driver.findElement(By.cssSelector("input#next-page-btn")).click();
		driver.findElement(By.id("name")).sendKeys(new String(nate_dict.get("name")));
		driver.findElement(By.id("pwd")).sendKeys(new String(nate_dict.get("password")));
		driver.findElement(By.id("email")).sendKeys(new String(nate_dict.get("email")));
		driver.getWindowHandles();
		List<WebElement> checkbox = driver.findElements(By.cssSelector("input[type='checkbox']"));
		for (int j = 0; j < checkbox.size(); j++) {
			String val = checkbox.get(j).getAttribute("value");
			if (val.equalsIgnoreCase(nate_dict.get("gender"))) {
				checkbox.get(j).click();
				break;
			}
		}
		driver.getWindowHandles();
	}

}
