package com.revature;

import com.revature.pom.HomePage;
import com.revature.pom.LoginPage;
import com.revature.pom.RegistrationPage;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


//Going to let Junit be the test runner for our Cucumber/Selenium testing,
//but it needs to run Cucumber tests, that is with RunWith annotation is for
//tells Junit to allow Cucumber to run the tests


/*Tell cucumber:
    -where are the feature files
    -where is the information
    -what plugins you want to use
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "com.revature.step",
        plugin = {"pretty","html:src/test/resources/reports/Cucumber-Report.html"}
)


public class TestRunner {

    //here is where we will create our test resources:make them static



    public static WebDriver driver;
    public static LoginPage loginPage;
    public static RegistrationPage registrationPage;
    public static HomePage homePage;




    //make sure using Junit
    @BeforeClass
    public static void setup(){
        //here we intialize the resources and perform any other setup configurations
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        loginPage = new LoginPage(driver, "Planetarium Login");
        registrationPage = new RegistrationPage(driver, "Account Creation");
        homePage = new HomePage(driver, "Home");
    }

    @AfterClass
    public static void tearDown(){
        if(driver != null) driver.quit();

    }

}
