package org.example.configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AltexTestCases {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.get("https://altex.ro");

            // Așteaptă să apară butonul de acceptare cookies și dă click
            WebElement acceptCookiesButton = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[contains(text(), 'Acceptati tot')]")));
            acceptCookiesButton.click();

            System.out.println("Cookie-urile au fost acceptate.");

        } catch (Exception e) {
            System.out.println("Butonul de acceptare cookies nu a fost găsit sau nu a putut fi apăsat.");

        }

        WebElement casutaCautare = driver.findElement(By.id("SearchLoading"));
        // Introduce textul în căsuța de căutare
        casutaCautare.sendKeys("ceasuri");

     // Găsește butonul Caută (presupunem că are id="searchBtn", trebuie verificat)

        WebElement butonCauta = driver.findElement(By.id("searchBtn"));
        butonCauta.click();
    }
}

