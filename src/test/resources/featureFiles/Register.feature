Feature: Login with multiple user
  Scenario: Login with all the Login ids
    Given Navigate to the register page
    Given user is on Register Page
    Then Enter Firstname and Lastname
      | Firstname | Lastname|
      | Aditya | Pawar |
    Then Enter all other details
      |Address     | email       | Phone     | Gender| Hobbies | Languages|  Select Country |	Year | Month | Day | Password   |CPassword|
      | Chtrapati | Aditya@gmail | 8668852556| M  	 | Cricket | Engish   |    India		|   1994 | April | 5   | Aditya@123 |  Aditya@123|
    Then Click on the Refresh button


