package pages;

import org.openqa.selenium.By;
import base.BaseTest;

public class ContactPage extends BaseTest {


    By contactLink = By.linkText("Contact");
    By forename = By.id("forename");
    By email = By.id("email");
    By message = By.id("message");
    By submitBtn = By.xpath("//a[text()='Submit']");

    // Navigate to Contact page
    public void goToContactPage() {
        driver.findElement(contactLink).click();
    }

    // Click submit
    public void clickSubmit() {
        driver.findElement(submitBtn).click();
    }

    // Enter mandatory fields
    public void enterMandatoryFields() {
        driver.findElement(forename).sendKeys("John");
        driver.findElement(email).sendKeys("john@test.com");
        driver.findElement(message).sendKeys("Hello");
    }

    // Validate error exists
    public boolean isErrorDisplayed() {
        return driver.getPageSource().contains("is required");
    }

    // Validate success message
    public boolean isSuccessMessageDisplayed() {
        return driver.getPageSource().contains("Thanks");
    }
}