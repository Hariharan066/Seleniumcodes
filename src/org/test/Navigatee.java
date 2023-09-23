package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatee {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/login/");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		WebElement txtuser = driver.findElement(By.id("email"));
		boolean d = txtuser.isDisplayed();
		System.out.println(d);
		
		WebElement lb = driver.findElement(By.name("login"));
		boolean e = lb.isEnabled();
		System.out.println(e);
		
		driver.findElement(By.xpath("//*[@id=\"login_link\"]/a[2]")).click();
		
		
		WebElement s = driver.findElement(By.xpath("//input[@value='2']"));
		boolean ss = s.isSelected();
		System.out.println("before-----"+ss);
		
		s.click();
		
		boolean eb = s.isSelected();
		System.out.println("after-----"+eb);
		
		
		
		
		
	
		
		
		
		
		
	}

}
