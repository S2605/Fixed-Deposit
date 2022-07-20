import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import BaseClass.LibGlobal;
import Iteration.Excel_Utility;

public class Main_Running {

	public ExtentReports report;
	public ExtentTest test;

	@BeforeTest
	public void ExtentReports() {

		report = new ExtentReports(
				"C:\\Users\\s2605\\eclipse-workspace\\stfc-fd-automation\\uat.online.fd.in\\ExtentReport\\report.html");

	}

	@DataProvider
	public static Iterator<Object[]> getTestData() {
		ArrayList<Object[]> dataFromexcel = Excel_Utility.getDataFromexcel();
		return dataFromexcel.iterator();
	}

	@Test(dataProvider = "getTestData")
	public void Complete_Run(String MobileNo, String pincode, String EmailID, String verifyOtp, String amount_input_fd,
			String tenureOptions, String tenure_input_fd, String select_Interest_Payout, String citizenyes,
			String s1_depositorPAN, String s1_depositortitle, String s1_depositorMName) throws Exception {

		LibGlobal lib = new LibGlobal();
		lib.launchBrowser("edge");
		lib.loadUrl("https://uatfd.stfc.in/fixed-deposit-online/");

		Pre_Executions pr = new Pre_Executions();

		Thread.sleep(2000);
		pr.LandingPage(MobileNo, pincode, EmailID, verifyOtp);
		Thread.sleep(2000);
		pr.SchemeDetailsPage(amount_input_fd, tenureOptions, tenure_input_fd, select_Interest_Payout, citizenyes);
		Pan_details_Xpaths pan = new Pan_details_Xpaths();
		WebElement firstStage = pan.getFirstStage();
		String text = firstStage.getText();
		System.out.println(text);
		if (text.equals("PAN Details")) {
			pr.Pan_Details_Page(s1_depositorPAN, s1_depositortitle, s1_depositorMName);
		}
		Thread.sleep(5000);
		// lib.quitBrowser();
	}

	@AfterTest
	public void tearDown() {

		report.endTest(test);
		report.flush();

	}
}
