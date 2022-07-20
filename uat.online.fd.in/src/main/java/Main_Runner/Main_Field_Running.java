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
import Iteration.Excel_Utility1;
import Pre_Execution.All_Validations;

public class Main_Field_Running {

	public ExtentReports report;
	public ExtentTest test;

	@BeforeTest
	public void ExtentReport() {

		report = new ExtentReports(
				"C:\\Users\\s2605\\eclipse-workspace\\stfc-fd-automation\\uat.online.fd.in\\ExtentReport\\report.html");

	}

	@DataProvider
	public static Iterator<Object[]> getTestData() {
		ArrayList<Object[]> dataFromexcel = Excel_Utility1.getDataFromexcel();
		return dataFromexcel.iterator();
	}

	@Test(dataProvider = "getTestData")
	public void Final_Run(String INDEX, String Iteration, String ErrorMsg, String mobileNo, String pinCode,
			String emailID, String OTP, String Amount_input_fd, String Tenure_input_fd, String Select_Interest_Payout,
			String S1_depositorPAN, String S1_depositorMName) throws Exception {
		LibGlobal lib = new LibGlobal();
		lib.launchBrowser("edge");
		lib.loadUrl("https://uatonlinefd.stfc.in/fixed-deposit-online/");
		All_Validations all = new All_Validations();
		Thread.sleep(5000);
		all.mobile_Validation(INDEX, Iteration, ErrorMsg, mobileNo, pinCode, emailID, OTP, Amount_input_fd,
				Tenure_input_fd, Select_Interest_Payout, S1_depositorPAN, S1_depositorMName);
		Thread.sleep(5000);
		lib.quitBrowser();
	}

	@AfterTest
	public void tearDown() {
		report.endTest(test);
		report.flush();
		System.out.println("Journey Completed");

	}

}
