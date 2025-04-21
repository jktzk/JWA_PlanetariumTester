package com.revature.step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class moonDeletionSteps {

        // ========== Shared Steps ==========


        @When("the user selects {string} from the drop down")
        public void theUserSelectsFromTheDropDown(String option) {
            // Select dropdown item by visible text
        }

        // ========== Delete Planet ==========

        @When("the user types in a valid {string} into the {string} box")
        public void theUserTypesInValidPlanetNameIntoBox(String planetName, String boxName) {
            // Enter a valid planet name in the delete box
        }

        @When("the user types in an invalid {string} into the {string} box")
        public void theUserTypesInInvalidPlanetNameIntoBox(String planetName, String boxName) {
            // Enter an invalid planet name
        }

        @When("the user clicks the {string} button")
        public void theUserClicksDeleteButton(String buttonName) {
            // Click the Delete button
        }

        @Then("the planet entry should be deleted")
        public void thePlanetEntryShouldBeDeleted() {
            // Verify the planet is no longer in the table
        }

        @Then("the user should receive an alert with the message {string}")
        public void theUserShouldReceiveAlertWithMessage(String message) {
            // Validate alert with expected message
        }

        // ========== Moon Add ==========

        @Then("the user should have access to the correct input boxes for moons")
        public void theUserShouldHaveAccessToInputBoxesForMoons() {
            // Validate visibility of moon input fields
        }

        @When("the user types in a {string} into the {string} box")
        public void theUserTypesInMoonOrPlanetValueIntoBox(String value, String boxName) {
            // Input moon name or planet ID depending on box label
        }

        @When("optionally, when the user presses {string} and attaches a JPEG or PNG")
        public void optionallyAttachJPEGorPNG(String buttonLabel) {
            // Optional image upload for moons (if file provided)
        }

        @When("the user clicks Submit Moon")
        public void theUserClicksSubmitMoon() {
            // Click submit for moon
        }

        @When("the user now clicks Submit Moon")
        public void theUserNowClicksSubmitMoon() {
            // Submit with incomplete or invalid data
        }

        @When("the user clicks on {string}")
        public void theUserClicksOn(String elementLabel) {
            // Click the element by label (for flexibility in naming)
        }

        @Then("the moon should be added, with a visible picture if a file was provided")
        public void theMoonShouldBeAddedWithVisiblePictureIfProvided() {
            // Check moon addition and optional picture
        }
}


