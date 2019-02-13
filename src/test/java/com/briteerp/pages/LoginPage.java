package com.briteerp.pages;

import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    @FindBy(id = "login")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;

//    @FindBy(xpath = "//input[@name='csrf_token']")
//    public WebElement hiddenMessage;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement loginButton;

    //Sign in
    @FindBy(linkText="Sign in")
    public WebElement signIn;

    //Sign in
    @FindBy(linkText="BriteErpDemo")
    public WebElement BriteErpDemo;

    @FindBy(linkText="Sales")
    public WebElement sales;

    @FindBy(linkText="SalesManager")
    public WebElement salesManagerText;

    @FindBy(linkText="SalesUser2")
    public WebElement salesUser2Text;

    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement errorMessage;


    public void clickSales() {
        sales.click();
    }


    public void selectBriteErpDemo() {
        BriteErpDemo.click();
    }

    //When you open webpage, click on sign in button
    public void signIn(){ //signIn this line is method name
        signIn.click(); // signIn in this line comes from above WebElement
    }

    public void login(String usr, String pass) {
        email.sendKeys(usr);
        password.sendKeys(pass);
        loginButton.click();

    }

    public void salesManagerLogin() {
        selectBriteErpDemo();
        email.sendKeys(ConfigurationReader.getProperty("salesManagerEmail"));
        password.sendKeys(ConfigurationReader.getProperty("salesManagerPassword"));
        loginButton.click();
//                BrowserUtils.waitForPageToLoad(15);

        sales.click();
    }

    public void userLogin() {
        selectBriteErpDemo();
        email.sendKeys(ConfigurationReader.getProperty("salesUser2Email"));
        password.sendKeys(ConfigurationReader.getProperty("salesUser2Password"));
        loginButton.click();
        sales.click();
    }

    public void open() {  // This method is not necessary anymore
        // Because drive class provides same function under @Before method
        //it is automatically triggered.
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }



}
