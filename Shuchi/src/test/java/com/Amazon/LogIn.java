package com.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",  "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
	    driver.manage().window().maximize();
	    
	    WebElement Login = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
	    		Login.click();
	    		
	    WebElement UserName = driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
	    		UserName.sendKeys("Shuchi89@hotmail.com");
	    		UserName.sendKeys(Keys.ENTER);
	    		
	    WebElement Password = driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
	    		Password.sendKeys("Aria.s.p4416");
	    		Password.sendKeys(Keys.ENTER);
	    		
	    	driver.quit();
		
		
		
		
	}

	
}
