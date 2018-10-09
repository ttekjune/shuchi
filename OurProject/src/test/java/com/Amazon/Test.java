package com.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.pagefactory.AmazonPagefactory;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.com");
		AmazonPagefactory amazonpg = PageFactory.initElements(driver, AmazonPagefactory.class);
		amazonpg.getOrderbtn().click();
	}

}