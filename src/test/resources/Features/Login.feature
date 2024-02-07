Feature: Verifying Login page functionality of Sportzentric for coaches

  Scenario: verify that Sportzentric Login page details
    Given User is on SportZentric page url
    When User should click Get Start button
    Then user clicks login button
    And user enters mobile number
    And clicks continue button
    And user waits to recieve the otp and uses manually
    And it will redirect to the home page
		When user clicks the icon 
		Then clicks the edit profile botton
		And redirects to another page
		And clicks the id proof 
		And uploads document
		And clicks goals field and send input
		And clicks radio buttons such as past injury past injury ad covid vaccine click box]
		And clicks save