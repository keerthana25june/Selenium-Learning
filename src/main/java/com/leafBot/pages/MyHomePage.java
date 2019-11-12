package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

import pages.Leads;

public class MyHomePage extends ProjectSpecificMethods  {
	
	//Page Factory
	public MyHome() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//div[@class='x-panel-header']/following::a[1]") WebElement eleClickLead;
	public Leads clickLeads() {
		eleClickLead.click();
		return new Leads(); 
	}

}
