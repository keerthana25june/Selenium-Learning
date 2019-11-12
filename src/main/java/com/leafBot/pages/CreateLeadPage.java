package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;




public class CreateLeadPage extends ProjectSpecificMethods {

public CreateLeadPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="createLeadForm_companyName") WebElement eleComp;
	public CreateLeadPage enterCompanyName() {
		
		clearAndType(eleComp, "Capegemini");		
//		driver.findElementById("createLeadForm_companyName").sendKeys("Capgemini");
		return this;
	}
	
	@FindBy(id="createLeadForm_firstName") WebElement eleFirstName;
	public CreateLeadPage enterFirstName() {
		eleFirstName.sendKeys("Keerthana");
		return this;
	}
	
	@FindBy(id="createLeadForm_lastName") WebElement eleLastName;
	public CreateLeadPage enterLastName() {
		eleLastName.sendKeys("Boopathy");
		return this;
	}
	
	@FindBy(xpath="//input[@class='smallSubmit']") WebElement eleLeadButton;
	public ViewLead clickCreateLeadButton() {
		eleLeadButton.click();
		return new ViewLead();
	}

	
}
