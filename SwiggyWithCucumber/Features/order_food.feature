Feature: Order a Food

Scenario: A user should able to order food successfully on Swiggy

Given A user is on the landing page of Swiggy
When Enter Location in the search box '<location>'
And Click go
And Click on the first restaurant on the next page
And Click Add on the first item of the restaurant page
And Click Checkout button
Then Verify you are on Checkout page by verifying the text 'SECURE CHECKOUT'


Examples:
|location|
|Bangalore, Karnataka, India|