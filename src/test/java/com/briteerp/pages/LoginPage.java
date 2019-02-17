package com.briteerp.pages;

import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "login")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement loginButton;

    //Sign in
    @FindBy(linkText="Sign in")
    public WebElement signIn;

    //Sign in
    @FindBy(xpath="(//a[@class='list-group-item'])[2]")
    public WebElement briteErpDemo;

    @FindBy(linkText="Sales")
    public WebElement sales;

    @FindBy(linkText="SalesManager")
    public WebElement salesManagerText;

    @FindBy(linkText="SalesUser2")
    public WebElement salesUser2Text;

    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement errorMessage;


    public void login(String email, String password) {
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        loginButton.click();
    }


    public void open() {  // This method is not necessary anymore
        // Because drive class provides same function under @Before method
        //it is automatically triggered.
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
}
