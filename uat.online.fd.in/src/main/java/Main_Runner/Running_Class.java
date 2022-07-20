package Main_Runner;

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
import Pre_Execution.Coder_Class;
import X_Paths.Pan_Details_Xpaths;

public class Running_Class {

	public ExtentReports report;
	public ExtentTest test;

	@BeforeTest
	public void ExtentReport() {

		report = new ExtentReports(
				"C:\\Users\\s2605\\eclipse-workspace\\stfc-fd-automation\\uat.online.fd.in\\ExtentReport\\report.html");
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
			String INDEX, String s1_depositorPAN, String s1_depositortitle, String s1_depositorFName,
			String s1_depositorMName, String s1_depositorLName, String s1_depositorDOB, String s1_depositorEmail,
			String Documenttype, String documentNo, String up_ckyc_frontpic, String up_ckyc_backpic,
			String Profie_Upload, String s3_Documentnoo, String s3_idproof, String s3_addrline1, String s3_addrline2,
			String s3_area, String s3_city, String s3_state, String s3_pincode, String s4_accountno,
			String s4_confaccountno, String banknn, String bal, String s4_ifsc, String s4_branch, String s4_bankname,
			String s4_acctype, String s4_accholdername, String s5_Occupation, String s5_Marital, String s5_Maturity_ins,
			String s5_spouseName, String s5_fatherName, String TDS_Certificate, String s5_taxact,
			String s5_FinancialYear, String s5_EstimatedIncome, String s5_esttotincome, String s5_formsfilled,
			String s5_AggregateAmount, String Add_Nominee, String s5_nomineeRelation, String s5_nomineetitle,
			String s5_nomineeFname, String s5_nomineeMname, String s5_nomineeLname, String s5_nomineeDOB,
			String Nominee_address_same_as_Applicant_address, String s5_nomadd1, String s5_nomadd2, String s5_nomarea,
			String s5_nomcity, String s5_nomstate, String s5_nompincode) throws Exception {

		try {

			LibGlobal lib = new LibGlobal();
			lib.launchBrowser("edge");
			lib.loadUrl("https://uatfd.stfc.in/fixed-deposit-online/");
			Coder_Class cd = new Coder_Class();
			cd.MobileNumberValidation(MobileNo, test, report, Iteration, INDEX);
			cd.Pincode_Validation(pincode, report, test, Iteration, INDEX);
			cd.EmailId_Validation(EmailId, amount_input_fd, tenure_input_fd, Are_you_a_senior_citizen, report, test,
					Iteration, INDEX);
			cd.OTP_validation(verifyOtp, report, test, Iteration, INDEX);
			cd.SchemePage(amount_input_fd1, tenure_input_fd2, Select_Interest_Payout, Are_you_a_senior_citizen1, report,
					test, Iteration, INDEX);

			Pan_Details_Xpaths pan = new Pan_Details_Xpaths();
			WebElement firstStage = pan.getFirstStage();
			String text2 = firstStage.getText();
			System.out.println(text2);

			if(text2.equals("PAN Details")) {
				cd.Pan_Details_Page(s1_depositorPAN, s1_depositortitle, s1_depositorFName, s1_depositorMName,
						s1_depositorLName, s1_depositorEmail, s1_depositorDOB);
			}
			WebElement second_Stage = pan.getSecond_Stage();
			String text3 = second_Stage.getText();
			System.out.println(text3);
//			 cd.Ckyc_Page(Documenttype, documentNo, up_ckyc_frontpic, up_ckyc_backpic);
			
//			 cd.Personal_details_Page(Profie_Upload, s3_Documentnoo, s3_idproof,
//			 s3_addrline1, s3_addrline2, s3_area, s3_city, s3_state, s3_pincode);
			// cd.Bank_details(s4_accountno, s4_confaccountno, banknn, bal, s4_ifsc,
			// s4_branch, s4_bankname, s4_acctype,
			// s4_accholdername);
			//
			// cd.Additonal_Details_page(s5_Occupation, s5_Marital, s5_Maturity_ins,
			// s5_spouseName, s5_fatherName,
			// TDS_Certificate, s5_taxact, s5_FinancialYear, s5_EstimatedIncome,
			// s5_esttotincome, s5_formsfilled,
			// s5_AggregateAmount, Add_Nominee, s5_nomineeRelation, s5_nomineetitle,
			// s5_nomineeFname,
			// s5_nomineeMname, s5_nomineeLname, s5_nomineeDOB,
			// Nominee_address_same_as_Applicant_address,
			// s5_nomadd1, s5_nomadd2, s5_nomarea, s5_nomcity, s5_nomstate, s5_nompincode);
			//
			// Thread.sleep(5000);
			String text = "All fields are working fine in ";
			String text1 = Iteration;
			String concat = text.concat(text1);
			int parseInt = Integer.parseInt(INDEX);
			Excel_Utility.writeinexcelForReasons(concat, parseInt);
			lib.quitBrowser();
		} catch (Exception e) {
			e.printStackTrace();
			String text = "All fields aren't working fine in ";
			String text1 = Iteration;
			String concat = text.concat(text1);
			int parseInt = Integer.parseInt(INDEX);
			Excel_Utility.writeinexcelForReasons(concat, parseInt);

		}

	}

	@AfterTest
	public void tearDown() {
		report.endTest(test);
		report.flush();
		System.out.println("Journey Completed");

	}

}
