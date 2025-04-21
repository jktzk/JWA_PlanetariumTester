package com.revature.step;

import static com.revature.TestRunner.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class planetAddSteps {
    @Given("the user is on their account's home page")
    public void the_user_is_on_their_account_s_home_page() {
        loginPage.goHome();
    }
    @When("the user selects Planet from the drop down")
    public void the_user_selects_planet_from_the_drop_down() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user types in a {string} into the {string} box")
    public void the_user_types_in_a_valid_into_the_box(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("optionally, when the user presses {string} and attaches a JPEG or PNG")
    public void optionally_when_the_user_presses_and_attaches_a_jpeg_or_png(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user clicks Submit Planet")
    public void the_user_clicks_submit_planet() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    /*happy path*/

    @Then("the user should have acess to the correct input boxes for planets")
    public void the_user_should_have_acess_to_the_correct_input_boxes_for_planets() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



    @Then("the table should refresh")
    public void the_table_should_refresh() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the planet should be added, with a visible picture if a file was provided")
    public void the_planet_should_be_added_with_a_visible_picture_if_a_file_was_provided() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    /*sad path*/


    @Then("the user should receive an alert with the message {string}")
    public void the_user_should_receive_an_alert_with_the_message(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
