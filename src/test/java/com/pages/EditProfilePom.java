package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class EditProfilePom extends BaseClass{
	public EditProfilePom() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "playerAadharCard")
	private WebElement adhar;
	@FindBy(id ="idProof")
	private WebElement upload;
	@FindBy(id="goals")
	private WebElement goals;
	@FindBy(id="pastInjuriesNo")
	private WebElement pastinjury;
	@FindBy(id="pastHealthIssuesNo")
	private WebElement pastHealthIssues;
	@FindBy(id="vaccinationYes")
	private WebElement vaccination;
	@FindBy(id = "vaccineCertificates")
	private WebElement uploadVaccine;
	public WebElement getUploadVaccine() {
		return uploadVaccine;
	}
	@FindBy(name="save")
	private WebElement save;
	public WebElement getAdhar() {
		return adhar;
	}
	
	public WebElement getUpload() {
		return upload;
	}
	
	public WebElement getGoals() {
		return goals;
	}
	
	public WebElement getPastinjury() {
		return pastinjury;
	}
	
	public WebElement getPastHealthIssues() {
		return pastHealthIssues;
	}
	
	public WebElement getVaccination() {
		return vaccination;
	}
	
	public WebElement getSave() {
		return save;
	}
	
	
}
