#This is done by BA and the BA gives this to developers and testers
Feature: OrangeHRM
Scenario: Vlidate Login
Given Ishould be in the login page of orangeHRM
When Enter Name
And Enter Password
And Click on Login button
Then Login Successful