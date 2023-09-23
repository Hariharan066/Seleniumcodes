package org.Practices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GetAttGetText {
	
	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		        //GetText
		
		WebElement gettext = driver.findElement(By.xpath("//h2[@class='_8eso']"));
		String text = gettext.getText();
		System.out.println(text);
		
		       //GetAttripute
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("hari");
		String getattripute = user.getAttribute("value");
		System.out.println(getattripute);
		
	}

}
