package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-training-in-chennai.html"); 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		System.out.println("---action----");
		
		Actions a=new Actions(driver);
		
		WebElement m1 = driver.findElement(By.xpath("//*[@id=\"nav-wrapper\"]/ul/li[3]/a"));
		a.moveToElement(m1).perform();
		
		WebElement m2 = driver.findElement(By.xpath("//*[@id=\"nav-wrapper\"]/ul/li[3]/ul/li[4]/a"));
		a.moveToElement(m2).perform();
		
		WebElement m3 = driver.findElement(By.xpath("//*[@id=\"nav-wrapper\"]/ul/li[3]/ul/li[4]/ul/li[1]/a"));
		a.click(m3).perform();
		

	}

}
