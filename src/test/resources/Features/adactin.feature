Feature: To validate the functionality of AdactIn application


Scenario: To validate the login functionality with invalid credentials
Given The user has to be in AdactIn login page
When The user enter the username and password
And The user click the login button
Then The user navigate to the invalid login page

Scenario Outline: To validate the login functionality with invalid credentials2
Given The user has to be in AdactIn login page
When The user enter the  "<username>" and "<password>"
And The user click the login button
Then The user navigate to the invalid login page
 Examples:
    |username|password|
    |Priyaa|12345|


