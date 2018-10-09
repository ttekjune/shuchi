package com.Disney;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import com.PageFactory.DisneyPageFactory;

public class DisneyLogInPF {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
	    driver.manage().window().maximize();
	    DisneyPageFactory obj = PageFactory.initElements(driver,DisneyPageFactory.class);

	    obj.getSignIn().click();
	    obj.getUserName().sendKeys("shuchi");
	    obj.getPassword().sendKeys("");
	    obj.getSignIn_Btn().click();
	    
	    
	}

}
