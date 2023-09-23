package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScript {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement txtuser = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','hari')",txtuser);
		
		WebElement pass = driver.findElement(By.id("pass"));
		js.executeScript("arguments[1].setAttribute('value','8796')",txtuser,pass);
		
	//	WebElement btn = driver.findElement(By.name("login"));
		//js.executeScript("arguments[0].click()",btn);
		
		Object user = js.executeScript("return arguments[0].getAttribute('value')",txtuser);
		System.out.println(user);
		
		Object p = js.executeScript("return arguments[0].getAttribute('value')",pass);
		System.out.println(p);
		
		

		
	}

}
