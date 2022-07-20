package com.TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\s2605\\IdeaProjects\\stfc-fd-automation\\Cucumber1\\src\\test\\resources",
        glue = "com.stepDefinition",
        dryRun = false, plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class RunnerClass {

}
