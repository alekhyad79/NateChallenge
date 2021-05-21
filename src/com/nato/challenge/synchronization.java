package com.nato.challenge;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./chromedriver_79new/chromedriver_79new.exe");
		WebDriver driver = new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String[] itemsneeded= {"Brocolli","Cucumber"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
     addcart(driver,itemsneeded);
     driver.findElement(By.cssSelector("img[alt='Cart']")).click();
     driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
     driver.findElement(By.cssSelector("input.promocode ")).sendKeys("rahulshettyacademy");
     driver.findElement(By.cssSelector("button.promoBtn")).click();
     
     //explicit wait       
     WebDriverWait w=new WebDriverWait(driver,5);
     w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
     
     System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
     driver.findElement(By.xpath("//button[text()='Place Order']")).click();
     driver.findElement(By.cssSelector("select[style*='width']")).sendKeys("INDIA");
     driver.findElement(By.cssSelector("input.chkAgree")).click();
     driver.findElement(By.xpath("//button[text()='Proceed']")).click();
     
	}


	public static void addcart(WebDriver driver,String[] itemsneeded)
	{
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