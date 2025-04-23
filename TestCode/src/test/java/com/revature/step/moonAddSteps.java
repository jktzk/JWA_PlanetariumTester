package com.revature.step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static com.revature.TestRunner.*;

public class moonAddSteps {

        private boolean imageAdded = false;
        private int numberAdded = 0;
        private String bodyAdded ="moon";
        private String nameAdded ="";
        private String id = "0";
        private int numberOfPlanetsINDB = 2;

        @Given("the user starts on their account's home page")
        public void theUserStartsOnTheirAccountsHomePage() {
                loginPage.goToLoginPage();
                loginPage.enterUsername("Batman");
                loginPage.enterPassword("Iamthenight1939");
                loginPage.clickLoginButton();
                new WebDriverWait(driver, Duration.ofSeconds(5))
                        .until(ExpectedConditions.titleIs(homePage.getTitle()));
        }

        @When("the user selects Moon from the drop down")
        public void theUserSelectsMoonFromTheDropDown() {
                homePage.selectMoonDropdown();
        }

        @Then("the user should have access to the correct input boxes for moons")
        public void AccessToTheCorrectInputBoxesForMoons() {
        }

        @When("the user types in a {string} into the Enter Moon Name box")
        public void theUserAddsMoonName(String moonName) {
                homePage.enterMoonNameAdd(moonName);
                this.nameAdded=moonName;

        }

        @When("the user types in a {string} into the Enter Orbited Planet ID box")
        public void theUserAddsOrbitedPlanetName(String planetID) {
                homePage.enterPlanetIDForMoon(planetID);
                this.id = planetID;

        }



        @When("optionally, when the user presses Choose File and attaches a moon{string}")
        public void optionallyaAttachFile(String fileName) {
                if (!(fileName.isEmpty())) {
                        this.imageAdded = true;
                        homePage.enterMoonImage(fileName);
                }
        }

        @When("the user clicks Submit Moon")
        public void UserClicksSubmitMoon() {
                homePage.clickSubmitMoon();
                this.numberAdded++;
        }


        @Then("the table should refresh")
        public void theTableShouldRefresh() {
            // Wait for the table to refresh (e.g., using ExpectedConditions)
        }

        @Then("the moon should be added, with a visible picture if a file was provided")
        public void theMoonShouldBeAddedWithPictureIfProvided() {
                new WebDriverWait(driver, Duration.ofSeconds(5))
                        .until(ExpectedConditions.visibilityOfElementLocated(By.id("celestialTable")));
                new WebDriverWait(driver, Duration.ofSeconds(5))
                        .until(ExpectedConditions.visibilityOfElementLocated(
                                By.xpath("//table[@id='celestialTable']//tr[td[text()='" + this.nameAdded + "']]")
                        ));
                List<String> elements = homePage.generateTableElements();
                String visibleImage = "Not Visible";
                //adjusted from hardcoded entries
                if (this.imageAdded){
                        visibleImage = "Visible";
                }
                Assert.assertEquals(this.bodyAdded,elements.get((this.numberAdded*numberOfPlanetsINDB*5)));
                Assert.assertEquals(this.id,elements.get((this.numberAdded*numberOfPlanetsINDB*5)+1));
                Assert.assertEquals(this.nameAdded,elements.get((this.numberAdded*numberOfPlanetsINDB*5)+2));
                //Assert.assertEquals(this.nameAdded,elements.get((this.numberAdded*numberOfPlanetsINDB*5)+3));
                Assert.assertEquals(visibleImage,elements.get((this.numberAdded*numberOfPlanetsINDB*5)+4));

        }



        @Then("the user should receive an alert with the message {string}")
        public void theUserShouldReceiveAnAlertWithTheMessage(String expectedMessage) {
                homePage.waitForAlert();
                Alert alert = driver.switchTo().alert();
                String actualMessage = alert.getText();
                alert.accept();
                Assert.assertEquals(expectedMessage, actualMessage);
        }
}



