package org.test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drogan {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		System.out.println("---DroganDrop----");
		
		WebElement from = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement to = driver.findElement(By.xpath("//*[@id=\"shoppingCart1\"]/div"));
		WebElement f1 = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement t1 = driver.findElement(By.xpath("//*[@id=\"shoppingCart4\"]/div"));
		WebElement f2 = driver.findElement(By.xpath("//*[@id=\"credit1\"]"));
		WebElement t2 = driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		WebElement t3 = driver.findElement(By.xpath("//*[@id=\"amt8\"]"));
		a.dragAndDrop(from, to).perform();
		a.dragAndDrop(f1, t1).perform();
		a.dragAndDrop(f2, t2).perform();
		a.dragAndDrop(f1,t3).perform();
		
		System.out.println("---ScreenShot----");
		
		TakesScreenshot t = (TakesScreenshot)driver;
		File srcloc = t.getScreenshotAs(OutputType.FILE);
		File destloc = new File("C:\\screeen\\drop.png");
		FileUtils.copyFile(srcloc, destloc);
		
}

}
