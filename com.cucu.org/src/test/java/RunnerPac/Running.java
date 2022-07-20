package RunnerPac;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\s2605\\eclipse-workspace\\stfc-fd-automation\\com.cucu.org\\src\\test\\resources",
glue = "com.definition",plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
monochrome = false,
dryRun = false)
public class Running {

}
