package com.internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends BasePage{

    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "column-a")
    WebElement dragMe;

    @FindBy(id = "column-b")
    WebElement dropHere;


    public DragAndDropPage actionDragMe() {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragMe,dropHere).perform();
        String text = dropHere.getText();
        if(text.equals("Dropped!")){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        return this;

    }
}
