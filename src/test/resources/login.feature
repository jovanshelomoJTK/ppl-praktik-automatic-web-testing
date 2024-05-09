Feature: Login Functionality

  Scenario: Successful Login
    Given I am on the Swag Labs login page
    When I enter the username "standard_user"
    And I enter the password "secret_sauce"
    And I click on the login button
    Then I should be taken to the products page

  Scenario: Wrong Password
    Given I am on the Swag Labs login page
    When I enter the username "standard_user"
    And I enter the password "wrong_password"
    And I click on the login button
    Then I should see an error message "Epic sadface: Username and password do not match any user in this service"