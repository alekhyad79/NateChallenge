package com.nato.challenge;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ecart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./chromedriver_79new/chromedriver_79new.exe");
		WebDriver driver = new ChromeDriver();
		
		String[] itemsneeded= {"Brocolli","Cucumber"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        Thread.sleep(3000L);
		List<WebElement> product=driver.findElements(By.cssSelector("h4.product-name"));
		//button[text()='ADD TO CART']
		for(int i=0;i<product.size();i++)
		{
			String[] name=product.get(i).getText().split("-");
			String formattedname=name[0].trim();
			List itemsneededlist=Arrays.asList(itemsneeded); // array format
			
			if(itemsneededlist.contains(formattedname))
			{
				int j=0;
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==2)
				{
				break;
				}
			}
		/*	if(name.contains("Cucumber"))
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				System.out.println(driver.findElement(By.xpath("//button[text()='ADD TO CART']")).getText());
				break;
			}
			*/
		}
			
	}

}
