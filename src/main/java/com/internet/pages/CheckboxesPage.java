package com.internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckboxesPage extends BasePage{

    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "[type='checkbox']:nth-of-type(1)")
    WebElement checkbox1;
    @FindBy(css = "[type='checkbox']:nth-of-type(2)")
    WebElement checkbox2;

    public CheckboxesPage selectCheckBox(String[] checkbox) {
        click(checkbox2);
        for (int i = 0; i < checkbox.length; i++) {
            if(checkbox[i].equals("checkbox1")){
                click(checkbox1);
            }if(checkbox[i].equals("checkbox2")){
                click(checkbox2);
            }

        }

        return this;

    }
}
