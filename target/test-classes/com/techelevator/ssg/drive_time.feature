Feature: Drive Time Calculator

Scenario: Calculate Travel Time
	Given I want to calculate travel time to Mars
	And my mode of transportation is Bullet Train
	And my earth age is 30 years
	When I request my travel time
	Then my travel time should be 27 years
	And my alien age should be 57 years old
	