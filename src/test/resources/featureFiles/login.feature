
Feature: Login with valid user

  Scenario: Free CRM Login Test Scenario

    Given user is already on Login Page
    When title of login page is Free CRM
    When user enters username and password
      |standard_user|secret_sauce|
    Then user clicks on login button
    Then User land on the homepage
    Then Close the browser
#test

  Scenario: Login with invalid user

    Given invalid user is already on Login Page
    When user enters Locked username and password
      |locked_out_user|secret_sauce|
    Then Locked user clicks on login button
    Then user get the error message of locaked user
    Then Message is Epic sadface: Sorry, this user has been locked out
    Then Close the browser locked user

  Scenario: Login with invalid password

    Given  invalid user is already on Login Page-invalid user
    When user enters Locked username and password-invalid user
      |standard_user|secret_sauce1|
    Then user clicks on login button-invalid user
    Then user get the error message of invalid credentials user-invalid user
    Then Message is Epic sadface: Username and password do not match any user in this service-invalid user
    Then Close the browser-invalid user


  Scenario: Login with invalid Username

    Given  invalid user is already on Login Page-invalid username
    When user enters Locked username and password-invalid username
      |standard_userr|secret_sauce|
    Then user clicks on login button-invalid username
    Then user get the error message of invalid credentials user-invalid username
    Then Message is Epic sadface: Username and password do not match any user in this service-invalid username
    Then Close the browser-invalid username

  Scenario: Close button on the error message

    Given  invalid user is already on Login Page-invalid username Close button
    When user enters Locked username and password--invalid username Close button
      |standard_userr|secret_sauce|
    Then user clicks on login button--invalid username Close button
    Then Close button should close the error message--invalid username Close button
    Then Close the browser-invalid username
