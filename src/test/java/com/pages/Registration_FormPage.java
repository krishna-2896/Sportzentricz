package com.pages;

import org.hamcrest.Factory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Registration_FormPage extends BaseClass {
public Registration_FormPage() {
	PageFactory.initElements(driver, this);
}

@FindBy(id = "fullName")
private WebElement name;
@FindBy(id="dob")
private WebElement dob;
@FindBy(id="playerMale")
private WebElement malebutton;
@FindBy(id="playerFemale")
private WebElement Femalebutton;
@FindBy(id="email")
private WebElement email;
@FindBy(xpath = "//img[@alt='drop-arrow']")
private WebElement PrefferedSports;
@FindBy(name="continue")
private WebElement continueButton;
@FindBy(xpath ="//div[@class='dropdown-list']")
private WebElement Dropdown;
@FindBy(xpath ="//p[text()='Athletics']")
private WebElement Athletics;
@FindBy(xpath ="//p[text()='Badminton']")
private WebElement Badminton;
@FindBy(xpath ="//p[text()='Basket Ball']")
private WebElement Basket_Ball;
@FindBy(xpath ="//p[text()=''Boxing']")
private WebElement Boxing;
@FindBy(xpath ="//p[text()='Chess']")
private WebElement Chess;
@FindBy(xpath ="//p[text()='Cricket']")
private WebElement Cricket;
@FindBy(xpath ="//p[text()='Football']")
private WebElement Football;
@FindBy(xpath ="//p[text()='Hockey']")
private WebElement Hockey;
@FindBy(xpath ="//p[text()='Skating']")
private WebElement Skating;
@FindBy(xpath ="//p[text()='Swimming']")
private WebElement Swimming;
@FindBy(xpath ="//p[text()='Taekwondo']")
private WebElement Taekwondo;
@FindBy(xpath ="//p[text()='Wrestling']")
private WebElement Wrestling;
@FindBy(name="sportsExperties")
private WebElement sportExpertise;
@FindBy(id="experience")
private WebElement experience;
@FindBy(name="location")
private WebElement location;
@FindBy(id="coachMale")
private WebElement coachmale;


public WebElement getCoachmale() {
	return coachmale;
}
public WebElement getSportExpertise() {
	return sportExpertise;
}
public WebElement getExperience() {
	return experience;
}
public WebElement getLocation() {
	return location;
}
public void setDropdown(WebElement dropdown) {
	Dropdown = dropdown;
}
public void setAthletics(WebElement athletics) {
	Athletics = athletics;
}
public void setBadminton(WebElement badminton) {
	Badminton = badminton;
}
public void setBasket_Ball(WebElement basket_Ball) {
	Basket_Ball = basket_Ball;
}
public void setBoxing(WebElement boxing) {
	Boxing = boxing;
}
public void setChess(WebElement chess) {
	Chess = chess;
}
public void setCricket(WebElement cricket) {
	Cricket = cricket;
}
public void setFootball(WebElement football) {
	Football = football;
}
public void setHockey(WebElement hockey) {
	Hockey = hockey;
}
public void setSkating(WebElement skating) {
	Skating = skating;
}
public void setSwimming(WebElement swimming) {
	Swimming = swimming;
}
public void setTaekwondo(WebElement taekwondo) {
	Taekwondo = taekwondo;
}
public void setWrestling(WebElement wrestling) {
	Wrestling = wrestling;
}

public WebElement getAthletics() {
	return Athletics;
}
public WebElement getBadminton() {
	return Badminton;
}
public WebElement getBasket_Ball() {
	return Basket_Ball;
}
public WebElement getBoxing() {
	return Boxing;
}
public WebElement getChess() {
	return Chess;
}
public WebElement getCricket() {
	return Cricket;
}
public WebElement getFootball() {
	return Football;
}
public WebElement getHockey() {
	return Hockey;
}
public WebElement getSkating() {
	return Skating;
}
public WebElement getSwimming() {
	return Swimming;
}
public WebElement getTaekwondo() {
	return Taekwondo;
}
public WebElement getWrestling() {
	return Wrestling;
}
public WebElement getDropdown() {
	return Dropdown;
}
public WebElement getName() {
	return name;
}
public WebElement getDob() {
	return dob;
}
public WebElement getMalebutton() {
	return malebutton;
}
public WebElement getFemalebutton() {
	return Femalebutton;
}
public WebElement getEmail() {
	return email;
}
public WebElement getPrefferedSports() {
	return PrefferedSports;
}
public WebElement getContinueButton() {
	return continueButton;
}
}
