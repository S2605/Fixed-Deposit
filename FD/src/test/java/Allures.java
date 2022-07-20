import java.util.UUID;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import freemarker.log.Logger;
import io.qameta.allure.Allure;
import io.qameta.allure.model.Status;
import io.qameta.allure.model.StepResult;

public class Allures {
	public static Logger log = Logger.getLogger("devpinoylog");
    private static StepResult result_fail;
    private static StepResult result_pass;
    private static String uuid;
    private static SoftAssert softAssertion;


    public static void startTest() {
        softAssertion = new SoftAssert();
    }

    public static void logStep(String discription) {
        log.info(discription);
        uuid = UUID.randomUUID().toString();
        result_fail = new StepResult().setName(discription).setStatus(Status.FAILED);
        result_pass = new StepResult().setName(discription).setStatus(Status.PASSED);
    }

    public static void markStepAsFailed(WebDriver driver, String errorMessage) {
    	log.error(errorMessage);
        Allure.getLifecycle().startStep(uuid, result_fail);
        Allure.getLifecycle().addAttachment(errorMessage, "image", "JPEG", ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
        Allure.getLifecycle().stopStep(uuid);
        softAssertion.fail(errorMessage);
    }


    public static void markStepAsPassed(WebDriver driver, String message) {
        log.info(message);
        Allure.getLifecycle().startStep(uuid, result_pass);
        Allure.getLifecycle().stopStep(uuid);
    }

    public static void endTest() {
        softAssertion.assertAll();
        softAssertion = null;
        startTest();
        softAssertion = new SoftAssert();
    }

       
    }


