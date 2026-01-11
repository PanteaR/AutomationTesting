package com.oveit.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver;
    @FindBy(xpath = "//p[contains(@class,'p1-semibold') and normalize-space()='Attractions']")
    private WebElement attractions;
    @FindBy(xpath = "//a[normalize-space()='Vouchers']")
    private WebElement vouchers;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void attractionsClick() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(attractions));
        attractions.click();
    }

    public void vouchersClick() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(vouchers));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", vouchers);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", vouchers);
            System.out.println("Click pe Vouchers realizat cu succes!");

        } catch (Exception e) {
            System.err.println("Nu s-a putut da click pe Vouchers: " + e.getMessage());
            e.printStackTrace();
        }
    }
}


