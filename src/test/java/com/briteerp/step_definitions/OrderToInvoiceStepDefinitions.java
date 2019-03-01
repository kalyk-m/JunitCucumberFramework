package com.briteerp.step_definitions;

import com.briteerp.pages.OrderToInvoicePage;
import com.briteerp.utilities.BrowserUtils;
import com.briteerp.utilities.Driver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

public class OrderToInvoiceStepDefinitions {
    @When("click on Order to Invoice")
    public void click_on_Order_to_Invoice() {
        OrderToInvoicePage orderToInvoicePage=new OrderToInvoicePage();
        orderToInvoicePage.orderToInvoice.click();
    }

    @Then("click checkbox next to the Order Number")
    public void click_checkbox_next_to_the_Order_Number() {
        OrderToInvoicePage orderToInvoicePage = new OrderToInvoicePage();
        orderToInvoicePage.clickFirstCheckbox.click();
    }

    @When("click any Order Number")
    public void click_any_Order_Number() {
        OrderToInvoicePage orderToInvoicePage = new OrderToInvoicePage();
        BrowserUtils.waitForPageToLoad(3);
        orderToInvoicePage.getCoordinate(1, 2).click();
    }

    @When("click on seventh raw on Order Date")
    public void click_on_seventh_raw_on_Order_Date() {
        OrderToInvoicePage orderToInvoicePage = new OrderToInvoicePage();
        BrowserUtils.waitForClickablility(orderToInvoicePage.getCoordinate(8, 3),10);
        //BrowserUtils.waitForPageToLoad(15);
        orderToInvoicePage.getCoordinate(8, 3).click();
    }

    @Then("click on the customer name")
    public void click_on_the_customer_name() {

        OrderToInvoicePage orderToInvoicePage = new OrderToInvoicePage();
        orderToInvoicePage.clickOnCustomerName.click();
    }

    @Then("get customer's email")
    public void get_customer_s_email() {
        BrowserUtils.waitForPageToLoad(15);
        OrderToInvoicePage orderToInvoicePage = new OrderToInvoicePage();
        orderToInvoicePage.getCustomerEmail.click();

    }

    @Then("get all customer Jay Z From the list")
    public void get_all_customer_Jay_Z_From_the_list() {
       // BrowserUtils.waitForPageToLoad(15);
        OrderToInvoicePage orderToInvoicePage = new OrderToInvoicePage();
        BrowserUtils.waitForPageToLoad(15);
        System.out.println(orderToInvoicePage.getCoordinate(1,4).getText());

    }

    @Then("get all customer Cybertek From the list")
    public void get_all_customer_Cybertek_From_the_list() {
        BrowserUtils.waitForPageToLoad(15);
        OrderToInvoicePage orderToInvoicePage = new OrderToInvoicePage();
        System.out.println(orderToInvoicePage.getCoordinate(2,4).getText());
    }

    @Then("get all customer Sani From the list")
    public void get_all_customer_Sani_From_the_list() {
        BrowserUtils.waitForPageToLoad(15);
        OrderToInvoicePage orderToInvoicePage = new OrderToInvoicePage();
        System.out.println(orderToInvoicePage.getCoordinate(3,4).getText());

    }

    @When("click on Pivot")
    public void click_on_Pivot() {
        OrderToInvoicePage orderToInvoicePage = new OrderToInvoicePage();
        orderToInvoicePage.pivot.click();
    }

    @Then("Get list of information")
    public void get_list_of_information(Map<String, String> userInfo) {

        System.out.println(userInfo);


//        System.out.println(userInfo.get("month1"));
//        System.out.println(userInfo.get("month2"));
//        System.out.println(userInfo.get("month3"));

    }





//    @When("click on second link on Order Date")
//    public void click_on_second_link_on_Order_Date() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }
//
//    @When("click any of customers Total")
//    public void click_any_of_customers_Total() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }
//
//    @Then("get the total value of the invoice")
//    public void get_the_total_value_of_the_invoice() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }
//
//
//    @When("click one of the order number")
//    public void click_one_of_the_order_number() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }
//
//    @Then("click on Gap Analysis Service under Product")
//    public void click_on_Gap_Analysis_Service_under_Product() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }
//
//    @Then("get the Unit Price")
//    public void get_the_Unit_Price() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }
//
//    @Then("click close button")
//    public void click_close_button() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }
//
//    @Then("get the Gap Analysis Service value from Unit Price list")
//    public void get_the_Gap_Analysis_Service_value_from_Unit_Price_list() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }
//
//    @When("click on Calendar button")
//    public void click_on_Calendar_button() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }
//
//    @When("click on Kanban.")
//    public void click_on_Kanban() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }
//
//    @Then("click on one of the order")
//    public void click_on_one_of_the_order() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }
//
//    @Then("get the product name")
//    public void get_the_product_name() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }
//
//    @Then("click on Send a Card Recovery Email.")
//    public void click_on_Send_a_Card_Recovery_Email() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }
//
//
//
//    @When("click on Pivot")
//    public void click_on_Pivot() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }

}
