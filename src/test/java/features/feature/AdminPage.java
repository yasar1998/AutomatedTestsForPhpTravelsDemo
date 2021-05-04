package features.feature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
    private static final String siteUrl = "https://www.phptravels.net/admin";

    @FindBy(name = "email")
    private WebElement adminUserNameField;

    @FindBy(name = "password")
    private WebElement adminPasswordField;

    @FindBy(xpath = "/html/body/div[2]/form[1]/button")
    private WebElement loginAsAdminButton;

    private WebDriver driver;

    public AdminPage(WebDriver driver) {
        this.driver = driver;
        driver.get(siteUrl);
        PageFactory.initElements(driver, this);

        adminUserNameField.sendKeys("admin@phptravels.com");
        adminPasswordField.sendKeys("demoadmin");

        loginAsAdminButton.click();
    }

    public WebElement getElement(By locator){
        return driver.findElement(locator);
    }

    public boolean isDisplayed(By locator){
        return driver.findElements(locator).size() > 0;
    }
}
