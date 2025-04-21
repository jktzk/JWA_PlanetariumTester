package com.revature.step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class userRegistrationSteps {
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user clicks the register link")
    public void the_user_clicks_the_register_link() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



    /*Happy Path*/



    @When("the user provides valid username {string} for registration")
    public void the_user_provides_valid_username_for_registration(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user provides valid password {string} for registration")
    public void the_user_provides_valid_password_for_registration(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("a success alert should appear saying {string}")
    public void a_success_alert_should_appear_saying(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the user should be redirected to the login page")
    public void the_user_should_be_redirected_to_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }




    /*Sad Path*/



    @When("the user provides invalid username {string} for registration")
    public void the_user_provides_invalid_username_for_registration(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user provides invalid password {string} for registration")
    public void the_user_provides_invalid_password_for_registration(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("a failure alert should appear saying {string}")
    public void a_failure_alert_should_appear_saying(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the user should remain on the register page")
    public void the_user_should_remain_on_the_register_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
