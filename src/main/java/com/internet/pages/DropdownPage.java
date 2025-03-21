package com.internet.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage extends BasePage {

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "dropdown")
    WebElement dropdown;

    @FindBy(xpath = "//option[.='Option 2']")
    WebElement option2;

    @FindBy(xpath = "//option[.='Option 1']")
    WebElement option1;

    @FindBy(xpath = "//h3[.='Dropdown List']")
    WebElement enter;




    public DropdownPage selectDropDown(String drop) {
        click(dropdown);
        if (drop.equals("dr1")) {
            click(option1);
        } else {
            click(option2);
        }
        click(enter);

        return this;
    }


}
