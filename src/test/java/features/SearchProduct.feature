Feature: Search and place the order


#Scenario: Search functionality in both Search page and Offers page
#Given User is on GreenKart Landing page
#When user search with shortname "Tom" and search result displayed
#Then user search same name "Tom" in Offers page 
#And validate if same name is displayed

@SearchProduct
Scenario Outline: Search functionality in both Search page and Offers page for multiple products
Given User is on GreenKart Landing page
When user search with <Product_Name> and search result displayed
When user navigate to Offers page
Then user search same name <Product_Name> in Offers page 
And validate if same name is displayed

Examples:
|Product_Name|
|Tomato|
|Beetroot|
