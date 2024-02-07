Feature: Verifying Home page functionality of Sportzentric for coaches

  Scenario: verify that Sportzentric Home page details
    Given User is on SportZentric page.
    When User should click Get Start button.
    Then User should verify after click the player icon click continue button "professional".
    Then player should enter the mobile number and login with otp.
    Then user fills the registration form details like name.
    Then enters the dob.
    Then clicks the gender button.
    Then enters the email id.
    Then selects the  sport expertise  in the dropdown box and select multiple items
    Then give experience
    And select location
    And select continue button .

  