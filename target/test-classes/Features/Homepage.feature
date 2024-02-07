Feature: Verifying Home page functionality of Sportzentric for coaches

  Scenario: verify that Sportzentric Home page details
    Given User is on SportZentric page
    When User should click Get Started button
    Then User should verify after click the player icon click continue button "player"
    Then player should enter the mobile number and login with otp
    Then user fills the registration form details like name
    Then enters the dob
    Then clicks the gender button
    Then enters the email id
    Then selects the preffered sports in the dropdown box and select multiple items
    And select continue button 

  