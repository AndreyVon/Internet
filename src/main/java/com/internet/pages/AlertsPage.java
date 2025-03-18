package com.internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AlertsPage extends BasePage{

    public AlertsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "[onclick='jsAlert()']")
    WebElement alertsPage;

    public AlertsPage alert() {
        click(alertsPage);
        driver.switchTo().alert().accept();
        return this;
    }

    @FindBy(id = "result")
    WebElement result;

    public AlertsPage verifyResult(String text) {
        Assert.assertTrue(result.getText().contains(text));
        return this;
    }

    @FindBy(css = "[onclick='jsConfirm()']")
    WebElement confirmButton;

    public AlertsPage selectResult(String confirm) {
        click(confirmButton);
        if(confirm != null && confirm.equals("OK")){
            driver.switchTo().alert().accept();
        } else if (confirm != null && confirm.equals("Cancel")) {
            driver.switchTo().alert().dismiss();

        }
        return this;
    }
}
