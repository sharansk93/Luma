Feature: Luma Application
Scenario: Place an order
Given Launch the URL 
When I add a product to the Cart
And I enter the size and colour proceed to check out
And I enter all the details and place the order
Then I print the order ID