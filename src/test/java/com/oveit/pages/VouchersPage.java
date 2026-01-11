package com.oveit.pages;

import com.oveit.utils.DataGeneration;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class VouchersPage {

    private final WebDriver driver;
    private final WebDriverWait wait;
    private final DataGeneration data = DataGeneration.getInstance();

    // ELEMENTS
    @FindBy(xpath = "//div[@class='page-title']//div[@class='ripple']")
    private WebElement CreateVoucherButton;
    @FindBy(css = ("input[name='name']"))
    WebElement voucherName;
    @FindBy(css = ("input[name='discount']"))
    WebElement discountInput;
    @FindBy(css = ("input[placeholder='Code']"))
    WebElement addDiscountCod;
    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement addCodeButton;
    @FindBy(xpath = "//button[@type='submit']//div[@class='ripple']")
    WebElement saveButton;
    @FindBy(xpath = "(//img[@alt='edit'])[2]")
    WebElement deleteVoucher;
    @FindBy(xpath = "//input[@name='name']")
    WebElement withoutDiscount;
    @FindBy(xpath = "(//input[@placeholder='Search attraction...'])[1]")
    WebElement atractieSelectata;
    @FindBy(css = ("input[name=\"code\"]"))
    WebElement ManualCodeInput;
    @FindBy(css = ("button[type=\"submit\"]"))
    WebElement AddCodeButton;

    public VouchersPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void CreateVoucherButtonClick() {
        CreateVoucherButton.click();
    }

    public void VoucherName(String name) {
        voucherName.sendKeys(name);
    }

    public void DiscountInput(String discount) {
        discountInput.sendKeys(discount);
    }

    public void addDiscountCode(String discountCode) {
        addDiscountCod.sendKeys(discountCode);
    }

    public void clickOnAddDiscountCodeButton() {
        addCodeButton.click();
    }

    public void clickOnSaveButton() {
        saveButton.click();
    }

    public void deleteVoucherButton() {
        deleteVoucher.click();
        try {
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//            alert.dismiss();
            alert.accept();
//            System.out.println("Voucherul nu a fost șters.");
            System.out.println("Voucherul a fost șters.");
        } catch (TimeoutException e) {
            System.out.println("Nu a apărut alertă.");
        }
    }

    public void withountDiscount(String discountName) {
        withoutDiscount.sendKeys(discountName);
    }

    public void applicableAttraction(String numeAtractie) {
        atractieSelectata.sendKeys(numeAtractie);
    }

    public void InputaCode(String code) {
        ManualCodeInput.sendKeys(code);
        AddCodeButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
