

Feature: Sales Module Page
	As a manager I should be able to create new Sales channels.


	Background:
		Given Go to URL
		Then Click on BriteErpDemo
		And Enter valid credentials & click login button
		And Navigate and click on Sales module


	#@BRIT-3997
	Scenario: As a manager I should be able to create new channels.

		When Navigate to Configuration and click on Sales Channels
		Then Click on Create button for create a new channel
		And Fill up SalesTeamName box and click on Save button
		