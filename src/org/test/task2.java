package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class task2 {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.greenstechnologys.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement c = driver.findElement(By.xpath("//button[@type='button']"));
		c.click();
		WebElement p = driver.findElement(By.xpath("(//p[@style='text-align:justify; font-size:18px;'])[1]"));
		String text = p.getText();
		System.out.println(text);
		
		WebElement h = driver.findElement(By.xpath("(//span[@class='blue_text'])[1]"));
		String text2 = h.getText();
		System.out.println(text2);
		
		
	}
}
