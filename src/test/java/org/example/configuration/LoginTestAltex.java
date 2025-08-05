package org.example.configuration;

import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTestAltex {
    WebDriver edgeDriver = new EdgeDriver();

    @Test
    @DisplayName("Testare log in site Altex")
    public void testLogin() {

        String urlToNav = "https://altex.ro/";
        edgeDriver.get(urlToNav);
        edgeDriver.manage().window().maximize();
        edgeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//        WebElement acceptCookie = edgeDriver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"));
//        acceptCookie.click();

//        WebElement contClick = edgeDriver.findElement(By.cssSelector("span[class='jsx-9d04a24ff8b4af87 truncate hidden sm:block leading-18.2 -track']"));

//        WebElement inchideCookie = edgeDriver.findElement(By.className("CybotCookiebotBannerCloseButton"));
//        inchideCookie.submit();

        WebElement contClick = edgeDriver.findElement(By.cssSelector("span[class='jsx-9d04a24ff8b4af87 truncate hidden sm:block leading-18.2 -tracking-0.29']"));
        contClick.click();

        WebElement introduAdresa = edgeDriver.findElement(By.cssSelector("input[name='email']"));
        introduAdresa.sendKeys("testlogin@gmail.com");

//       WebElement inregistrareClick = edgeDriver.findElement(By.cssSelector("a[class='underline hover:text-bleu-hover text-red-brand text-sm leading-15.6']"));
//       inregistrareClick.click();
    }

//    @Test
//    @DisplayName("Introducere date in campurile de LogIn")
//    public void inputDate() {
//WebElement contclick = edgeDriver.findElement(By.cssSelector());
//
//    }
}
