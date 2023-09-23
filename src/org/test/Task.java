package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Task {

	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		System.out.println("-------Location-----------");	

		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys("Ha");

		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("12345678");
		
		System.out.println("---Xpath----");
		
	//	WebElement login = driver.findElement(By.xpath("//button[@value='1']"));
	//	login.click();

		WebElement c = driver.findElement(By.xpath("(//a[@role='button']) [2]"));
		c.click();
		
		System.out.println("---js----");

		JavascriptExecutor js = (JavascriptExecutor)driver;

		WebElement FN = driver.findElement(By.name("firstname"));
		js.executeScript("arguments[0].setAttribute('value','Hari')",FN);
		Object name = js.executeScript("return arguments[0].getAttribute('value')",FN);
		System.out.println(name);

		System.out.println("---action----");
		
		Actions a = new Actions(driver);

		a.doubleClick(FN).perform();
		a.contextClick(FN).perform();

		System.out.println("---robot----");
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement p = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		a.contextClick(p).perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		System.out.println("---static wait----");
		
		Thread.sleep(3000);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		System.out.println("---Select----");
		
		WebElement drp = driver.findElement(By.id("month"));

		Select s = new Select(drp);

		s.selectByIndex(6);
		s.selectByValue("3");
		s.selectByVisibleText("May");

		System.out.println("---Navigate----");
		
		driver.navigate().to("https://www.flipkart.com/");

		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().back();

		WebElement d = driver.findElement(By.id("email"));
		boolean i = d.isDisplayed();
		System.out.println(i);

		System.out.println("---WindowsHandles----");
		
		driver.get("https://www.flipkart.com/");

		Thread.sleep(10000);

		WebElement clr = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		clr.click();

		WebElement txt = driver.findElement(By.name("q"));
		txt.sendKeys("redmi");

		WebElement sb = driver.findElement(By.xpath("//button[@type='submit']"));
		
		sb.click();

		WebElement redmi = driver.findElement(By.xpath("//div[text()='REDMI 12 (Jade Black, 128 GB)']"));
		redmi.click();

		
		Set<String> all = driver.getWindowHandles();

		
		System.out.println(all);

		
		List<String> l = new ArrayList<>();
		l.addAll(all);

		driver.switchTo().window(l.get(1));

		WebElement clc = driver.findElement(By.xpath("//button[text()='NOTIFY ME']"));
		clc.click();

	}

}
