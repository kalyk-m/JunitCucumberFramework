package com.briteerp.step_definitions;

import com.briteerp.pages.LoginPage;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ConfigurationPageStepDefinitions {

    @Given("Go to URL")
    public void go_to_URL() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Then("Click on BriteErpDemo")
    public void click_on_BriteErpDemo() {
        LoginPage loginPage = new LoginPage();
        loginPage.BriteErpDemo.click();
    }

   /* @Then("Enter valid credentials & click login button")
    public void enter_valid_credentials_click_login_button() {

    }

    @Then("Navigate and click on Sales module")
    public void navigate_and_click_on_Sales_module() {

    }

    @Then("Navigate to Configuration and click on Sales Channels")
    public void navigate_to_Configuration_and_click_on_Sales_Channels() {
    }

    @Then("Click on Create button for create a new channel")
    public void click_on_Create_button_for_create_a_new_channel() {
    }

    @Then("Fill up SalesTeamName box and click on Save button")
    public void fill_up_SalesTeamName_box_and_click_on_Save_button() {
    }
*/
}
