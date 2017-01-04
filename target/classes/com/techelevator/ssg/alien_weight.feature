Feature: Alien Weight Calculator

Scenario: Calculate Martian Weight
	Given I want to calculate my weight on Mars
	And my earth weight is 100 lbs.
	When I request my alien weight
	Then my alien weight should be 38 lbs.