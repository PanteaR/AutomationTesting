package com.oveit.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Properties;

// page_url: https://practicesoftwaretesting.com/auth/login
public class LoginPage {

    WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    @FindBy(css = "input#email")
    private WebElement emailField;

    @FindBy(css = "input#password")
    private WebElement passwordField;

    @FindBy(css = "div[class=\"ripple\"]")
    private WebElement loginButton;

    //Web elements that can be either css or xpath
    @FindBy(css = "form[data-test=\"login-form\"]")
    private WebElement authContainer;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login(String email, String password) {
        wait.until(ExpectedConditions.visibilityOf(emailField));
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();
    }

    public void loginPropertiesAccount() {
        wait.until(ExpectedConditions.visibilityOf(emailField));
        Properties prop = new Properties();
        try {
            Path path = Paths.get(System.getProperty("user.dir"), "src", "test", "resources", "credentials.properties");
            prop.load(Files.newInputStream(path));

            emailField.sendKeys(prop.getProperty("email"));
            passwordField.sendKeys(prop.getProperty("pass"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        loginButton.click();
    }
    public void sleepForDebug()
    {
        try {
            Thread.sleep(5000); // 5 secunde
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //Methods used for testing. Something quick and dirty for demonstration purposes
    public WebElement getAuthContainer() {
        return authContainer;
    }
}
