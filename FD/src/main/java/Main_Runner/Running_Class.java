package Main_Runner;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import BaseClass.LibGlobal;
import Iteration.Excel_Utility;
import Pre_Execution.Coder_Class;

public class Running_Class {

	public ExtentReports report;
	public ExtentTest test;

	@BeforeTest
	public void ExtentReport() {

		report = new ExtentReports(
				"C:\\Users\\s2605\\eclipse-workspace\\stfc-fd-automation\\FD\\ExtentReport\\report.html");
	}

	@DataProvider
	public static Iterator<Object[]> getTestData() { 
		ArrayList<Object[]> dataFromexcel = Excel_Utility.getDataFromexcel();
		return dataFromexcel.iterator();
	}
	
	@Test(dataProvider = "getTestData")
	public void Mobile_Validation(String MobileNo, String pincode, String EmailId, String amount_input_fd,
			String tenure_input_fd, String Are_you_a_senior_citizen, String verifyOtp, String amount_input_fd1,
			String tenure_input_fd2, String Select_Interest_Payout, String Are_you_a_senior_citizen1, String Iteration,
			String INDEX) {

		try {

			LibGlobal lib = new LibGlobal();
			lib.launchBrowser("Chrome");
			lib.loadUrl(
					"https://uatonlinefd.stfc.in/fixed-deposit-online/?utm_source=STFC-website&amp;utm_medium=organic&amp;utm_campaign=fd-investment&amp;utm_content=stickybanner&amp;utm_term=fixed-deposit/calculator");
			Coder_Class cd = new Coder_Class();
			cd.MobileNumberValidation(MobileNo, test, report, Iteration, INDEX);
			cd.Pincode_Validation(pincode, report, test, Iteration, INDEX);
			cd.EmailId_Validation(EmailId, amount_input_fd, tenure_input_fd, Are_you_a_senior_citizen, report, test,
					Iteration, INDEX);
			cd.OTP_validation(verifyOtp, report, test, Iteration, INDEX);
			cd.SchemePage(amount_input_fd1, tenure_input_fd2, Select_Interest_Payout, Are_you_a_senior_citizen1, report,
					test, Iteration, INDEX);
			Thread.sleep(5000);
			lib.quitBrowser();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	@AfterTest
	public void tearDown() {
		report.endTest(test);
		report.flush();
		System.out.println("Journey Completed");

	}

}
