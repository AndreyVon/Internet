package com.internet.tests;

import com.internet.pages.AlertsPage;
import com.internet.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTests extends TestBase{

    @BeforeMethod
    public void preconditions(){
        new HomePage(driver).getAlerts();

    }

    @Test
    public void alertTest(){
        new AlertsPage(driver).alert().verifyResult("You successfully clicked an alert");
    }

    @Test
    public void alertWithSelectTest(){
        new AlertsPage(driver).selectResult("Cancel").verifyResult("Cancel");
    }
}
