package com.revature.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends ParentPOM{



    private String url = String.format("http://%s/",System.getenv("PLANETARIUM_URL"));
    private WebDriverWait alertWait;


    @FindBy(id = "usernameInput")
    private WebElement usernameInput;
    @FindBy(id = "passwordInput")
    private WebElement passwordInput;
    @FindBy(xpath = "//input[3]")
    private WebElement loginButton;
    @FindBy(tagName = "a")
    private WebElement registrationLink;


    public LoginPage(WebDriver driver, String title) {
        super(driver,title);
        this.title = "Planetarium Login";
        alertWait = new WebDriverWait(driver, Duration.ofSeconds(2));
    }

    public void enterUsername(String username){
        usernameInput.sendKeys(username);
    }

    public void enterPassword(String password){
        passwordInput.sendKeys(password);
    }

    public void goToLoginPage(){
        driver.get(url);
    }

    public void clickRegistrationLink(){
        registrationLink.click();
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public String getTitle(){
        return title;
    }

    public void waitForAlert() {
        alertWait.until(ExpectedConditions.alertIsPresent());
    }

    public void goHome(){
        usernameInput.sendKeys("Batman");
        passwordInput.sendKeys("Iamthenight1939");
        loginButton.click();
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.urlContains("/planetarium")); // Or wait for a homepage-specific element
    }

}
