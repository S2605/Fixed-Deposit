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
import X_Paths.Additional_Details_Xpaths;
import X_Paths.Bank_details_xpaths;
import X_Paths.Ckyc_Page_Xpaths;
import X_Paths.Minor_Pan_Xpaths;
import X_Paths.Pan_Details_Xpaths;
import X_Paths.PennyDrop_Xpaths;
import X_Paths.Personal_Details_Page_Xpaths;
import X_Paths.Scheme_Details_Xpaths;

public class Running_Class {
	public ExtentReports report;
	public ExtentTest test;

	@BeforeTest
	public void ExtentReport() {

		report = new ExtentReports(
				"C:\\Users\\s2605\\eclipse-workspace\\stfc-fd-automation\\FixedDeposit_Automation\\ExtentReport\\report.html");
	}

	@DataProvider
	public static Iterator<Object[]> getTestData() {
		ArrayList<Object[]> dataFromexcel = Excel_Utility.getDataFromexcel();
		return dataFromexcel.iterator();
	}

	@Test(dataProvider = "getTestData")
	public void Mobile_Validation(String MobileNo, String pincode, String EmailId, String verifyOtp,
			String amount_input_fd1, String tenure_input_fd2, String Select_Interest_Payout,
			String Are_you_a_senior_citizen1, String Iteration, String INDEX, String s1_depositorPAN,
			String s1_depositortitle, String s1_depositorFName, String s1_depositorMName, String s1_depositorLName,
			String s1_depositorDOB, String s1_depositorEmail, String Documenttype, String DocumentNo,
			String up_ckyc_frontpic, String up_ckyc_backpic, String Profie_Upload, String s3_Documentnoo,
			String s3_idproof, String s3_addrline1, String s3_addrline2, String s3_area, String s3_city,
			String s3_state, String s3_pincode, String s4_accountno, String s4_confaccountno, String banknn, String bal,
			String s4_ifsc, String s4_branch, String s4_bankname, String s4_acctype, String s4_accholdername,
			String s5_Occupation, String s5_Marital, String s5_Maturity_ins, String s5_spouseName, String s5_fatherName,
			String TDS_Certificate, String s5_taxact, String s5_FinancialYear, String s5_EstimatedIncome,
			String s5_esttotincome, String s5_formsfilled, String s5_AggregateAmount, String Add_Nominee,
			String s5_nomineeRelation, String s5_nomineetitle, String s5_nomineeFname, String s5_nomineeMname,
			String s5_nomineeLname, String s5_nomineeDOB, String Nominee_address_same_as_Applicant_address,
			String s5_nomadd1, String s5_nomadd2, String s5_nomarea, String s5_nomcity, String s5_nomstate,
			String s5_nompincode, String ocrChkUpload, String ifsccodes, String s1_depositorGuardianPAN,
			String s1_depositorGuardianMName, String s1_depositorGuardianEmail) throws Exception {

		LibGlobal lib = new LibGlobal();

		try {

			lib.launchBrowser("edge");

			lib.loadUrl("https://uatonlinefd.stfc.in/fixed-deposit-online/");

			Coder_Class cd = new Coder_Class();

			cd.MobileNumberValidation(MobileNo, test, report, Iteration, INDEX);

			cd.Pincode_Validation(pincode, report, test, Iteration, INDEX);

			cd.EmailId_Validation(EmailId, report, test, Iteration, INDEX);

			cd.OTP_validation(verifyOtp, report, test, Iteration, INDEX);

			Scheme_Details_Xpaths scheme = new Scheme_Details_Xpaths();

			WebElement scheme_Details_Page = scheme.getScheme_Details_Page();

			String text7 = scheme_Details_Page.getText();

			System.out.println(text7);

			if (text7.equals("Investment Amount")) {
				cd.SchemePage(amount_input_fd1, tenure_input_fd2, Select_Interest_Payout, Are_you_a_senior_citizen1,
						report, test, Iteration, INDEX);
			}

			Pan_Details_Xpaths pan = new Pan_Details_Xpaths();

			WebElement currenStatge = pan.getCurrenStatge();

			String text2 = currenStatge.getText();

			System.out.println(text2);

			if (text2.equals("Enter your PAN details")) {
				cd.Pan_Details_Page(s1_depositorPAN, s1_depositortitle, s1_depositorFName, s1_depositorMName,
						s1_depositorLName, s1_depositorEmail, s1_depositorDOB, Iteration, INDEX, test);
			}

			Minor_Pan_Xpaths minor = new Minor_Pan_Xpaths();
			WebElement guardian_Flow = minor.getGuardian_Flow();
			String text10 = guardian_Flow.getText();

			if (text10.equals("The depositor is minor, please add guardian details")) {

				cd.Guardian_Pan_Flow(s1_depositorGuardianPAN, s1_depositorGuardianMName, s1_depositorGuardianEmail);

			}

			WebElement stage2 = pan.getStage2();

			String text3 = stage2.getText();

			System.out.println(text3);

			if (text3.equals("Your Deposit Summary")) {

				cd.Payment_screen(Iteration, INDEX, test);
			}

			Thread.sleep(5000);
			Ckyc_Page_Xpaths ck = new Ckyc_Page_Xpaths();

			WebElement ckyc_fail = ck.getCKYC_fail();

			String text4 = ckyc_fail.getText();

			System.out.println(text4);

			if (text4.equals("Please select the document type")) {

				cd.Ckyc_Page(Documenttype, DocumentNo, up_ckyc_frontpic, up_ckyc_backpic, Iteration, INDEX, test);
			}

			Personal_Details_Page_Xpaths pd = new Personal_Details_Page_Xpaths();

			WebElement personalDetails = pd.getPersonalDetails();

			String text5 = personalDetails.getText();

			if (text5.equals("Address Details")) {

				System.out.println("hiii");

				cd.Personal_details_Page(Profie_Upload, s3_Documentnoo, s3_idproof, s3_addrline1, s3_addrline2, s3_area,
						s3_city, s3_state, s3_pincode, Iteration, INDEX, test);

			}

			Bank_details_xpaths bank = new Bank_details_xpaths();

			WebElement bankDetails = bank.getBankDetails();

			String text6 = bankDetails.getText();

			System.out.println(text6);

			if (text6.equals("Account Number")) {

				cd.Bank_details(s4_accountno, s4_confaccountno, banknn, bal, s4_ifsc, s4_branch, s4_bankname,
						s4_acctype, s4_accholdername, ifsccodes, Iteration, INDEX, test);
			}
			PennyDrop_Xpaths penny = new PennyDrop_Xpaths();
			WebElement ocr_Page = penny.getOcr_Page();
			String text9 = ocr_Page.getText();
			System.out.println(text9);

			if (text9.equals(
					"Failed to validate your account, Please upload the \"front image\" of your cheque or Passbook.")) {

				cd.pennyDrop(ocrChkUpload, Iteration, INDEX, test);
			}

			Additional_Details_Xpaths ad = new Additional_Details_Xpaths();
			WebElement stage_Final = ad.getStage_Final();
			String text8 = stage_Final.getText();
			System.out.println(text8);

			if (text8.equals("Tax Exemption")) {
				cd.Additonal_Details_page(s5_Occupation, s5_Marital, s5_Maturity_ins, s5_spouseName, s5_fatherName,
						TDS_Certificate, s5_taxact, s5_FinancialYear, s5_EstimatedIncome, s5_esttotincome,
						s5_formsfilled, s5_AggregateAmount, Add_Nominee, s5_nomineeRelation, s5_nomineetitle,
						s5_nomineeFname, s5_nomineeMname, s5_nomineeLname, s5_nomineeDOB,
						Nominee_address_same_as_Applicant_address, s5_nomadd1, s5_nomadd2, s5_nomarea, s5_nomcity,
						s5_nomstate, s5_nompincode, INDEX, Iteration, test);
			}

			Thread.sleep(5000);

			String text = "All fields are working fine in ";

			String text1 = Iteration;

			String concat = text.concat(text1);

			int parseInt = Integer.parseInt(INDEX);

			// Excel_Utility.writeinexcelForReasons(concat, parseInt);

			lib.quitBrowser();

		} catch (Exception e) {

			e.printStackTrace();

			String text = "All fields are not working fine in ";

			String text1 = Iteration;

			String concat = text.concat(text1);

			int parseInt = Integer.parseInt(INDEX);

			// Excel_Utility.writeinexcelForReasons(concat, parseInt);

		}

	}

	@AfterTest
	public void tearDown() {

		report.endTest(test);

		report.flush();

		System.out.println("Journey Completed");

	}

}
