package com.revature.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
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
        return "Home";
    }

    public void selectPlanetDropdown(){
        Select select = new Select(dropDown);
        select.selectByValue("Planet");
    }

    public void selectMoonDropdown(){
        Select select = new Select(dropDown);
        select.selectByValue("Moon");
    }

    public void enterPlanetName(String planetName){
        planetNameInput.sendKeys(planetName);
    }

    public void enterMoonName(String moonName){
        moonNameInput.sendKeys(moonName);
    }

    public void enterItemToDelete(String bodyName){
        deleteInput.sendKeys(bodyName);
    }

    public void clickDelete(){
        deleteButton.click();
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
