package com.stepdefinition;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_2_LoginPageStep extends BaseClass{
	PageObjectManager pom = new PageObjectManager();
	@Given("User is on SportZentric page url")
	public void userIsOnSportZentricPageUrl() {
		System.out.println(driver.getTitle());
		if(driver.getTitle().equals("Sportzentric")) {
			System.out.println("User is in the sportzentric page");
		}
		else {
			System.out.println("user is redirected");
		}
	}    
	
	@When("User should click Get Start button")
	public void userShouldClickGetStartButton() throws InterruptedException {
		click(pom.getHomepage().getStart());
		sleep(2000);
	}
	@Then("user clicks login button")
	public void userClicksLoginButton() throws InterruptedException {
		click(pom.getHomepage().getLogin_startpage());
		sleep(2000);
	}
	@Then("user enters mobile number")
	public void userEntersMobileNumber() throws InterruptedException {
		sendkeys(pom.getLogin_Page().getMobilenumber(), "8838028719");
		sleep(2000);
	}
	@Then("clicks continue button")
	public void clicksContinueButton() throws InterruptedException {
		click(pom.getLogin_Page().getContinueButton());
		sleep(2000);
	}
	@Then("user waits to recieve the otp and uses manually")
	public void userWaitsToRecieveTheOtpAndUsesManually() throws InterruptedException {
		sleep(10000);
	}
	@Then("it will redirect to the home page")
	public void itWillRedirectToTheHomePage() {
		if(driver.getTitle().equals("Sportzentric")) {
			System.out.println("LoginScuucessful");
		}
	}
	@When("user clicks the icon")
	public void userClicksTheIcon() throws InterruptedException {
	    click(pom.getHomepageLogin().getDropbox());
	    sleep(5000);
	}
	@Then("clicks the edit profile botton")
	public void clicksTheEditProfileBotton() throws InterruptedException {
	    click(pom.getHomepageLogin().getEditprofile());
	    sleep(5000);
	}
	@Then("redirects to another page")
	public void redirectsToAnotherPage() {
		if(driver.getTitle().equals("Sportzentric")) {
			System.out.println("LoginSuccessful");
		}
	}
	@Then("clicks the id proof")
	public void clicksTheIdProof() throws InterruptedException {
	   click(pom.getEditProfilePom().getAdhar());
	   sleep(5000);
	}
	@Then("uploads document")
	public void uploadsDocument() throws InterruptedException {	  

		sendkeys(pom.getEditProfilePom().getUpload(), "C:\\Users\\Alam-Alfan\\Downloads\\id.jpg");
		   sleep(5000);

	   	}
	@Then("clicks goals field and send input")
	public void clicksGoalsFieldAndSendInput() {
	   sendkeys(pom.getEditProfilePom().getGoals(), "To become a national player");
	}
	@Then("clicks radio buttons such as past injury past injury ad covid vaccine click box]")
	public void clicksRadioButtonsSuchAsPastInjuryPastInjuryAdCovidVaccineClickBox() throws InterruptedException {
	  click(pom.getEditProfilePom().getPastinjury());
	  sleep(5000);
	  click(pom.getEditProfilePom().getPastHealthIssues());
	  sleep(5000);
	  click(pom.getEditProfilePom().getVaccination());
	  sleep(5000);
	  sendkeys(pom.getEditProfilePom().getUploadVaccine(), "C:\\Users\\Alam-Alfan\\Downloads\\id.jpg");
	  sleep(5000);
	}
	@Then("clicks save")
	public void clicksSave() {
		click(pom.getEditProfilePom().getSave());
	}


}
