package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage extends BasePage {

    //Not needed actually as BasePage has a constructor
    public ContactsPage() {

        PageFactory.initElements(Driver.get(), this);
    }
//    @FindBy(xpath = "//td[@data-column-label='Email'][contains(text(),'mbrackstone9@example.com')]")
//    public WebElement email;

    @FindBy(css=".input-widget")
    public WebElement pageNumber;

    public WebElement getContactEmail(String email) {

        String xpath = "//td[@data-column-label='Email'][contains(text(),'"+email+"')]";

        return Driver.get().findElement(By.xpath(xpath));

    }

    public void clickEmailToSeeDetails(String email) {

        getContactEmail(email).click();
    }

    public WebElement getContactPhone(String phone) {

        String xpath = "//a[@class='nowrap'][contains(@href,'tel')]";

        return Driver.get().findElement(By.xpath(xpath));
    }

    public WebElement getFirstName(String firstName) {

        String xpath = "//a[@data-column-label='First name'][contains(text(),'"+firstName+"')]";

        return Driver.get().findElement(By.xpath(xpath));
    }






}
