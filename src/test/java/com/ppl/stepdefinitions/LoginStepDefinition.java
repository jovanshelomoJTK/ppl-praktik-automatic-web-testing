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

    @Given("Pengguna sudah berada pada halaman login")
    public void Pengguna_sudah_berada_pada_halaman_login() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("Pengguna memasukan username {string}")
    public void Pengguna_memasukan_username(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);
    }

    @And("Pengguna memasukan password {string}")
    public void Pengguna_memasukan_password(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @And("Pengguna menekan tombol login")
    public void Pengguna_menekan_tombol_login() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("Aplikasi menampilkan halaman dashboard")
    public void Aplikasi_menampilkan_halaman_dashboard() {
        String url = driver.getCurrentUrl();
        assertTrue(url.contains("inventory.html"));
    }

    @Then("Aplikasi menampilkan pesan error {string}")
    public void Aplikasi_menampilkan_pesan_error(String errorMessage) {
        String actualErrorMessage = driver.findElement(By.cssSelector("[data-test='error']")).getText();
        assertTrue(actualErrorMessage.equals(errorMessage));
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}
