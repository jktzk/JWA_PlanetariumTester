package com.revature.step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class moonDeletionSteps {

        // ========== Shared Steps ==========


        @Given("the uaser is on their account's home page")
        public void theUserIsOnTheirAccountsHomePage() {
                // Navigate to the home page
        }

        @When("the user selects {string} from the drop down")
        public void theUserSelectsFromTheDropDown(String option) {
                // Select "Moon" from dropdown
        }

        // ========== Valid Deletion Scenario ==========

        @When("the user types in a valid {string} into the {string} box")
        public void theUserTypesInAValidMoonNameIntoTheBox(String moonName, String boxLabel) {
                // Type valid moon name into specified input box
        }

        @When("the user clicks the {string} button")
        public void theUserClicksTheButton(String buttonText) {
                // Click the "Delete" button
        }

        @Then("the table moon should refresh")
        public void moontheTableShouldRefresh() {
                // Confirm that the moon table refreshed
        }

        @Then("the planet entry should be deleted")
        public void theMoonEntryShouldBeDeleted() {
                // Assert that the moon (not planet, despite wording) has been deleted
        }

        // ========== Invalid Deletion Scenario ==========

        @When("the user types in an invalid {string} into the {string} box")
        public void theUserTypesInAnInvalidMoonNameIntoTheBox(String moonName, String boxLabel) {
                // Type invalid moon name into input
        }

        @Then("the user should receive a deleted alert with the message {string}")
        public void alertMessageDeleted(String expectedMessage) {

        }
}


