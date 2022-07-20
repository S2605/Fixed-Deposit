package com.TestRunner;

import com.BaseClass.WaitBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

public class Demo extends WaitBaseClass {
    public static void main(String[] args) {

        //Create WebDriver instance and open the website.
        browser("EDGE");
        urlVerification("https://uatfd.stfc.in/fixed-deposit-online/");

        String url = "";
        List<WebElement> allURLs = driver.findElements(By.tagName("a"));
        System.out.println("Total links on the Wb Page: " + allURLs.size());

        //We will iterate through the list and will check the elements in the list.
        Iterator<WebElement> iterator = allURLs.iterator();
        while (iterator.hasNext()) {
            url = iterator.next().getText();
            System.out.println(url     );
        }

        //Close the browser session
        driver.quit();
    }
}

