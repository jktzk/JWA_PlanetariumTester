package com.revature.step;

import static com.revature.TestRunner.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class planetAddSteps {
    @Given("the user begins on their account's home page")
    public void theUserIBeginsAccountsHomePage() {
        // code to navigate to the user's home page
    }

    @When("the user selects Planet from the drop down")
    public void theUserSelectsPlanetFromTheDropDown() {
        // code to select Planet from dropdown
    }

    @Then("the user should have access to the correct input boxes for planets")
    public void theUserShouldHaveAccessToTheCorrectInputBoxesForPlanets() {
        // code to verify visibility and correctness of input boxes
    }

    @When("the user types in a planet {string} into the {string} box")
    public void theUserTypesPlanetNameIntoTheBox(String planetName, String boxName) {
        // code to input the planet name into the specified box
    }

    @When("optionally, when the user presses {string} and attaches a planet JPEG or PNG")
    public void optionallyWhenTheUserAttachesPlanetFile(String buttonName) {
        // code to simulate optional file upload (JPEG/PNG)
    }

    @When("the user clicks Submit Planet")
    public void theUserClicksSubmitPlanet() {
        // code to click the Submit Planet button
    }

    @Then("the table should planet refresh")
    public void thePlanetTableShouldRefresh() {
        // code to verify the table refreshed
    }

    @Then("the planet should be added, with a visible picture if a file was provided")
    public void thePlanetShouldBeAddedWithVisiblePictureIfFileProvided() {
        // code to verify the planet entry and the image (if uploaded)
    }
}
