package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfigurationPage {
    public ConfigurationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "(//span[@class='oe_menu_text'])[47]")
    public WebElement salesChannel;

    @FindBy(xpath="(//button[@type='button'])[7]")
    public WebElement createNewChannel;

    @FindBy (linkText = "Create")
    public WebElement create;

    @FindBy (xpath = "//input[@name='name']")
    public WebElement typeName;

    @FindBy (xpath = "(//button[@type='button'])[9]")
    public WebElement save;


}
