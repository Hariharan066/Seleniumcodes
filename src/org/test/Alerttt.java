package org.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alerttt {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	
		//---------------simple---------------
		
	    WebElement a = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
		a.click();
		
		Alert b = driver.switchTo().alert();
		b.accept();
		
		//-------------confirm-----------------
		
	    WebElement a1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		a1.click();
		
    	WebElement a2  = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		a2.click();
		
		Alert b1 = driver.switchTo().alert();
		b1.dismiss();
		
		//-------------prompt-------------------
		
	    WebElement a3 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		a3.click();
		
		WebElement a4 = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		a4.click();
		
		Alert b3 = driver.switchTo().alert();
		b3.sendKeys("confirm");
		b3.accept();
		
		

		
		

		
		
	
		

	}

}
