package com.briteerp.step_definitions;

import com.briteerp.pages.LoginPage;
import com.briteerp.utilities.BrowserUtils;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginPageStepDefinitions {

    @Given("Go to URL")
    public void go_to_URL() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Then("Click on BriteErpDemo")
    public void click_on_BriteErpDemo() {

        LoginPage loginPage = new LoginPage();
        BrowserUtils.waitForPageToLoad(5);
        loginPage.briteErpDemo.click();
    }

    @Then("Enter valid credentials & click login button")
    public void enter_valid_credentials_click_login_button() {

        LoginPage loginPage = new LoginPage();
        loginPage.email.sendKeys(ConfigurationReader.getProperty("salesManagerEmail"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("salesManagerPassword"));
        loginPage.loginButton.click();
    }

    @Then("Navigate and click on Sales module")
    public void navigate_and_click_on_Sales_module() {

        LoginPage loginPage = new LoginPage();
        BrowserUtils.waitForPageToLoad(5);
        loginPage.sales.click();
    }
}