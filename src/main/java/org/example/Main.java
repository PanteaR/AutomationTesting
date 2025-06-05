package org.example;

import configuration.EdgeDriverConfiguration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeOptions;

public class Main {
    public static void main(String[] args) {
        EdgeDriverConfiguration edgeDriverConfiguration = new EdgeDriverConfiguration();
        WebDriver webDriver = edgeDriverConfiguration.getWebDriver();
        webDriver.navigate().to("https://www.emag.ro/");

        WebElement casutaCautare = webDriver.findElement(By.id("searchboxTrigger"));
        casutaCautare.sendKeys("Vitamine");
        WebElement butonCautare = webDriver.findElement(By.cssSelector("button[class='btn btn-default searchbox-submit-button']"));
        butonCautare.click();
        //cssSelect - button- tip element ("buton") ce are o clasa (button class) ce are o denumire "class" luat din fisierul HTML al paginii si parantezele patrate pentru specificatia cautarii.

        //Tema: - click pe un rezultat al cautarii de Vitamine.
        WebElement element = webDriver.findElement(By.linkText("Supliment alimentar Vitamin D3 + K2 Forte, Zenyth, 30 capsule"));
        element.click();
        ////click pe butonul de joc "refuza toate"
        //        WebElement refuzaToateButon = driver.findElement(By.cssSelector("button[class='btn btn-primary btn-block js-refuse gtm_bxxzbgwexm']"));
        //        refuzaToateButon.click();
    }
}
