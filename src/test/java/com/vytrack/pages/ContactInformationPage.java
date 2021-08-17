package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactInformationPage extends BasePage {

    @FindBy(xpath = "//h1[@class='user-name']")
    public WebElement fullName;

    @FindBy(xpath = "//a[@class='phone']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//a[@class='email']")
    public WebElement emailAddress;


}
