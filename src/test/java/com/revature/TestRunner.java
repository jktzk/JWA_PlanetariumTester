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



@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "com.revature.step",
        plugin = {"pretty","html:src/test/resources/reports/Cucumber-Report.html"}
)


public class TestRunner {


    public static WebDriver driver;
    public static LoginPage loginPage;
    public static RegistrationPage registrationPage;
    public static HomePage homePage;




    @BeforeClass
    public static void setup(){
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
