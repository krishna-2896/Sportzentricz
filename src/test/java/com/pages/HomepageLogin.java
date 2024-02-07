package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class HomepageLogin extends BaseClass {
	
	public HomepageLogin() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "show-more-details")
	private WebElement dropbox;
	@FindBy(xpath = "//button[text()='Edit Profile']")
	private WebElement editprofile;
	public WebElement getDropbox() {
		return dropbox;
	}
	public WebElement getEditprofile() {
		return editprofile;
	}
}
