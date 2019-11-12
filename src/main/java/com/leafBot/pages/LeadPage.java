package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

import pages.CreateLead;
import pages.FindLeads;

public class LeadPage extends ProjectSpecificMethods {
	
	public Leads() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[text()='Create Lead']") WebElement eleCreateLead;
	public CreateLead clickCreateLead() {
		eleCreateLead.click();
		return new CreateLead();
	}
	
	@FindBy(xpath="//a[text()='Find Leads']") WebElement eleclickFindLead;
	public FindLeads findLeadButton() {
		
		eleclickFindLead.click();		
		return new FindLeads();
		
	}

}
