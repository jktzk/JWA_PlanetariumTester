package com.revature.step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static com.revature.TestRunner.*;
public class accountSecureSteps {

    private String user = "";
    private String ID ="";

    @Given("the user begins on the login page")
    public void userIsOnAccountHomePage() {
        loginPage.goToLoginPage();
    }


    @When("the registered user {string} signs in with their {string}")
    public void registeredUserSignsIn(String user, String pw){
        this.user = user;
        loginPage.goToLoginPage();
        loginPage.enterUsername(user);
        loginPage.enterPassword(pw);
        loginPage.clickLoginButton();
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.titleIs(homePage.getTitle()));

    }


    @Then("User planets and moons should be visible for user {string} and a greeting should be present for the user")
    public void verifyHomePageElements(String ID) {
        this.ID = ID;
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.id("celestialTable")));
        Assert.assertEquals("Welcome to the Home Page "+this.user,homePage.greetings());
        List<String> elements = homePage.generateTableElements();
        for(int i =0;i<elements.size()/5;i++){
            Assert.assertEquals(elements.get(1+i*5),this.ID);
        }
    }

    @When("the user directly inputs the url for the planetarium homepage without logging in {string}")
    public void userDirectsToHomepageWithoutLogin(String homepageUrl) {
        homePage.attemptDirectLogin();
    }

    @Then("the user should stay on the login page")
    public void userShouldRemainOnLoginPage() {
        Assert.assertEquals(loginPage.getTitle(),driver.getTitle());
    }
}
