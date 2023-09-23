package org.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Newselectt {

	public static void main(String[] args) throws InterruptedException{
	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement c = driver.findElement(By.xpath("(//a[@role='button']) [2]"));
		c.click();
		
		WebElement drp = driver.findElement(By.id("month"));
		Select s = new Select(drp);
		
		s.selectByIndex(6);
		s.selectByValue("3");
		s.selectByVisibleText("Feb");

		boolean m = s.isMultiple();
		System.out.println(m);
		
		List<WebElement> options = s.getOptions();
		
		for(int i=0;i<12;i++){
			WebElement w = options.get(i);
			String text = w.getText();
			System.out.println(text);		
		}
		
		for(WebElement x:options){
	
		System.out.println(x.getText());
		
		}
		
		
		
		}
	}

	
	


