package com.revature.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends ParentPOM{


    @FindBy(id = "locationSelect")
    private WebElement dropDown;

    @FindBy(id = "deleteInput")
    private WebElement deleteInput;

    @FindBy(id = "deleteButton")
    private WebElement deleteButton;

    @FindBy(id = "planetNameInput")
    private WebElement planetNameInput;

    @FindBy(id = "planetImageInput")
    private WebElement planetImageInput;

    @FindBy(id = "moonNameInput")
    private WebElement moonNameInput;

    @FindBy(id = "orbitedPlanetInput")
    private WebElement orbitedPlanetInput;

    @FindBy(id = "moonImageInput")
    private WebElement moonImageInput;

    @FindBy(xpath = "//*[@id=\"inputContainer\"]/button")
    private WebElement submitMoonButton;


    public HomePage(WebDriver driver, String title) {
        super(driver,title);
    }

    public void enterPlanetNameAdd(String planetName){
        planetNameInput.sendKeys(planetName);
    }

    public String getTitle(){
        return title;
    }
    /*
    public void planetImageInput(?? file){
        planetNameInput.sendKeys(file);
    }
    */





    /*
    public void moonImageInput(?? file){
        moonNameInput.sendKeys(file);
    }
    */


}
