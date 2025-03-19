package com.internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[href='/javascript_alerts']")
    WebElement alertsWindow;

    public AlertsPage getAlerts() {
        click(alertsWindow);
        return new AlertsPage(driver);
    }

    @FindBy(css = "[href='/windows']")
    WebElement multipleWindow;

    public MultipleWindowsPage getMultipleWindow() {
        click(multipleWindow);
        return new MultipleWindowsPage(driver);
    }
    @FindBy(css = "[href='/checkboxes']")
    WebElement checkboxesPage;

    public CheckboxesPage getCheckBoxPage(){
        click(checkboxesPage);
        return new CheckboxesPage(driver);
    }
    @FindBy(css = "[href='/dropdown']")
    WebElement dropdownPage;

    public DropdownPage getDropDownPage() {
        click(dropdownPage);
        return new DropdownPage(driver);

    }
    @FindBy(css = "[href='/upload']")
    WebElement upload;

    public FileUploadPage fileUploadPage() {
        click(upload);
        return new FileUploadPage(driver);
    }
}
