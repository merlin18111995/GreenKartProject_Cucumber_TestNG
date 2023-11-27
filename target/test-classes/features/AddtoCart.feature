Feature: Add to Cart

@placeOrder
Scenario: Search for a product and add to cart
Given User is on GreenKart Landing page
When user search for a product "Tomato" and search result displayed
Then add "4" products to cart
And Go to Cart and proceed to checkout
And Validate all the fields in checkout page and proceed to checkout
