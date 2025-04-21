package com.revature.step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class moonAddSteps {


        @When("the user selects Moon from the drop down")
        public void theUserSelectsMoonFromTheDropDown() {
            // Select "Moon" option in dropdown
        }

        @When("the user types in a {string} into the {string} box")
        public void theUserTypesInAValueIntoBox(String value, String boxLabel) {
                // Input value into box labeled boxLabel (Moon Name or Planet ID)
        }


        @Then("the user should have access to the correct input boxes for moons")
        public void theUserShouldHaveAccessToTheCorrectInputBoxesForMoons() {
            // Verify that input boxes are visible and enabled
        }



        @When("optionally, when the user presses {string} and attaches a JPEG or PNG")
        public void optionallyAttachFile(String buttonLabel) {
            // Optionally attach JPEG/PNG if file is provided
        }

        @When("the user clicks Submit Moon")
        public void theUserClicksSubmitMoon() {
            // Click the "Submit Moon" button
        }

        @Then("the table should refresh")
        public void theTableShouldRefresh() {
            // Wait for the table to refresh (e.g., using ExpectedConditions)
        }

        @Then("the moon should be added, with a visible picture if a file was provided")
        public void theMoonShouldBeAddedWithPictureIfProvided() {
            // Assert moon entry appears, and image is shown if file was uploaded
        }

        // ========== Invalid moon name ==========
        @When("the user now clicks Submit Moon")
        public void theUserNowClicksSubmitMoon() {
            // Submit Moon with missing or invalid data
        }

        @Then("the user should receive an alert with the message {string}")
        public void theUserShouldReceiveAnAlertWithTheMessage(String expectedMessage) {

        }

        // ========== Invalid planet ID ==========
        @When("the user clicks on {string}")
        public void theUserClicksOn(String buttonText) {
            // Click button (same as "Submit Moon" in this context)
        }
}


