package com.internet.tests;

import com.internet.pages.FileUploadPage;
import com.internet.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadTest extends TestBase{
    @BeforeMethod
    public void preconditions(){
        new HomePage(driver).fileUploadPage();

    }

    @Test
    public void uploadFileTest(){
        new FileUploadPage(driver).uploadFile("C:/Tools/gg.png").verifySuccessTitle("File Uploaded!");
    }
}
