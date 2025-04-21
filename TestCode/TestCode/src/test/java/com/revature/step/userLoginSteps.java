package com.revature.step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class userLoginSteps {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user types into the password box")
    public void the_user_types_into_the_password_box() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    /* Happy Path */
    @Then("their password should remain obscured while typing")
    public void their_password_should_remain_obscured_while_typing() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user provides correct username {string} for login")
    public void the_user_provides_correct_username_for_login(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user provides correct password {string} for login")
    public void the_user_provides_correct_password_for_login(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("when the user clicks the log button")
    public void when_the_user_clicks_the_log_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the user should arrive to their account's home page")
    public void the_user_should_arrive_to_their_account_s_home_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    /*Sad Path*/

    @When("the user provides incorrect username {string} for login")
    public void the_user_provides_incorrect_username_for_login(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user provides incorrect password {string} for login")
    public void the_user_provides_incorrect_password_for_login(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user clicks the log button")
    public void the_user_clicks_the_log_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the user should receive an alert saying {string}")
    public void the_user_should_receive_an_alert_saying(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the user should remain on the login page")
    public void the_user_should_remain_on_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
