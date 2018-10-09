package com.Amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.PageFactory.AmazonPageFactory;


public class LogInPF{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
	    driver.manage().window().maximize();
	    AmazonPageFactory obj = PageFactory.initElements(driver,AmazonPageFactory.class);
	    obj.getMyAccount().click();
	    obj.getUserName().sendKeys("shuchi");
	    obj.getUserName().sendKeys(Keys.ENTER);
	    obj.getPassword().sendKeys("angel7300");
	    obj.getPassword().sendKeys(Keys.ENTER);
	    
	}

}
