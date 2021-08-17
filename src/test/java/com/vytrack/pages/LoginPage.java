package com.vytrack.pages;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {

        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id="prependedInput")
    public WebElement usernameInput;

    @FindBy(id="prependedInput2")
    public WebElement passwordInput;

    public void login(String username, String password) {

        usernameInput.sendKeys(username);

        passwordInput.sendKeys(password+ Keys.ENTER);

    }

    public void loginAsStoreManager() {

        String username = ConfigurationReader.get("storemanager_username");

        String password = ConfigurationReader.get("storemanager_password");

        usernameInput.sendKeys(username);

        passwordInput.sendKeys(password+ Keys.ENTER);

    }

    public void loginAsDriver() {

        String username = ConfigurationReader.get("driver_username");

        String password = ConfigurationReader.get("driver_password");

        usernameInput.sendKeys(username);

        passwordInput.sendKeys(password+ Keys.ENTER);

    }

    public void loginAsSalesManager() {

        String username = ConfigurationReader.get("salesmanager_username");

        String password = ConfigurationReader.get("salesmanager_password");

        usernameInput.sendKeys(username);

        passwordInput.sendKeys(password+ Keys.ENTER);

    }



}
