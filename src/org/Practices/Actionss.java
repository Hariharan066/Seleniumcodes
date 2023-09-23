package org.Practices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionss {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		WebElement c = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		c.click();
		
		WebElement m1 = driver.findElement(By.xpath("//div[text()='Fashion']"));
		a.moveToElement(m1).perform();
		
		WebElement m2 = driver.findElement(By.xpath("//a[text()='Men Footwear']"));
		a.moveToElement(m2).click().perform();
		

	}

}
