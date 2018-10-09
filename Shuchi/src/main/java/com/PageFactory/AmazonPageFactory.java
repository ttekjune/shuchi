package com.PageFactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPageFactory {

	(WebDriver driver){
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	public WebElement getMyAccount() {
		return MyAccount;
	}


	public WebElement getUserName() {
		return UserName;
	}


	public WebElement getPassword() {
		return Password;
	}


	@FindBy(xpath = "//*[@id=\"nav-link-accountList\"]")
	private WebElement MyAccount;
	
	
	@FindBy (xpath = "//*[@id=\"ap_email\"]")
	private WebElement UserName;
	
   
	@FindBy (xpath = "//*[@id=\"ap_password\"]")
	private WebElement Password;


}

