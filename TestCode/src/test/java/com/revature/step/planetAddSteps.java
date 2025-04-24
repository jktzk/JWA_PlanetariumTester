package com.revature.step;

import static com.revature.TestRunner.*;

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

public class planetAddSteps {

    private boolean imageAdded = false;
    private int numberAdded = 0;
    private String bodyAdded ="planet";
    private String nameAdded ="";

    @Given("the user is on their account's home page")
    public void theUserIBeginsAccountsHomePage() {
        loginPage.goToLoginPage();
        loginPage.enterUsername("Batman");
        loginPage.enterPassword("Iamthenight1939");
        loginPage.clickLoginButton();
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.titleIs(homePage.getTitle()));
    }

    @When("the user selects Planet from the drop down")
    public void theUserSelectsPlanetFromTheDropDown() {
        homePage.selectPlanetDropdown();
    }


    @When("the user types in a {string} into the Enter Planet Name box")
    public void theUserTypesPlanetNameIntoTheBox(String planetName) {
        homePage.enterPlanetNameAdd(planetName);
        this.nameAdded=planetName;

    }

    @When("optionally, when the user presses Choose File and attaches a {string}")
    public void optionallyWhenTheUserAttachesPlanetFile(String fileName) {
        if (!(fileName.isEmpty())) {
            this.imageAdded = true;
            homePage.enterPlanetImage(fileName);
        }
    }
    @When("the user clicks Submit Planet")
    public void theUserClicksSubmitPlanet() {
        homePage.clickSubmitPlanet();
        this.numberAdded++;
    }


    @Then("the planet should be added, with a visible picture if a file was provided")
    public void thePlanetShouldBeAddedWithVisiblePictureIfFileProvided() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.id("celestialTable")));
        //very hacky
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='celestialTable']//tr[td[text()='" + this.nameAdded + "']]")));
        List<String> elements = homePage.generateTableElements();
        String visibleImage = "Not Visible";
        //adjusted from hardcoded entries
        if (this.imageAdded){
            visibleImage = "Visible";
        }
        Assert.assertEquals(this.bodyAdded,elements.get((this.numberAdded*5)));
        //Assert.assertEquals(this.bodyAdded,elements.get((this.numberAdded*5)+15));
        Assert.assertEquals(this.nameAdded,elements.get((this.numberAdded*5)+2));
        //Assert.assertEquals(this.nameAdded,elements.get((this.numberAdded*5)+17);
        Assert.assertEquals(visibleImage,elements.get((this.numberAdded*5)+4));

    }

    @Then("the user should receive an alert with {string}")
    public void the_user_should_receive_an_alert_with_the_message_invalid_planet_name(String expectedMessage) {
        homePage.waitForAlert();
        Alert alert = driver.switchTo().alert();
        String actualMessage = alert.getText();
        alert.accept();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
