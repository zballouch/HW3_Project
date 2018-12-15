Feature: Sign Up and Login Features

Scenario: Create a new user account
Given I open browser
And I navigate to the FreeCrm
When I Click on Sign Up link
And I create/SignUp new user account
And I insert accurate username and password
And I click Login button
Then I successfully logged in 
