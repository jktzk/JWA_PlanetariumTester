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
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

public class moonDeletionSteps {

        private String moonToBeDeleted ="";

        @Given("the  user is on their account's  home page")
        public void theUserIsOnTheirAccountsHomePage() {
                loginPage.goToLoginPage();
                loginPage.enterUsername("Batman");
                loginPage.enterPassword("Iamthenight1939");
                loginPage.clickLoginButton();
                new WebDriverWait(driver, Duration.ofSeconds(5))
                        .until(ExpectedConditions.titleIs(homePage.getTitle()));
        }

        @When("the user selects moon from drop down")
        public void theUserSelectsMoonsFromTheDropDown() {
                homePage.selectMoonDropdown();
        }

        @When("the user selects  planet from drop down")
        public void theUserSelectsplanetFromTheDropDown() {
                homePage.selectPlanetDropdown();
        }

        @When("the  user types in {string} into the deletion box")
        public void the_user_types_in_into_the_deletion_box(String moonName) {
                this.moonToBeDeleted = moonName;
                homePage.enterItemToDelete(moonName);
        }

        @When("the  user clicks the Delete button")
        public void the_user_clicks_the_delete_button() {
                homePage.clickDelete();
        }


        @Then("the moon entry should be deleted")
        public void theMoonEntryShouldBeDeleted() {
                new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.id("celestialTable")));
                List<String> elements = homePage.generateTableElements();
                assertThat(elements, not(this.moonToBeDeleted));
        }

        @Then("the  user should receive an alert with the message  {string}")
        public void theUserShouldReceiveAnAlertWithTheMessage(String expectedMessage) {
                homePage.waitForAlert();
                Alert alert = driver.switchTo().alert();
                String actualMessage = alert.getText();
                alert.accept();
                Assert.assertEquals(expectedMessage, actualMessage);
        }

}


