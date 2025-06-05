package org.example;
import configuration.EdgeDriverConfiguration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TestCase {
    // sa se creeze si sa se parcurga un testcase.
    public static void main(String[] args) {
        EdgeDriverConfiguration edgeDriverConfiguration = new EdgeDriverConfiguration();

        WebDriver webdriver = edgeDriverConfiguration.getWebDriver();
        webdriver.manage().window().maximize();
        webdriver.navigate().to("https://comenzi.farmaciatei.ro/");
        WebElement acceptaSelectia = webdriver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowallSelection"));
        acceptaSelectia.click();
        WebElement listaProduse = webdriver.findElement(By.linkText("Articole"));
        listaProduse.click();
        WebElement searchBox = webdriver.findElement(By.id("desktop-search"));
        searchBox.sendKeys("Dimeticona");
        WebElement lupaCautare = webdriver.findElement(By.id("submit-button"));
        lupaCautare.click();

//        List<WebElement> element1 = webdriver.findElements(By.id("server-products-grid"));
//        element1.get(0).click();

        List<WebElement> rezultat = webdriver.findElements(By.id("server-products-grid"));
//        rezultat.get(0).click();
        for (WebElement element : rezultat) {
            System.out.println(element.getText());
//            if (element.getText().trim().equalsIgnoreCase("            Crema reparatoare de noapte pentru conturul ochilor, 20 ml,...        "));
//            element.click();
//            break;
//        }

//        for (int i = 0; i < rezultat.size(); i++) {
//            System.out.println(element.findElement(By.className("item-title")));
//            if (element.findElements(By.className("item-title")).get(1).getText().trim().equals("Crema de zi hidratanta pentru fata Gravity, 50 ml, Remescar")) {
//                element.click();
//                break;
//            }
            System.out.println("nu avem acest produs");
//            }
        }
    }
}
// la alegere un alt site: testare automata
