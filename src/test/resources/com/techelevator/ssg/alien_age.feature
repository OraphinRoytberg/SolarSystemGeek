Feature: Alien Age Calculator

Scenario: Calculate Martian Age
	Given I want to calculate my age on Mars
	And my earth age is 37 years
	When I request my alien age
	Then my alien age should be 19 years