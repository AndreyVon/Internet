package com.internet.tests;

import com.internet.pages.DragAndDropPage;
import com.internet.pages.DropdownPage;
import com.internet.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDropTest extends TestBase{
    @BeforeMethod
    public void preconditions(){
        new HomePage(driver).dragAndDropPage();

    }

    @Test
    public void dragAndDropTest(){
        new DragAndDropPage(driver).actionDragMe();

    }
}
