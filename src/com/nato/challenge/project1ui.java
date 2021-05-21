package com.nato.challenge;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class project1ui {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./chromedriver_79new/chromedriver_79new.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();

		}
		driver.findElement(By.id("hrefIncChd")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(2000L);

		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		for (WebElement option : options) {

			if (option.getText().equalsIgnoreCase("India"))

			{
				option.click();
				break;
			}
		}

		driver.findElements(By.name("ctl00$mainContent$DropDownListCurrency"));

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.cssSelector("a[value='BLR']")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();

	}

}
