package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Framee {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://chercher.tech/practice/frames");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		System.out.println("---Frame----");
		
		WebElement f = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(f);
		
		WebElement txtuser = driver.findElement(By.xpath("//input[@type='text']"));
		txtuser.sendKeys("HARIHARAN");
		
		WebElement f3 = driver.findElement(By.id("frame3"));
		driver.switchTo().frame(f3);
		
		WebElement checkbox = driver.findElement(By.id("a"));
		checkbox.click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		
		WebElement drp = driver.findElement(By.id("animals"));
		Select s = new Select(drp);
		s.selectByIndex(2);
		
		
		
		
		
		
		
		
		
		

	}

}
