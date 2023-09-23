package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File {

	public static void main(String[] args)  throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://ps.uci.edu/~franklin/doc/file_upload.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement d = driver.findElement(By.xpath("/html/body/form/input[1]"));
		d.sendKeys("C:\\Users\\Lenovo\\Pictures\\Camera Roll\\JPG File (.jpg)");
	    	
}
}
