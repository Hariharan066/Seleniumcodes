package org.test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		WebElement clr = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		clr.click();
		
		WebElement txt = driver.findElement(By.name("q"));
		txt.sendKeys("macbook");
		
		WebElement sb = driver.findElement(By.xpath("//button[@type='submit']"));
		sb.click();
		
		WebElement ci = driver.findElement(By.xpath("//div[text()='APPLE 2020 Macbook Air M1 - (8 GB/256 GB SSD/Mac OS Big Sur) MGN63HN/A']"));
		ci.click();
		
		
		Set<String> allid = driver.getWindowHandles();
		System.out.println(allid);
		
		List<String> li = new ArrayList<>();
		li.addAll(allid);
		
		driver.switchTo().window(li.get(3));
		
		WebElement addtocart = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
		addtocart.click();
			
	}

}
