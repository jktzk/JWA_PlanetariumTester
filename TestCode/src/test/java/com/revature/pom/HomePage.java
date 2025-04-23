package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class HomePage extends ParentPOM{


    @FindBy(id = "locationSelect")
    private WebElement dropDown;


    //delete info
    @FindBy(id = "deleteInput")
    private WebElement deleteInput;

    @FindBy(id = "deleteButton")
    private WebElement deleteButton;

    //planets
    @FindBy(id = "planetNameInput")
    private WebElement planetNameInput;

    @FindBy(id = "planetImageInput")
    private WebElement planetImageInput;

    @FindBy(xpath = "/html/body/div[1]/div[2]/button")
    private WebElement submitPlanetButton;

    //moons
    @FindBy(id = "moonNameInput")
    private WebElement moonNameInput;

    @FindBy(id = "orbitedPlanetInput")
    private WebElement orbitedPlanetInput;

    @FindBy(id = "moonImageInput")
    private WebElement moonImageInput;

    @FindBy(xpath = "//*[@id=\"inputContainer\"]/button")
    private WebElement submitMoonButton;


    //table
    @FindBy(id = "celestialTable")
    private WebElement tableOfBodies;

    //table header
    @FindBy(xpath = "/html/body/div[2]/table/tbody/tr[1]/th[1]")
    private WebElement tableHeaderType;

    @FindBy(xpath = "/html/body/div[2]/table/tbody/tr[1]/th[2]")
    private WebElement tableHeaderID;

    @FindBy(xpath = "/html/body/div[2]/table/tbody/tr[1]/th[3]")
    private WebElement tableHeaderName;

    @FindBy(xpath = "/html/body/div[2]/table/tbody/tr[1]/th[4]")
    private WebElement tableHeaderOwner;



    private WebDriverWait alertWait;

    public HomePage(WebDriver driver, String title) {
        super(driver,title);alertWait = new WebDriverWait(driver, Duration.ofSeconds(2));
    }

    public void enterPlanetNameAdd(String planetName){
        planetNameInput.sendKeys(planetName);
    }

    public String getTitle(){
        return "Home";
    }

    public void selectPlanetDropdown(){
        Select select = new Select(dropDown);
        select.selectByValue("planet");
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

    public void clickSubmitPlanet(){submitPlanetButton.click();}

    public List<String> generateTableElements(){
        List<String> cellContents = new ArrayList<>();
        List<WebElement> rows = tableOfBodies.findElements(By.tagName("tr"));
        // Start from 1 to skip the header row
        for (int i = 1; i < rows.size(); i++) {
            WebElement row = rows.get(i);
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (int j = 0; j < cells.size(); j++) {
                WebElement cell = cells.get(j);
                if (j == 4) { // 5th column (0-indexed)
                    String src = cell.getAttribute("src");
                    if (src == null || src.isEmpty() || src.equals("data:image/jpeg;base64,null")){
                        cellContents.add("Not Visible");
                    } else {
                        cellContents.add("Visible");
                    }
                } else {
                    cellContents.add(cell.getText().trim());
                }
                System.out.println(cellContents);
            }
        }
        return cellContents;}


    public void waitForAlert() {
        alertWait.until(ExpectedConditions.alertIsPresent());
    }



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


