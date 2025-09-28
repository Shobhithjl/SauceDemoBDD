Feature:Login feature 

Scenario::When user logs in with valid credentials user should be redirected to Home page.

Given user is in Login page

When user enters valid username and valid password
And clicks on Login button
Then user should be redirected to Home page