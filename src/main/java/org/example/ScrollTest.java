package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollTest {
    public static void main(String[] args) throws InterruptedException {
        // Inițializează ChromeDriver automat
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Deschide pagina dorită
        driver.get("https://www.emag.ro/");

        // Așteaptă puțin pentru încărcarea completă a paginii
        Thread.sleep(2000);

        // Metoda 1: Scroll folosind JavaScript
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, document.body.scrollHeight);");

        // Alternativ: Scroll cu tastele (poți comenta una dintre metode)
        // driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);

        // Așteaptă puțin ca să vezi efectul scroll-ului
        Thread.sleep(3000);

        // Închide browserul
        driver.quit();
    }
}