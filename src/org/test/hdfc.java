package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hdfc {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		

		//WebElement f = driver.findElement(By.className(""));
		//driver.switchTo().frame(f);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement usertxt = driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(5000);
		js.executeScript("arguments[0].setAttribute('value',Hari)",usertxt);
			
	}

}
