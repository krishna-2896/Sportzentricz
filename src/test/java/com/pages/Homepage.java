package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;



public class Homepage extends BaseClass{
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name = "get started")
	private WebElement start;
	@FindBy(xpath = "//img[@alt='player']")
	private WebElement player;
	@FindBy(xpath = "//img[@alt='coach']")
	private WebElement profession;
	@FindBy(xpath  = "//button[@name ='continue']")
	private WebElement ContinueButton;
	@FindBy(xpath = "//span[text()='Login']")
	private WebElement Login_startpage;
	public WebElement getStart() {
		return start;
	}
	public WebElement getPlayer() {
		return player;
	}
	public WebElement getProfession() {
		return profession;
	}
	public WebElement getContinueButton() {
		return ContinueButton;
	}
	public WebElement getLogin_startpage() {
		return Login_startpage;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public Homepage() {
//		PageFactory.initElements(driver, this);
//	}
//	@FindBy(xpath="//button[@class=\"sc-iAEyYk cYMKMc\"]")
//	private WebElement btnGetStarted;
//	public WebElement getBtnGetStarted() {
//		return btnGetStarted;
//	}
//
//	public WebElement getBtnProfession() {
//		return btnProfession;
//	}
//	
//	public WebElement getBtnContinue() {
//		return btnContinue;
//	}
//	
//	public WebElement getErrorMsgWithoutChooseCoaches() {
//		return errorMsgWithoutChooseCoaches;
//	}
//	
//	@FindBy(xpath = "//img[@alt='coach']")
//	private WebElement btnProfession;
//	@FindBy(xpath ="//button[@name='continue']")
//	private WebElement btnContinue;
//	@FindBy(xpath="//div[text()=\"Please select your Role in order to continue!\"]")
//	private WebElement errorMsgWithoutChooseCoaches;
//	
//	public void getStart() {
//		click(getBtnGetStarted());		
//	}
////	public WebElement getBtnGetStarted() {
////		return btnGetStarted;
////	}
////	public WebElement getBtnProfession() {
////		return btnProfession;
////	}
////	public WebElement getBtnContinue() {
////		return btnContinue;
////	}
////	public WebElement getErrorMsgWithoutChooseCoaches() {
////		return errorMsgWithoutChooseCoaches;
////	}
////
////	public void getStart() {
////		click(getBtnGetStarted());		
////	}
//	
	
	
	
	
	

}
