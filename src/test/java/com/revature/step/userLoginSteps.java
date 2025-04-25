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

public class userLoginSteps {

    @Given("the user starts on the login page")
    public void the_user_starts_on_the_login_page() {
        loginPage.goToLoginPage();
    }
    @When("the user provides a username {string} for login")
    public void the_user_provides_username_for_login(String username) {
        loginPage.enterUsername(username);
    }
    @When("the user provides a password {string} for login")
    public void the_user_provides_password_for_login(String password) {
        loginPage.enterPassword(password);
    }
    @When("the user clicks the log button")
    public void the_user_clicks_the_log_button() {
        loginPage.clickLoginButton();
    }


    @Then("the user should arrive to their account's home page")
    public void the_user_should_arrive_to_their_account_s_home_page() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(
                ExpectedConditions.textToBePresentInElementLocated(
                        By.id("greeting"),
                        "Welcome to the Home Page Batman"
                )
        );
        Assert.assertEquals(homePage.getTitle(),driver.getTitle());
    }


    /*Sad Path*/
    @Then("the user should receive an alert saying {string}")
    public void the_user_should_receive_an_alert_saying(String expectedMessage) {
        loginPage.waitForAlert();
        Alert alert = driver.switchTo().alert();
        String actualMessage = alert.getText();
        alert.accept();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
    @Then("the user should remain on the login page")
    public void the_user_should_remain_on_the_login_page() {
        Assert.assertEquals(loginPage.getTitle(),driver.getTitle());
    }


}
