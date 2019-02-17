$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resources\\features\\createnewchannel.feature");
formatter.feature({
  "name": "Sales Module Page",
  "description": "\tAs a manager I should be able to create new Sales channels.",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Go to URL",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageStepDefinitions.go_to_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on BriteErpDemo",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStepDefinitions.click_on_BriteErpDemo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter valid credentials \u0026 click login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStepDefinitions.enter_valid_credentials_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate and click on Sales module",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStepDefinitions.navigate_and_click_on_Sales_module()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "As a manager I should be able to create new channels.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "Navigate to Configuration and click on Sales Channels",
  "keyword": "And "
});
formatter.match({
  "location": "ConfigurationPageStepDefinitions.navigate_to_Configuration_and_click_on_Sales_Channels()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Create button for create a new channel",
  "keyword": "And "
});
formatter.match({
  "location": "ConfigurationPageStepDefinitions.click_on_Create_button_for_create_a_new_channel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Fill up SalesTeamName box and click on Save button",
  "keyword": "And "
});
formatter.match({
  "location": "ConfigurationPageStepDefinitions.fill_up_SalesTeamName_box_and_click_on_Save_button()"
});
formatter.result({
  "status": "passed"
});
});