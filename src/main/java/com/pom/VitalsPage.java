package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VitalsPage {
	
public VitalsPage(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements( driver, this);
	}

public WebDriver getDriver() {
	return driver;
}

public WebElement getStartvisit() {
	return startvisit;
}

public WebElement getConfirm() {
	return confirm;
}

public WebElement getCapture() {
	return capture;
}

public WebElement getHeight() {
	return height;
}

public WebElement getWeightclick() {
	return Weightclick;
}

public WebElement getWeightenter() {
	return Weightenter;
}

public WebElement getTempclick() {
	return tempclick;
}

public WebElement getTempenter() {
	return tempenter;
}

public WebElement getPulseclick() {
	return pulseclick;
}

public WebElement getPulseenter() {
	return pulseenter;
}

public WebElement getBloodclick() {
	return bloodclick;
}

public WebElement getBloodenter() {
	return bloodenter;
}

public WebElement getBloodmaxclick() {
	return bloodmaxclick;
}

public WebElement getBloodmaxenter() {
	return bloodmaxenter;
}

public WebElement getSave() {
	return save;
}

public WebDriver driver;
	
	@FindBy(xpath="(//div[@class=\"col-11 col-lg-10\"])[1]")
	private WebElement startvisit;
	
	@FindBy(id="start-visit-with-visittype-confirm")
	private WebElement confirm;
	
	@FindBy(id="referenceapplication.realTime.vitals")
	private WebElement capture;
	
	@FindBy(name="w8")
	private WebElement height ;
	
    @FindBy(id="w10")
	private WebElement Weightclick ;
    
    @FindBy(id="w10")
	private WebElement Weightenter ;
   
    @FindBy(xpath="(//*[@class=\"number numeric-range\"])[3]")
    private WebElement tempclick ;

    @FindBy(name="w12")
    private WebElement tempenter ;
    
    @FindBy(name="w14")
    private WebElement pulseclick ;
    
    @FindBy(id="w14")
    private WebElement pulseenter ;
    
    @FindBy(id="w18")
    private WebElement bloodclick ;
    
    @FindBy(name="w18")
    private WebElement bloodenter; 
    
    @FindBy(xpath="//input[@class=\"integer numeric-range expected focused\"]")
    private WebElement bloodmaxclick ;
    
    @FindBy(name="w20")
    private WebElement bloodmaxenter ;
    
    @FindBy(id="save-form")
    private WebElement saveform;
    
    @FindBy(xpath="//button[@onclick=\"submitHtmlForm()\"] ")
    private WebElement save ;

	public WebElement getSaveform() {
		return saveform;
	}
	
	@FindBy(linkText="kaviya k")
	public WebElement check;

	public WebElement getCheck() {
		return check;
	}
	
    
    
                   
}
