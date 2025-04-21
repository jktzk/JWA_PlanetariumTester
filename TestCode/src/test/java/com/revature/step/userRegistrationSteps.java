package com.revature.step;


import static com.revature.TestRunner.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;

public class userRegistrationSteps {
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        loginPage.goToLoginPage();
    }

    @When("the user clicks the register link")
    public void the_user_clicks_the_register_link() {
        loginPage.clickRegistrationLink();
    }

    @When("the user provides username {string} for registration")
    public void the_user_provides_username_for_registration(String username) {
        registrationPage.enterUsername(username);
    }

    @When("the user provides password {string} for registration")
    public void the_user_provides_password_for_registration(String password) {
        registrationPage.enterPassword(password);
    }

    @When("user clicks the create button")
    public void user_clicks_the_create_button() {
        registrationPage.clickCreateButton();
    }


    @Then("an alert should appear saying {string}")
    public void an_alert_should_appear_saying(String expectedMessage) {
        registrationPage.waitForAlert();
        Alert alert = driver.switchTo().alert();
        String actualMessage = alert.getText();
        alert.accept();
        Assert.assertEquals(expectedMessage, actualMessage);
    }



    /*Happy Path*/
    @Then("the user should be redirected to the login page")
    public void the_user_should_be_redirected_to_the_login_page() {
        Assert.assertEquals(loginPage.getTitle(), driver.getTitle());
    }



    /*Sad Path*/
    @Then("the user should remain on the register page")
    public void the_user_should_remain_on_the_register_page() {
        Assert.assertEquals(registrationPage.getTitle(),driver.getTitle());
    }

}
