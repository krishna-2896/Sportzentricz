package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Login_with_Otp extends BaseClass{
	public Login_with_Otp() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//input[@value='+91']")
	private  WebElement mobilenumber;

	@FindBy(name="continue")
	private WebElement continueButton;

	public WebElement getMobilenumber() {
		return mobilenumber;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}
}
