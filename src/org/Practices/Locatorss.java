package org.Practices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Locatorss {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.get("https://www.redbus.in/");
		driver.get("https://www.instagram.com/");
		driver.get("https://www.snapdeal.com/login");
	
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		                    //Facebook
		//use to id
		
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("Hari");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("1234");
		
		                     //redbus
		//use to xpath
		
		WebElement account = driver.findElement(By.xpath("(//span[@class='name_rb_secondary_item']) [2]"));
		account.click();
		WebElement login = driver.findElement(By.xpath("//span[text()='Login/ Sign Up']"));
		login.click();
		
		                    //instgram
		//use to contains
		
		WebElement user1 = driver.findElement(By.xpath("//input[contains(@aria-label,'Pho')]"));
		user1.sendKeys("hari");
		WebElement pass1 = driver.findElement(By.xpath("//input[contains(@aria-label,'Pass')]"));
		pass1.sendKeys("1234");
		
		                   //snapdeal

		WebElement user2 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		user2.sendKeys("6383248492");
		
		
	

	}

}
