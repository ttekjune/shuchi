@TS_1001
Feature: Login feature using valid credencials, collect data and validate application functionality

Description:
User able to log in using valid credentials
User able to collect data from web application
User able to verify functionality of application 


Background:
Given User able to open Chrome browser 
And  Put URL and go to home page

@smoke
Scenario Outline: Login feature validation

When user enters Username as "<username>" and Password "<password>"
Then user able to log in 

Examples:

|username|    |password|
|shuchi89@hotmail.com| |Aria.s.p4416|

@regression 
Scenario: user able to verify funcationality and collect data
Given User is logged in to the home page
And User takes a screenshot of the homepage
Then User searches for iphone
And Sorts prices from high to low
Then User able to count the number of 'iphone x'
And Find out the number of 'iphone' and 'iphone' names on the first page
And Find out the total number of pages
When User able to search for 'iphone x'
And Check the 'Apple brand' checkbox
And Sort the price from low to high
Then User able to find out the highest and lowest 'iphone x' prices on the first page
When User able to click on one 'iphone'
Then User able to add the item to cart
Given User able to search for 'HP laptop'
And Sort the price of HP laptops from high to low
Then User able to find out the total number of 'HP laptop' and 'HP laptop' names on the first page
And Find out the total page number
When User sort the price from low to high
Then User able to find the highest and lowest 'HP laptop' price on the first page
When User able to select one 'HP laptop'
Then User able to add the new item to cart 
When User able to proceed to cart
And User enters his email and password
And Click on the 'Deliver' button
And Click on the 'Continue' button
When User enter invalid name on card as "Peter Michaels" and card number as "3112118191467841" 
And Select expired month and year
And User click on the 'Add your card' button
Then User not able to proceed and payment fails
And Take screenshot of the failed payment
And Close the browser

