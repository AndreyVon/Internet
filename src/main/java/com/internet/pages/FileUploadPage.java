package com.internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FileUploadPage extends BasePage{

    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "file-upload")
    WebElement fileUpload;

    @FindBy(id = "file-submit")
    WebElement upload;

    public FileUploadPage uploadFile(String path) {
        fileUpload.sendKeys(path);
        click(upload);

        return this;
    }
    @FindBy(xpath = "//h3[.='File Uploaded!']")
    WebElement successTitle;

    public FileUploadPage verifySuccessTitle(String title) {
        Assert.assertTrue(successTitle.getText().contains(title));
        return this;
    }
}
