package com.internet.tests;

import com.internet.pages.BrokenImagesPage;
import com.internet.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrokenImagesTest extends TestBase{
    @BeforeMethod
    public void preconditions(){
        new HomePage(driver).brokenImagePage();

    }

    @Test
    public void checkBrokenImagesTest(){
        new BrokenImagesPage(driver).checkBrokenImages();
    }

}
