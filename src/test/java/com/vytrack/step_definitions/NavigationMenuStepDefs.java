package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashBoardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;


public class NavigationMenuStepDefs {

    @Given("the user logs in as salesmanager")
    public void the_user_logs_in_as_salesmanager() {
        System.out.println("The user logs in as a salesmanager");
    }

    @When("the user navigates to Fleet tab and Vehicles menu")
    public void the_user_navigates_to_Fleet_tab_and_Vehicles_menu() {
        System.out.println("The user navigates to Fleet and Vehicle module");
    }

    @Then("the user should be able to see Vehicles as the page title")
    public void the_user_should_be_able_to_see_Vehicles_as_the_page_title() {
        System.out.println("The user should be able to see Vehicles as the page title");
    }

    @When("the user navigates to Marketing tab and Campaigns menu")
    public void the_user_navigates_to_Marketing_tab_and_Campaigns_menu() {
        System.out.println("The user navigates to Marketing and Campaigns module");

    }

    @Then("the user should be able to see Campaigns as the page title")
    public void the_user_should_be_able_to_see_Campaigns_as_the_page_title() {
        System.out.println("The user should be able to see Campaigns as the page title");

    }

    @When("the user navigates to Activities tab and Calendar Events menu")
    public void the_user_navigates_to_Activities_tab_and_Calendar_Events_menu() {
        System.out.println("The user navigates to Activities and Calendar Events module");

    }

    @Then("the user should be able to see Calendar Events as the page title")
    public void the_user_should_be_able_to_see_Calendar_Events_as_the_page_title() {
        System.out.println("The user should be able to see Calendar Events as the page title");

    }

    @Then("the user navigates to {string} tab and {string} module")
    public void the_user_navigates_to_tab_and_module(String tab, String module) {

        DashBoardPage dashBoardPage = new DashBoardPage();

        dashBoardPage.navigateToModule(tab, module);

        dashBoardPage.waitUntilLoaderScreenDisappear();

    }

    @And("the default page number should be {int}")
    public void the_default_page_number_should_be(Integer expectedPageNumber) {

        BrowserUtils.waitFor(3);

        ContactsPage contactsPage = new ContactsPage();

        Integer actualPageNumber = Integer.parseInt(contactsPage.pageNumber.getAttribute("value"));

        Assert.assertEquals("Verify page number", expectedPageNumber, actualPageNumber);

    }

    @Given("the user is logged in as a {string}")
    public void the_user_is_logged_in_as_a(String usertype) {

        Driver.get().get(ConfigurationReader.get("url"));

        String username = null;

        String password = null;

        switch (usertype) {
            case "driver":

                username = ConfigurationReader.get("driver_username");

                password = ConfigurationReader.get("driver_password");

                break;
            case "salesmanager":

                username = ConfigurationReader.get("salesmanager_username");

                password = ConfigurationReader.get("salesmanager_password");

                break;
            case "storemanager_username":

                username = ConfigurationReader.get("storemanager_username");

                password = ConfigurationReader.get("storemanager_password");
                break;
        }

        new LoginPage().login(username, password);
    }


    @Then("the user should see the following options")
    public void the_user_should_see_the_following_options(List<String> tabOptions) {

        DashBoardPage dashBoardPage = new DashBoardPage();

        dashBoardPage.waitUntilLoaderScreenDisappear();

        System.out.println(tabOptions.size());

        System.out.println(tabOptions);

        List<String> actualMenuTitles = BrowserUtils.getElementsText(dashBoardPage.menuOptions);

        Assert.assertEquals(tabOptions,actualMenuTitles);





    }

}