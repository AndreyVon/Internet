package com.internet.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;

public abstract class BasePage {
    WebDriver driver;

    JavascriptExecutor js;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        js = (JavascriptExecutor) driver;
    }

    public void click(WebElement element){
        element.click();
    }

    public void type(WebElement element, String text){
        if(text != null){
            click(element);
            element.clear();
            element.sendKeys(text);
        }
    }

    public void clickWithJS(WebElement element,int x, int y){
        js.executeScript("window.scrollBy("+x+","+y+")");
        click(element);

    }

    public boolean shouldHaveText(WebElement element, String text, int time){
        return new WebDriverWait(driver, Duration.ofSeconds(time))
                .until(ExpectedConditions.textToBePresentInElement(element, text));
    }

    public void verifyLinks(String linkUrl) {
        try {
            URL url = new URL(linkUrl);

            // создавать url conect и получать код ответа
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() >= 400) {
                System.out.println(linkUrl + "-" + httpURLConnection.getResponseCode() + " is a broken link");
            } else {
                System.out.println(linkUrl + "-" + httpURLConnection.getResponseMessage());
            }
        } catch (Exception e) {
            System.out.println(linkUrl + " - " + e.getMessage() + " Error occurred");
        }
    }
}
