package com.Disney;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInDisney {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://disneyworld.disney.go.com/");
	    driver.manage().window().maximize();
	    
	    WebDriverWait wait = new WebDriverWait(driver, 10);

	    WebElement Element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("\"//*[@class = \\\"signIn\\\"]\"")));
	    Element.click();
	    
	    WebElement SignIn = driver.findElement(By.xpath("//*[@class = \"signIn\"]"));
	    		SignIn.click();
	    		
	    WebElement UserName = driver.findElement(By.xpath("//*[@id = \"loginPageUsername\"] "));
	    		UserName.sendKeys("shuchipassaro@gmail.com");
	    		
	    WebElement Password = driver.findElement(By.xpath("//*[@id = \"loginPagePassword\"] "));
	    		Password.sendKeys("Angel7300");
	    		//Password.sendKeys(Keys.ENTER);
	    
	    WebElement SignIn_Btn = driver.findElement(By.xpath("//*[@id=\"loginPageSubmitButton\"]"));
	            SignIn_Btn.click();
	            
	    	driver.quit();
		

	}

}
