package com.vytrack.step_definitions;

import com.vytrack.pages.DashBoardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import javax.lang.model.SourceVersion;
import java.util.List;
import java.util.Map;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

        String url = ConfigurationReader.get("url");

        Driver.get().get(url);
    }

    @When("the user enters valid credentials for drivers")
    public void the_user_enters_valid_credentials_for_drivers() {

        String username = ConfigurationReader.get("driver_username");

        String password = ConfigurationReader.get("driver_password");

        LoginPage loginPage = new LoginPage();

        loginPage.loginAsDriver();



    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {

        new DashBoardPage().waitUntilLoaderScreenDisappear();

        String actualTitle = Driver.get().getTitle();

        String expectedTitle = "Dashboard";

        Assert.assertEquals("Verify login",expectedTitle,actualTitle);

    }


    @When("the user enters valid credentials for salesmanagers")
    public void theUserEntersValidCredentialsForSalesmanagers() {

        String username = ConfigurationReader.get("salesmanager_username");

        String password = ConfigurationReader.get("salesmanager_password");

        LoginPage loginPage = new LoginPage();

        loginPage.loginAsSalesManager();

        BrowserUtils.waitFor(3);



    }

    @When("the user enters valid credentials for storemanagers")
    public void theUserEntersValidCredentialsForStoremanagers() {

        String username = ConfigurationReader.get("storemanager_username");

        String password = ConfigurationReader.get("storemanager_password");

        LoginPage loginPage = new LoginPage();

        loginPage.loginAsStoreManager();

        BrowserUtils.waitFor(3);

    }

    @When("the user enters {string} and {string}")
    public void the_user_enters_and(String username, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }

    @Then("the title should contain {string}")
    public void the_title_should_contain(String expectedTitle) {

        DashBoardPage dashBoardPage = new DashBoardPage();

        dashBoardPage.waitUntilLoaderScreenDisappear();

        Assert.assertTrue("Verify the title", Driver.get().getTitle().contains(expectedTitle));

    }

    @When("the user enters valid credentials as a {string}")
    public void the_user_enters_valid_credentials_as_a(String usertype) {

       Driver.get().get(ConfigurationReader.get("url"));

       String username = null;

       String password = null;

       if (usertype.equals("driver")) {

           username = ConfigurationReader.get("driver_username");

           password = ConfigurationReader.get("driver_password");

       }else if(usertype.equals("salesmanager")) {

           username = ConfigurationReader.get("salesmanager_username");

           password = ConfigurationReader.get("salesmanager_password");

       }else if (usertype.equals("storemanager_username")) {

           username = ConfigurationReader.get("storemanager_username");

           password = ConfigurationReader.get("storemanager_password");
       }

       new LoginPage().login(username, password);
    }

    @When("the user logs in using the following credentials")
    public void the_user_logs_in_using_the_following_credentials(Map<String, String> userInfo) {

        LoginPage loginPage = new LoginPage();

        loginPage.login(userInfo.get("username"),userInfo.get("password"));

        BrowserUtils.waitFor(5);

        String actualName = new DashBoardPage().getUserName();

        String expectedName = userInfo.get("firstname") + " " + userInfo.get("lastname");

        Assert.assertEquals(expectedName,actualName);

        System.out.println("userInfo = " + userInfo);

        System.out.println("expectedName = " + expectedName);

        System.out.println("actualName = " + actualName);






    }





}
