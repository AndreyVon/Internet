package com.internet.tests;

import com.internet.pages.CheckboxesPage;
import com.internet.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxTest extends TestBase{
    @BeforeMethod
    public void preconditions(){
        new HomePage(driver).getCheckBoxPage();

    }

    @Test
    public void checkBoxTest(){
        new CheckboxesPage(driver).selectCheckBox(new String[]{"checkbox1","checkbox2"});
    }
}
