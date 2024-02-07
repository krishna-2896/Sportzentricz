package com.pagemanager;

import com.base.BaseClass;
import com.pages.EditProfilePom;
import com.pages.Homepage;
import com.pages.HomepageLogin;
import com.pages.Login_with_Otp;
import com.pages.Registration_FormPage;
import com.pages.SignUpWithOtp;

public class PageObjectManager extends BaseClass {
	
	private Homepage homepage;
	private SignUpWithOtp otppage;
	private Registration_FormPage registration;
	private Login_with_Otp log_otp;
	private HomepageLogin login;
	private EditProfilePom edit;
	public Homepage getHomepage() {
		return (homepage==null)?homepage= new Homepage():homepage;
	}
	
	public SignUpWithOtp getSignUpWithOtp () {
		return (otppage==null)?otppage= new SignUpWithOtp():otppage;
	}
	public Registration_FormPage getRegistration_FormPage() {
		return (registration==null)?registration= new Registration_FormPage():registration;
	}
	
	public HomepageLogin getHomepageLogin() {
		return (login==null)?login= new HomepageLogin():login;
	}

	public Login_with_Otp getLogin_Page() {
		return (log_otp==null)?log_otp= new Login_with_Otp():log_otp;
	}
	public EditProfilePom getEditProfilePom() {
		return (edit==null)?edit= new EditProfilePom():edit;
	}
}