package com.internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class MultipleWindowsPage extends BasePage{
    public MultipleWindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[href='/windows/new']")
    WebElement windowButton;

    public MultipleWindowsPage switchToNextWindow(int index) {
        click(windowButton);

        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(index));


        return this;
    }
    @FindBy(css = "[class='example']")
    WebElement sampleHeading;

    public BasePage verifyNewWindowMessage(String text) {
        Assert.assertTrue(shouldHaveText(sampleHeading,text,10));

        return this;
    }
}
