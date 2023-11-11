#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Add feature description here - Order Pizza from Swiggy 
Scenario: Order Pizza From Swiggy
Given Navigate to the landing page of Swiggy "https://www.swiggy.com/"

When Enter location as "<city>"
Then Select first location from suggested location in suggestion-box
#When Redirect to the ItemPage
#When Hover over search icon
#When Enter Item as "Pizza"
#When Select first suggested Item in pizza cateogory
#When Search resturant and select first restaurant
#When Redirect to orderPage 
#When Add first item to cart 
#When Click on checkout button
#Then Order a pizza suscessfully 

Examples: 
|city|
|Mumbai|