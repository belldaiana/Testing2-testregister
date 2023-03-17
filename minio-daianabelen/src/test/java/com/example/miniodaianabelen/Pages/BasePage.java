package com.example.miniodaianabelen.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;

    By MyAccount = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]");

    By Registerbtn = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a");
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAccount() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        driver.findElement(MyAccount).click();

    }

    public void clickRegister(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        driver.findElement(Registerbtn).click();

    }
}
