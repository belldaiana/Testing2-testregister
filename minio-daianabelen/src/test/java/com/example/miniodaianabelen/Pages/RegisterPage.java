package com.example.miniodaianabelen.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage {

    WebDriver driver;
    WebDriverWait wait;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstName(String name) {

        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-firstname")));
        WebElement nameInput = driver.findElement(By.id("input-firstname"));
        nameInput.clear();
        nameInput.sendKeys(name);
    }

    public void enterLastname(String lastName) {

        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-lastname")));
        WebElement lastNameInput = driver.findElement(By.id("input-lastname"));
        lastNameInput.clear();
        lastNameInput.sendKeys(lastName);
    }

    public void enterEmail(String email) {

        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-email")));
        WebElement emailInput = driver.findElement(By.id("input-email"));
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    public void enterPhone(String phone) {

        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-telephone")));
        WebElement emailInput = driver.findElement(By.id("input-telephone"));
        emailInput.clear();
        emailInput.sendKeys(phone);
    }

    public void enterPassword(String password) {

        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-password")));
        WebElement passwordInput = driver.findElement(By.id("input-password"));
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public void confirmPassword(String password) {

        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-confirm")));
        WebElement pass2Input = driver.findElement(By.id("input-confirm"));
        pass2Input.clear();
        pass2Input.sendKeys(password);
    }

    public void newsletter(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("agree")));
        WebElement news = driver.findElement(By.name("agree"));
        news.click();
    }

    public void btnContinue() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")));
        WebElement btncontinue = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
        btncontinue.click();
    }

    public String checkMessage() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"content\"]/p[1]")));
        WebElement message = driver.findElement(By.xpath("//*[@id=\"content\"]/p[1]"));
        String message2 = message.getText();
        return message2;
    }

}
