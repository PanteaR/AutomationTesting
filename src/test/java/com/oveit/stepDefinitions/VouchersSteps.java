package com.oveit.stepDefinitions;

import com.oveit.pages.HomePage;
import com.oveit.pages.LoginPage;
import com.oveit.pages.VouchersPage;
import com.oveit.utils.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class VouchersSteps {
    private final WebDriver driver = Hooks.driver;
    private final LoginPage loginPage = new LoginPage(driver);
    private final HomePage homePage = new HomePage(driver);
    private final VouchersPage vouchersPage = new VouchersPage(driver);

    @Given("User navigates to login page")
    public void NavigateToOveitToLoginPage() {
        driver.get("https://web02.stg.oveit.com/seller/login");
    }

    @When("User logs in with valid credentials")
    public void LogInIntoOveitAccount() {
        loginPage.loginPropertiesAccount();
    }

    @Then("I click on attractions sidebar")
    public void iClickOnAttractionsSidebar() {
        homePage.attractionsClick();
    }

    @Then("I click on Vouchers")
    public void iClickOnVouchers() {
        homePage.vouchersClick();
    }

    @And("I click on Create voucher button")
    public void iClickOnCreateVoucherButton() {
        vouchersPage.CreateVoucherButtonClick();
    }

    @Then("I insert the Name of the voucher {string}")
    public void iInsertTheNameOfTheVoucher(String name) {
        vouchersPage.VoucherName(name);
    }

    @And("I input voucher's discount of {string}")
    public void iInputVoucherSDiscountOf(String discount) {
        vouchersPage.DiscountInput(discount);
    }

    @Then("I input the discount code of {string}")
    public void iInputTheDiscountCodeOf(String discountCode) {
        vouchersPage.addDiscountCode(discountCode);
    }

    @And("Click on Add button Dicount")
    public void clickOnAddButtonDicount() {
        vouchersPage.clickOnAddDiscountCodeButton();
    }

    @And("I click on Save button")
    public void iClickOnSaveButton() {
        vouchersPage.clickOnSaveButton();
    }

    @And("Delete a voucher from the list")
    public void deleteAVoucherFromTheList() {
       vouchersPage.deleteVoucherButton();
    }

    @Then("I input voucher's name of {string}")
    public void iInputVoucherSNameOf(String withoutDiscount) {
        vouchersPage.withountDiscount(withoutDiscount);
    }

    @And("I want this voucher to be applicable for the selected attraction {string}")
    public void iWantThisVoucherToBeApplicableForTheSelectedAttraction(String numeAtractie) {
        vouchersPage.applicableAttraction(numeAtractie);
    }

    @Then("I input a {string} manually")
    public void iInputAManually(String code) {
        vouchersPage.InputaCode(code);
    }

//    @Then("I check if mandatory fields error appears")
//    public void iCheckIfMandatoryFieldsErrorAppears() {
//        vouchersPage.MandatoryFieldsErrorCheck();
//    }
}


