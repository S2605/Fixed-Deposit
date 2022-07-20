package com.stepDefinition;

import com.BaseClass.WaitBaseClass;
import com.utilities.CommonUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class commons_Step_Definition extends WaitBaseClass {

    @Before
    public void beforeScenario() {

        try {
            CommonUtils.loadProperties();
            launchBrowser();
            loadUrl();
            initElementsOfAllPage();
        } catch (Exception e) {

            System.out.println(e);
        }
    }

    @After
    public void afterScenario() {

        quitBrowser();

    }


}
