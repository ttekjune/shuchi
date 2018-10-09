package com.PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DisneyPageFactory {


     public WebElement getSignIn() {
		return SignIn;
	}

	public WebElement getUserName() {
		return UserName;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getSignIn_Btn() {
		return SignIn_Btn;
	}

	@FindBy (xpath = "//*[@class = \"signIn\"]")
     private WebElement SignIn;
     
     @FindBy (xpath = "//*[@id = \"loginPageUsername\"]")
     private WebElement UserName;

     @FindBy (xpath = "//*[@id=\"loginPagePassword\"]")
     private WebElement Password;

     @FindBy (xpath = "//*[@id = \"LoginPageSubmitButton\"]")
     private WebElement SignIn_Btn;
}
