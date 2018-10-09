package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AmazonPagefactory {
	WebDriver driver;
public AmazonPagefactory(WebDriver driver) {
	this.driver  = driver;
	PageFactory.initElements(driver, this);
}
	
@FindBy (how = How.XPATH, using = "(//*[@class = 'nav-line-2'])[4]")
private WebElement Orderbtn;

public WebElement getOrderbtn() {
	return Orderbtn;
}
@FindBy (how=How.XPATH, using = "//*[@id= 'twotabsearchtextbox']")
private WebElement SearchBox;

public WebElement getSearchBox () {
	return SearchBox;
	
}


}
