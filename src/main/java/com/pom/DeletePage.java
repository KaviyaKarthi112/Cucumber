package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeletePage {
	
	public WebDriver driver;
	
	@FindBy(xpath="(//div[@class=\"col-11 col-lg-10\"])[17]")
	private WebElement delete;
	
	@FindBy(id="delete-reason")
	private WebElement reason;
	
	@FindBy(xpath="(//button[text()='Confirm'])[3]")
	private WebElement deleteconfirm;
	
	@FindBy(linkText="Logout")
	private WebElement logout;

	public DeletePage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements( driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getDelete() {
		return delete;
	}

	public WebElement getReason() {
		return reason;
	}

	public WebElement getDeleteconfirm() {
		return deleteconfirm;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	@FindBy(id="patient-search-results-table_wrapper")
	private WebElement detaildelete;

	public WebElement getDetaildelete() {
		return detaildelete;
	}
	

}
