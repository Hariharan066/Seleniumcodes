package org.test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		List<WebElement> tables = driver.findElements(By.tagName("table"));
		System.out.println(tables.size());
		
		WebElement tablel = tables.get(0);
		
		String t = tablel.getText();
		System.out.println(t);
		
		System.out.println("-------------webtable--------------------");
		
		List<WebElement> rows = tablel.findElements(By.tagName("tr"));
		
		for(int i=0; i<rows.size();i++ ) {	
		WebElement w = rows.get(i);
		String r = w.getText();
		System.out.println(r);	
		}	
		System.out.println("-------------------------------------");
		
		List<WebElement> headings = tablel.findElements(By.tagName("th"));
		
		for(int i=0;i<headings.size();i++){
		WebElement h = headings.get(i);
		String hh = h.getText();
		System.out.println(hh);
		
		System.out.println("-------------lr--------------------");
		
		WebElement lastrow = rows.get(rows.size()-1);
		System.out.println(lastrow.getText());
		
		TakesScreenshot ts =  (TakesScreenshot)driver;
		File srcloc = ts.getScreenshotAs(OutputType.FILE);
		File dstloc = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\pictures\\table.png");
		FileUtils.copyFile(srcloc, dstloc);
		
		}
	
		}
		
		
		
		
	}
	


