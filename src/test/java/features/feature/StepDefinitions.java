package features.feature;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class StepDefinitions {
    private static final int WAIT_TIME = 10;

    private static AdminPage homePage;

    private static WebDriver driver;

    static {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(WAIT_TIME, TimeUnit.SECONDS);
    }

    //Common method
    @Given("The Admin Page is Open after demo authentication")
    public void theAdminPageIsOpenAfterDemoAuthentication() {
        homePage = new AdminPage(driver);
    }

//    @And("Accounts DropDown Menu is Clicked")
//    public void accountsDropDownMenuIsClicked() {
//        homePage.getElement(By.xpath("/html/body/div[3]/nav/div[2]/ul/li[5]/a")).click();
//    }
//
//    @And("Admins panel is Clicked")
//    public void adminsPanelIsClicked() {
//        homePage.getElement(By.xpath("/html/body/div[3]/nav/div[2]/ul/li[5]/ul/li[1]/a")).click();
//    }
//
//    @And("Add Admin Button is Clicked")
//    public void addAdminButtonIsClicked() {
//        homePage.getElement(By.xpath("/html/body/div[3]/div/div[2]/form/button")).click();
//    }
//
//
//    @Given("Admin {string} is filled with {string} and {string} is filled with {string}")
//    public void adminFirstnameIsFilledWithParameterAndLastNameIsFilledWithParameter(String firstNameField, String parameter1, String lastNameField, String parameter2) {
//        homePage.getElement(By.name(firstNameField)).sendKeys(parameter1);
//        homePage.getElement(By.name(lastNameField)).sendKeys(parameter2);
//    }
//
//    @When("The Admin Submit Button is Clicked")
//    public void theSubmitButtonIsClicked() {
//        homePage.getElement(By.xpath("/html/body/div[3]/div/form/div[1]/div/div[3]/button")).click();
//    }
//
//    @Then("The Admin {string} is Shown")
//    public void adminErrorMessageIsShown(String errorMessage) {
//        if(homePage.isDisplayed(By.xpath("/html/body/div[3]/div/div[2]")))
//        {
//            Assert.assertEquals(errorMessage, homePage.getElement(By.xpath("/html/body/div[3]/div/div[2]")).getText());
//        }
//        else{
//            fail();
//        }
//    }
//
//    @And("CMS DropDown Menu is Clicked")
//    public void cmsDropDownMenuIsClicked() {
//        homePage.getElement(By.xpath("/html/body/div[3]/nav/div[2]/ul/li[6]/a")).click();
//    }
//
//    @And("Pages panel is Clicked")
//    public void pagesPanelIsClicked() {
//        homePage.getElement(By.xpath("/html/body/div[3]/nav/div[2]/ul/li[6]/ul/li[1]/a")).click();
//    }
//
//    @And("Add CMS Button is Clicked")
//    public void addCMSButtonIsClicked() {
//        homePage.getElement(By.xpath("/html/body/div[3]/div/div[2]/form/button")).click();
//    }
//
//    @Given("CMS {string} is filled with {string}")
//    public void pageTitleFieldIsFilledWithValue(String pageTitleField, String value) {
//        homePage.getElement(By.name(pageTitleField)).sendKeys(value);
//    }
//
//    @When("The CMS Submit Button is Clicked")
//    public void theCMSSubmitButtonIsClicked() {
//        homePage.getElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[1]/div/div[2]/button")).click();
//    }
//
//    @Then("CMS {string} is Shown")
//    public void cmsErrorExistIsShown(String errorExist) {
//        System.out.println(homePage.isDisplayed(By.xpath("/html/body/div[3]/div/div[2]/form/div[1]/div[1]/p")));
//        Assert.assertEquals(Boolean.valueOf(errorExist), homePage.isDisplayed(By.xpath("/html/body/div[3]/div/div[2]/form/div[1]/div[1]/p")));
//    }
//
//    // Common Method

//
//    @When("{string} of Accounts is Clicked")
//    public void accountTypeIsClicked(String accountTypePath) {
//        homePage.getElement(By.xpath(accountTypePath)).click();
//    }
//
//    @Then("{string} is Shown")
//    public void pageTitleIsShown(String pageTitle) {
//        driver.get(driver.getCurrentUrl());
//        Assert.assertEquals(pageTitle, driver.getTitle());
//    }
//
//    @Given("Hotels DropDown Menu is Clicked")
//    public void hotelsDropDownMenuIsClicked() {
//        homePage.getElement(By.xpath("/html/body/div[3]/nav/div[2]/ul/li[7]/a")).click();
//    }
//
//    @When("{string} of Hotels is Clicked")
//    public void accountTypePathOfHotelsIsClicked(String accountTypePath) {
//        homePage.getElement(By.xpath(accountTypePath)).click();
//    }
//
//    @Given("Boats DropDown Menu is Clicked")
//    public void boatsDropDownMenuIsClicked() {
//        homePage.getElement(By.xpath("/html/body/div[3]/nav/div[2]/ul/li[9]/a")).click();
//    }
//
//    @When("{string} of Boats is Clicked")
//    public void accountTypePathOfBoatsIsClicked(String accountTypePath) {
//        homePage.getElement(By.xpath(accountTypePath)).click();
//    }
//
//    @And("Supplier panel is Clicked")
//    public void supplierPanelIsClicked() {
//        homePage.getElement(By.xpath("/html/body/div[3]/nav/div[2]/ul/li[5]/ul/li[2]/a")).click();
//    }
//
//    @And("Add Supplier Button is Clicked")
//    public void addSupplierButtonIsClicked() {
//        homePage.getElement(By.xpath("/html/body/div[3]/div/div[2]/form/button")).click();
//    }
//
//    @Given("Supplier {string} is filled with {string} and {string} is filled with {string}")
//    public void supplierFirstNameFieldIsFilledWithParameterAndLastNameFieldIsFilledWithParameter(String firstNameField, String parameter1, String lastNameField, String parameter2) {
//        homePage.getElement(By.name(firstNameField)).sendKeys(parameter1);
//        homePage.getElement(By.name(lastNameField)).sendKeys(parameter2);
//    }
//
//    @When("The Supplier Submit Button is Clicked")
//    public void theSupplierSubmitButtonIsClicked() {
//        homePage.getElement(By.xpath("/html/body/div[3]/div/form/div[1]/div/div[3]/button")).click();
//    }
//
//    @Then("The Supplier {string} is Shown")
//    public void theSupplierErrorMessageIsShown(String errorMessage) {
//        if(homePage.isDisplayed(By.xpath("/html/body/div[3]/div/div[2]")))
//        {
//            Assert.assertEquals(errorMessage, homePage.getElement(By.xpath("/html/body/div[3]/div/div[2]")).getText());
//        }
//        else{
//            fail();
//        }
//    }
//
//    @Given("Rentals DropDown Menu is Clicked")
//    public void rentalsDropDownMenuIsClicked() {
//        homePage.getElement(By.xpath("/html/body/div[3]/nav/div[2]/ul/li[10]/a")).click();
//    }
//
//    @When("{string} of Rentals is Clicked")
//    public void accountTypePathOfRentalsIsClicked(String accountTypePath) {
//        homePage.getElement(By.xpath(accountTypePath)).click();
//    }

    @And("Logout Button is Clicked")
    public void logoutButtonIsClicked() {
        By logoutButton = By.xpath("/html/body/div[3]/div/nav/div/div[2]/ul[2]/li[2]/a/strong");
        homePage.getElement(logoutButton).click();
    }

    @And("Accounts DropDown Menu is Clicked")
    public void accountsDropDownMenuIsClicked() {
        homePage.getElement(By.xpath("/html/body/div[3]/nav/div[2]/ul/li[5]/a")).click();
    }

    @And("Admins panel is Clicked")
    public void adminsPanelIsClicked() {
        homePage.getElement(By.xpath("/html/body/div[3]/nav/div[2]/ul/li[5]/ul/li[1]/a")).click();
    }

    @And("Add Button is Clicked")
    public void addButtonIsClicked() {
        homePage.getElement(By.xpath("/html/body/div[3]/div/div[2]/form/button")).click();
    }

    @Given("{string} is filled with {string} and {string} is filled with {string}")
    public void firstNameFieldIsFilledWithParameterAndLastNameFieldIsFilledWithParameter(String firstNameField, String parameter1, String lastNameField, String parameter2) {
        homePage.getElement(By.name(firstNameField)).sendKeys(parameter1);
        homePage.getElement(By.name(lastNameField)).sendKeys(parameter2);
    }

    @When("The Submit Button is Clicked")
    public void theSubmitButtonIsClicked() {
        homePage.getElement(By.xpath("/html/body/div[3]/div/form/div[1]/div/div[3]/button")).click();
    }

    @Then("The {string} is Shown")
    public void theErrorMessageIsShown(String errorMessage) {
        if(homePage.isDisplayed(By.xpath("/html/body/div[3]/div/div[2]")))
        {
            Assert.assertEquals(errorMessage, homePage.getElement(By.xpath("/html/body/div[3]/div/div[2]")).getText());
        }
        else{
            fail();
        }
    }

    @And("Suppliers panel is Clicked")
    public void supplierPanelIsClicked() {
        homePage.getElement(By.xpath("/html/body/div[3]/nav/div[2]/ul/li[5]/ul/li[2]/a")).click();
    }
//-------------------------------------------------------------------------------------------------
    @Given("Boats DropDown Menu is Clicked")
    public void boatsDropDownMenuIsClicked() {
        homePage.getElement(By.xpath("/html/body/div[3]/nav/div[2]/ul/li[9]/a")).click();
    }

    @When("{string} is Clicked")
    public void accountTypePathIsClicked(String accountTypePath) {
        homePage.getElement(By.xpath(accountTypePath)).click();
    }

    @Then("Title {string} is Shown")
    public void titlePageTitleIsShown(String pageTitle) {
        driver.get(driver.getCurrentUrl());
        Assert.assertEquals(pageTitle, driver.getTitle());
    }

    @Given("Rentals DropDown Menu is Clicked")
    public void rentalsDropDownMenuIsClicked() {
        homePage.getElement(By.xpath("/html/body/div[3]/nav/div[2]/ul/li[10]/a")).click();
    }

    @Given("General DropDown Menu is Clicked")
    public void generalDropDownMenuIsClicked() {
        homePage.getElement(By.xpath("/html/body/div[3]/nav/div[2]/ul/li[4]/a")).click();
    }

    @And("Offers DropDown Menu is Clicked")
    public void offersDropDownMenuIsClicked() {
        homePage.getElement(By.xpath("/html/body/div[3]/nav/div[2]/ul/li[17]/a")).click();
    }

    @And("Manage Offers panel is Clicked")
    public void manageOffersPanelIsClicked() {
        homePage.getElement(By.xpath("/html/body/div[3]/nav/div[2]/ul/li[17]/ul/li[1]/a")).click();
    }

    @Given("{string} is filled with {string}")
    public void offerTitleFieldIsFilledWithOfferTitle(String offerTitleField, String offerTitle) {
        homePage.getElement(By.name(offerTitleField)).sendKeys(offerTitle);
    }

    @When("Offer Submit Button is Clicked")
    public void offerSubmitButtonIsClicked() {
        homePage.getElement(By.id("add")).click();
    }

    @Then("The Offer {string} is Shown")
    public void theOfferErrorMessageIsShown(String errorMessage) {
        if(homePage.isDisplayed(By.xpath("/html/body/div[3]/div/div[2]/div")))
        {
            Assert.assertEquals(errorMessage, homePage.getElement(By.xpath("/html/body/div[3]/div/div[2]/div")).getText());
        }
        else{
            fail();
        }
    }
}
