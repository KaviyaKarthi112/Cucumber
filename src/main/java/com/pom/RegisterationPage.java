package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterationPage {
	
	public RegisterationPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements( driver, this);
	}

	public WebDriver driver;
	
	@FindBy(id="referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension")
	private WebElement register;
	
	@FindBy(name="givenName")
	private WebElement firstname;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getRegister() {
		return register;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getFamilyname() {
		return familyname;
	}

	public WebElement getArrow1() {
		return arrow1;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getArrow2() {
		return arrow2;
	}

	public WebElement getBirthdate() {
		return birthdate;
	}

	public WebElement getMonth() {
		return month;
	}

	@FindBy(name="familyName")
	private WebElement familynameclick;
	
	public WebElement getFamilynameclick() {
		return familynameclick;
	}

	@FindBy(xpath="(//input[@type=\"text\"])[3]")
	private WebElement familyname;
	
	@FindBy(id="next-button")
	private WebElement arrow1;

	@FindBy(xpath="//option[text()='Female']")
	private WebElement gender;
	
	@FindBy(xpath="//button[@class=\"confirm right\"]")
	private WebElement arrow2;
	
	@FindBy(xpath="(//input[@type=\"text\"])[4]")
	private WebElement birthdate;
	
	@FindBy(name="birthdateMonth")
	private WebElement month;
	
	@FindBy(name="birthdateYear")
	private WebElement yearclick;
	
	@FindBy(name="birthdateYear")
	private WebElement yearenter;
	
	@FindBy(id="next-button")
	private WebElement arrow3;
	
	@FindBy(name="address1")
	private WebElement addclick;
	
	@FindBy(name="address1")
	private WebElement addenter;
	
	@FindBy(id="cityVillage")
	private WebElement clickcity;
	
	@FindBy(name="cityVillage")
	private WebElement entercity;
	
	@FindBy(xpath="(//button[@type=\"button\"])[3]")
	private WebElement arrow4;
	
	@FindBy(xpath="//input[@class=\"phone\"]")
	private WebElement clickphone;
	
	@FindBy(name="phoneNumber")
	private WebElement enterphone;
	
	@FindBy(id="submit")
	private WebElement submit;
	
	@FindBy(id="country")
	private WebElement countryclick;
	
	@FindBy(id="country")
	private WebElement countryenter;

	

	public WebElement getCountryclick() {
		return countryclick;
	}
	
	public WebElement getCountryenter() {
		return countryenter;
	}

	public WebElement getYearclick() {
		return yearclick;
	}

	public WebElement getYearenter() {
		return yearenter;
	}

	public WebElement getArrow3() {
		return arrow3;
	}

	public WebElement getAddclick() {
		return addclick;
	}

	public WebElement getAddenter() {
		return addenter;
	}

	public WebElement getClickcity() {
		return clickcity;
	}

	public WebElement getEntercity() {
		return entercity;
	}

	public WebElement getArrow4() {
		return arrow4;
	}

	public WebElement getClickphone() {
		return clickphone;
	}

	public WebElement getEnterphone() {
		return enterphone;
	}

	public WebElement getSubmit() {
		return submit;
	}
	

	
	

}
