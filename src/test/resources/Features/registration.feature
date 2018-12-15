#Author: zballouch2017@gmail.com
Feature: SignUpWithDataTableStepts

 Scenario: Sign Up to the FreeCRM
   Given I open browser
   And I navigate to the FreeCrm
   When I provide the following details
     | Edition      | FirstName | LastName | Email         | ConfirmEmail  | UserName        | Password | ConfirmPassword | Company | Phone      |
     | Free Edition | John      | Doe      | jdoe@test.com | jdoe@test.com | johndoe122      | test123  | test123         | Syntax  | 1234567890 |
     | Free Edition | James     | Doe      | jdoe@test.com | jdoe@test.com | jamesdoe1234567 | test123  | test123         | Syntax  | 1234567890 |
     | Free Edition | Jane      | Doe      | jdoe@test.com | jdoe@test.com | janedoe1234567  | test123  | test123         | Syntax  | 1234567890 |
   Then I close the browser