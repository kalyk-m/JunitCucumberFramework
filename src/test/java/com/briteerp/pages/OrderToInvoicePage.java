package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrderToInvoicePage {

        public OrderToInvoicePage() {
            PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(linkText="Orders to Invoice")
        public WebElement orderToInvoice;

        @FindBy(xpath="(//input[@type='checkbox'])[3]")
        public WebElement clickFirstCheckbox;


        @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/tbody/tr/td[4]")
        public List<WebElement> customers;

        //print by coordinates: based on row and colum number
        public WebElement getCoordinate(int row, int col) {
            String xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/tbody/tr["+row+"]/td["+col+"]";
            return Driver.getDriver().findElement(By.xpath(xpath));
        }

        //table in the invoice
        public WebElement getCoordinateInInvoice(int row, int col) {
            String xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/tbody/tr["+row+"]/td["+col+"]";
            return Driver.getDriver().findElement(By.xpath(xpath));
        }

        @FindBy(name = "partner_id")
        public WebElement clickOnCustomerName;

        @FindBy(xpath = "//a[@name='email']")
        public WebElement getCustomerEmail;

        @FindBy(xpath = "//span[@class='o_field_char o_field_widget o_readonly_modifier o_required_modifier']")
        public WebElement invoiceNumber;

        @FindBy(xpath = "//ol//li[@class='active']")
        public WebElement orderToInvoiceTittle;

        @FindBy( xpath= "//button[@data-original-title='Calendar']")
        public WebElement calendar;
    }



