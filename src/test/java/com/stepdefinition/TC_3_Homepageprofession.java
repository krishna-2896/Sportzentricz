package com.stepdefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_3_Homepageprofession extends BaseClass {
	PageObjectManager pom = new PageObjectManager();
	@Given("User is on SportZentric page.")
	public void userIsOnSportZentricPage() {
		System.out.println(driver.getTitle());
		if(driver.getTitle().equals("Sportzentric")) {
			System.out.println("User is in the sportzentric page");
		}
		else {
			System.out.println("user is redirected");
		}
	}
	@When("User should click Get Start button.")
	public void userShouldClickGetStartButton() {
		click(pom.getHomepage().getStart());
	}
	@Then("User should verify after click the player icon click continue button {string}.")
	public void userShouldVerifyAfterClickThePlayerIconClickContinueButton(String string) {
		click(pom.getHomepage().getProfession());
		Assert.assertEquals("professional", string);
		click(pom.getHomepage().getContinueButton());
	}
	@Then("player should enter the mobile number and login with otp.")
	public void playerShouldEnterTheMobileNumberAndLoginWithOtp() throws InterruptedException {
		sendkeys(pom.getSignUpWithOtp().getMobilenumber(), "9043770625");
		click(pom.getSignUpWithOtp().getContinueButton());
		Thread.sleep(50000);
	}
	@Then("user fills the registration form details like name.")
	public void userFillsTheRegistrationFormDetailsLikeName() {
		sendkeys(pom.getRegistration_FormPage().getName(),"Kavin");
	}
	@Then("enters the dob.")
	public void entersTheDob() {
		sendkeys(pom.getRegistration_FormPage().getDob(),"16/05/1989");
	}
	@Then("clicks the gender button.")
	public void clicksTheGenderButton() {
		click(pom.getRegistration_FormPage().getCoachmale());
	}
	@Then("enters the email id.")
	public void entersTheEmailId() {
		sendkeys(pom.getRegistration_FormPage().getEmail(),"krishna.g@gmail.com");
	}
	@Then("selects the  sport expertise  in the dropdown box and select multiple items")
	public void selectsTheSportExpertiseInTheDropdownBoxAndSelectMultipleItems() throws InterruptedException {
		sleep(10000);
		click(pom.getRegistration_FormPage().getSportExpertise());
		sleep(10000);
		WebElement clickwrestling = new WebDriverWait(driver, Duration.ofSeconds(100))
		        .until(ExpectedConditions.elementToBeClickable(findLocatorByXpath("//p[text()='Wrestling']")));
		click(clickwrestling);
	}
	@Then("give experience")
	public void giveExperience() {
	    sendkeys(pom.getRegistration_FormPage().getExperience(), "5");
	}
	@Then("select location")
	public void selectLocation() {
		 sendkeys(pom.getRegistration_FormPage().getLocation(), "india");
		 sendkeysenter(pom.getRegistration_FormPage().getLocation(),Keys.ENTER);
	}
	@Then("select continue button .")
	public void selectContinueButton() {
		click(pom.getRegistration_FormPage().getContinueButton());
	}

}
