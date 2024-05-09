package com.ppl.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefinition {
    private WebDriver driver;

    @Before
    public void initializeDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Given("I am on the Swag Labs login page")
    public void I_am_on_the_Swag_Labs_login_page() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("I enter the username {string}")
    public void I_enter_the_username_as_standard_user(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);
    }

    @And("I enter the password {string}")
    public void I_enter_the_password_as_secret_sauce(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @And("I click on the login button")
    public void I_click_on_the_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("I should be taken to the products page")
    public void I_should_be_taken_to_the_products_page() {
        String url = driver.getCurrentUrl();
        assertTrue(url.contains("inventory.html"));
    }

    @Then("I should see an error message {string}")
    public void I_should_see_an_error_message(String errorMessage) {
        String actualErrorMessage = driver.findElement(By.cssSelector("[data-test='error']")).getText();
        assertTrue(actualErrorMessage.equals(errorMessage));
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}
