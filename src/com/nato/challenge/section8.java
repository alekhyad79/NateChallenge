package com.nato.challenge;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class section8 {

	public static void main(String[] args) throws InterruptedException

	{

		// Chrome drivers for version 79
		System.setProperty("webdriver.chrome.driver", "./chromedriver_79new/chromedriver_79new.exe");
		// Chrome drivers for version 86
		// System.setProperty("webdriver.chrome.driver",
		// "./chromedriver_win32_v86/chromedriver_v86.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		// STATIC DROPDOWN

		/*
		 * WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")); 
		 * Select dropdown=new Select(staticdropdown); dropdown.selectByIndex(3);
		 * System.out.println(dropdown.getFirstSelectedOption().getText());
		 * dropdown.selectByVisibleText("AED");
		 * System.out.println(dropdown.getFirstSelectedOption().getText());
		 * dropdown.selectByValue("INR");
		 * System.out.println(dropdown.getFirstSelectedOption().getText());
		 * 
		 * driver.findElement(By.id("divpaxinfo")).click(); Thread.sleep(2000L);
		 * 
		 * int i=1; while(i<5) { driver.findElement(By.id("hrefIncAdt")).click(); i++; }
		 * 
		 * driver.findElement(By.id("hrefIncChd")).click();
		 * driver.findElement(By.id("btnclosepaxoption")).click();
		 * System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 */

		// DYNAMIC DROPDOWN
		/*
		 * //a[@value='MAA'] //(a[@value='BLR'])[2] BANGLORE
		 * 
		 * driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(
		 * ); driver.findElement(By.xpath("//a[@value='MAA']")).click();
		 * Thread.sleep(2000L);
		 * //driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		 * 
		 * driver.findElement(By.xpath(
		 * "//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='BLR']"
		 * )).click();
		 */

		/*
		 * //AUTO SUGGESTIVE DROPDOWN
		 * 
		 * driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		 * Thread.sleep(2000L);
		 * 
		 * List<WebElement>options
		 * =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		 * 
		 * 
		 * for(WebElement option : options) {
		 * 
		 * 
		 * if(option.getText().equalsIgnoreCase("India"))
		 * 
		 * { option.click(); break; } }
		 */

		// HANDLING CHEQUE BOXES
		/*
		 * Assert.assertFalse(driver.findElement(By.
		 * cssSelector("div[id='familyandfriend'] input")).isSelected());
		 * driver.findElement(By.cssSelector("div[id='familyandfriend'] input")).click()
		 * ; System.out.println(driver.findElement(By.
		 * cssSelector("div[id='familyandfriend'] input")).isSelected());
		 * Assert.assertTrue(driver.findElement(By.
		 * cssSelector("div[id='familyandfriend'] input")).isSelected());
		 * driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		 * System.out.println(driver.findElements(By.cssSelector(
		 * "input[type='checkbox']")).size());
		 * 
		 * 
		 * //ASSERTIONS FOR VALIDATION
		 * 
		 * driver.findElement(By.id("divpaxinfo")).click(); Thread.sleep(2000L);
		 * 
		 * int i=1; while(i<5) { driver.findElement(By.id("hrefIncAdt")).click(); i++; }
		 * 
		 * driver.findElement(By.id("hrefIncChd")).click();
		 * driver.findElement(By.id("btnclosepaxoption")).click();
		 * Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),
		 * "5 Adult, 1 Child");
		 * System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 */

		// Practice session
		/*
		 * driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 * driver.findElement(By.cssSelector("input#checkBoxOption1")).click();
		 * driver.findElement(By.cssSelector("input#checkBoxOption1")).click();
		 * driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		 * System.out.println(driver.findElements(By.cssSelector(
		 * "input[type='checkbox']")).size());
		 */

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		// driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled();
		driver.findElement(By.id("Div1")).getAttribute("style");
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
			;
		{
			System.out.println("enabled");
			Assert.assertTrue(true);
		}

		Assert.assertFalse(false);
	}

}
