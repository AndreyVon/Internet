package com.internet.tests;

import com.internet.pages.HomePage;
import com.internet.pages.MultipleWindowsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindowsTests extends TestBase{
    @BeforeMethod
    public void preconditions(){
        new HomePage(driver).getMultipleWindow();

    }

    @Test
    public void newWindowTest(){
        new MultipleWindowsPage(driver).switchToNextWindow(1).verifyNewWindowMessage("New Window");
    }
}
