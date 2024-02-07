package com.stepdefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_1_HomePageStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();


	@Given("User is on SportZentric page")
	public void user_is_on_sport_zentric_page() {
		System.out.println(driver.getTitle());
		if(driver.getTitle().equals("Sportzentric")) {
			System.out.println("User is in the sportzentric page");
		}
		else {
			System.out.println("user is redirected");
		}
	}
	@When("User should click Get Started button")
	public void user_should_click_get_started_button() {
		click(pom.getHomepage().getStart());
	}
	@Then("User should verify after click the player icon click continue button {string}")
	public void user_should_verify_after_click_the_player_icon_click_continue_button(String string) {
		click(pom.getHomepage().getPlayer());
		Assert.assertEquals("player", string);
		click(pom.getHomepage().getContinueButton());
	}
	@Then("player should enter the mobile number and login with otp")
	public void playerShouldEnterTheMobileNumberAndLoginWithOtp() throws InterruptedException {
		sendkeys(pom.getSignUpWithOtp().getMobilenumber(), "8838028719");
		click(pom.getSignUpWithOtp().getContinueButton());
		Thread.sleep(10000);
	}
	@Then("user fills the registration form details like name")
	public void user_fills_the_registration_form_deatils_like_name() {
		sendkeys(pom.getRegistration_FormPage().getName(),"krishna");
	}

	@Then("enters the dob")
	public void enters_the_dob() {
		sendkeys(pom.getRegistration_FormPage().getDob(),"16/07/1997");
	}
	@Then("clicks the gender button")
	public void clicksTheGenderButton() {
		click(pom.getRegistration_FormPage().getMalebutton());
	}
	@Then("enters the email id")
	public void entersTheEmailId() {
		sendkeys(pom.getRegistration_FormPage().getEmail(),"krishna.ng@gmail.com");
	}
	@Then("selects the preffered sports in the dropdown box and select multiple items")
	public void selectsThePrefferedSportsInTheDropdownBoxAndSelsctMultipleItems() throws InterruptedException {
		sleep(10000);
		click(pom.getRegistration_FormPage().getPrefferedSports());
		sleep(10000);
		WebElement clickwrestling = new WebDriverWait(driver, Duration.ofSeconds(100))
		        .until(ExpectedConditions.elementToBeClickable(findLocatorByXpath("//p[text()='Wrestling']")));
		click(clickwrestling);
		click(pom.getRegistration_FormPage().getPrefferedSports());
		sleep(10000);
		WebElement clickchess = new WebDriverWait(driver, Duration.ofSeconds(100))
		        .until(ExpectedConditions.elementToBeClickable(findLocatorByXpath("//p[text()='Cricket']")));
		click(clickchess);
	
	}
	
	@Then("select continue button")
	public void selectContinueButton() {
		click(pom.getRegistration_FormPage().getContinueButton());
	}
	


}