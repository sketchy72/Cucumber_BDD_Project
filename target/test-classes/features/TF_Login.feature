@login.Feature 
Feature: TF login and new a/c functionality validation 

Background: 
	Given User is on Techfios login page  

Scenario Outline: User can login and open a new account with valid credentials  
	When User enters Username as "<Username>" 
	When User enters Password as "<password>" 
	When User clicks Signin button 
	Then User should land on Dashboard page 
	When User clicks on Bank and Cash option on dashboard 
	When User clicks on New Account option 
	When User enters AccountTitle as "<accountTitle>" 
	When User enters Description as "<description>" 
	When User enters InitialBalance as "<initialBalance>" 
	When User enters AccountNumber as "<accountNumber>" 
	When User enters ContactPerson as "<contactPerson>" 
	When User enters Phone as "<phone>" 
	And User enters url as "<URL>" 
	Then User clicks submit button 
	
	Examples: 
		|Username		  |password |accountTitle|description |initialBalance|accountNumber|contactPerson|phone		|url|
		|demo@techfios.com|abc123	|RamRoy		 |Checking Acc|150			 |5291360072   |SaladDressing|6664448888|www.duckduckgo.com|
		