Feature: Login functionality
Scenario: positive scenario with valid credentials
Given user on home page
When user click signin button
And user enter email
And user click continue button
And user enter password
And user click login button
Then sucecessful login 
