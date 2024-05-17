package com.ppl.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ppl.Hooks;

public class LogoutStepDefinition {
    private WebDriver driver = Hooks.driver;

    @Given("Pengguna sudah login dengan berhasil")
    public void Pengguna_sudah_login_dengan_berhasil() {
        WebDriver driver = Hooks.driver;
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

    @When("Pengguna menekan tombol menu bar")
    public void Pengguna_menekan_tombol_menu_bar() {
        driver.findElement(By.id("react-burger-menu-btn")).click();
        // wait for the menu to be displayed
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
    }

    @And("Pengguna menekan tombol logout")
    public void Pengguna_menekan_tombol_logout() {
        driver.findElement(By.id("logout_sidebar_link")).click();
    }

    @Then("Aplikasi menampilkan halaman login")
    public void Aplikasi_menampilkan_halaman_login() {
        assertTrue(driver.findElement(By.cssSelector("[data-test='login-container']")).isDisplayed());
    }

}
