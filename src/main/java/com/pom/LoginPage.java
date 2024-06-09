package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Base;

public class LoginPage extends Base {
	
	public LoginPage(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements( driver, this);
	}

	public WebDriver driver;
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(xpath="//input[@type=\"password\"]")
	private WebElement password;
	
	@FindBy(id="Inpatient Ward")
	private WebElement click;
	
	@FindBy(xpath="//input[@class=\"btn confirm\"]")
	private WebElement login;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getClick() {
		return click;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
	

}
