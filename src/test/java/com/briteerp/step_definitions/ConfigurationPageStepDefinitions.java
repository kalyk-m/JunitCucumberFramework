package com.briteerp.step_definitions;

import com.briteerp.pages.ConfigurationPage;
import com.briteerp.pages.LoginPage;
import com.briteerp.utilities.BrowserUtils;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfigurationPageStepDefinitions {

    @Then("Navigate to Configuration and click on Sales Channels")
    public void navigate_to_Configuration_and_click_on_Sales_Channels() {

        ConfigurationPage configurationPage= new ConfigurationPage();
        configurationPage.salesChannel.click();
    }

    @Then("Click on Create button for create a new channel")
    public void click_on_Create_button_for_create_a_new_channel() {

        ConfigurationPage configurationPage= new ConfigurationPage();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        wait.until(ExpectedConditions.urlContains("242"));
        configurationPage.createNewChannel.click();

    }

    @Then("Fill up SalesTeamName box and click on Save button")
    public void fill_up_SalesTeamName_box_and_click_on_Save_button() {

        ConfigurationPage configurationPage= new ConfigurationPage();
        configurationPage.typeName.sendKeys(ConfigurationReader.getProperty("name"));
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        wait.until(ExpectedConditions.urlContains("242"));
        configurationPage.save.click();
    }

}
