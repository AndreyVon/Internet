package com.internet.tests;

import com.internet.pages.DropdownPage;
import com.internet.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownTest extends TestBase{

    @BeforeMethod
    public void preconditions(){
        new HomePage(driver).getDropDownPage();

    }

    @Test
    public void getDropDown(){
        new DropdownPage(driver).selectDropDown(new String("dr1"));
    }
}
