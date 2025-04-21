package com.revature.step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import io.cucumber.java.en.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class planetDeletionSteps {


    public class DeletePlanetSteps {

        @Given("the user is on their account's home page")
        public void theUserIsOnTheirAccountsHomePage() {
            // Navigate to home page
        }

        @When("the user selects {string} from the drop down")
        public void theUserSelectsFromTheDropDown(String option) {
            // Select "Planet" from the dropdown
        }

        @When("the user types in a valid {string} into the {string} box")
        public void theUserTypesInValidPlanetNameIntoTheBox(String planetName, String boxName) {
            // Enter valid planet name into the specified input box
        }

        @When("the user types in an invalid {string} into the {string} box")
        public void theUserTypesInInvalidPlanetNameIntoTheBox(String planetName, String boxName) {
            // Enter invalid planet name into the specified input box
        }

        @When("the user clicks the {string} button")
        public void theUserClicksTheButton(String buttonText) {
            // Click the "Delete" button
        }

        @Then("the table should refresh")
        public void theTableShouldRefresh() {
            // Confirm table has refreshed (e.g. wait for element to reload)
        }

        @Then("the planet entry should be deleted")
        public void thePlanetEntryShouldBeDeleted() {
            // Check that the planet is no longer in the table
        }

        @Then("the user should receive an alert with the message {string}")
        public void theUserShouldReceiveAnAlertWithTheMessage(String expectedMessage) {

        }
    }

}
