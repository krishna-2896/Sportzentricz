package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SignUpWithOtp extends BaseClass{
public SignUpWithOtp() {
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
