Feature: Test the skillrary App
1) Valid Case
2) Invalid Case
#i use background to make work with commom thing
Background:
Given i should open the browser and naviagte to the login page of skillrary
#whatever you put in string , it should pass value in app

Scenario: To Test the Login with user Credentials
When Enter Username "user"
And Enter Password "user"
And Click on the loginbutton
Then i should see the username as "Harry Den"

Scenario: To Test the Login with Admin Credentials
When Enter Username "admin"
And Enter Password "admin"
And Click on the loginbutton
Then i should see the admin as "SkillRary Admin"

Scenario: To Test the Login with invalid Credentials
When Enter Username "aishwarya"
And Enter Password "aishwarya"
And Click on the loginbutton
Then i should navigate to the page "Register"