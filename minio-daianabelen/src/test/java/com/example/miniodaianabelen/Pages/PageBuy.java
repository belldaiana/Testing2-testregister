package com.example.miniodaianabelen.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBuy {

    WebDriver driver;
    WebDriverWait wait;

    By BoxSearch = By.xpath("//*[@id=\"search\"]/input");

    By Search = By.xpath("//*[@id=\"search\"]/span/button");

    By Cartbtn = By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]/span");
    public void clickSearch(String product){

        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        driver.findElement(BoxSearch).click();
        driver.findElement(BoxSearch).sendKeys(product);
    }

    public void clickSearchbtn(){

        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        driver.findElement(Search).click();
    }

    public void clickCart(){

        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        driver.findElement(Cartbtn).click();
    }


}
