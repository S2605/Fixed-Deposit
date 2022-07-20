package Pre_Execution;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import BaseClass.LibGlobal;
import Iteration.Excel_Utility;
import X_Paths.Additional_Details_Xpaths;
import X_Paths.Bank_details_xpaths;
import X_Paths.Ckyc_Page_Xpaths;
import X_Paths.LandingPage_Xpaths;
import X_Paths.Pan_Details_Xpaths;
import X_Paths.Personal_Details_Page_Xpaths;
import X_Paths.Scheme_Details_Xpaths;

public class Coder_Class {

	public void MobileNumberValidation(String MobileNo, ExtentTest test, ExtentReports report, String Iteration,
			String INDEX) throws Exception {

		try {
			String titleName;
			titleName = "mobile validation start";
			String titleName1 = Iteration;
			String concat1 = titleName.concat(titleName1);
			test = report.startTest(concat1);
			LibGlobal lib = new LibGlobal();
			LandingPage_Xpaths lp = new LandingPage_Xpaths();
			Thread.sleep(3000);
			WebElement mobileNo2 = lp.getMobileNo();
			lib.scrollDown(mobileNo2);
			Thread.sleep(3000);
			mobileNo2.sendKeys(MobileNo);
			Thread.sleep(2000);
			// mobileNo2.sendKeys(Keys.ENTER);
			// WebElement mobileNo_error = lp.getMobileNo_error();
			// boolean displayed = lp.getMobileNo_error().isDisplayed();
			// String text = "";
			// text = mobileNo_error.getText();
			// // System.out.println(text);
			// String text1 = "Invalid Mobile Number";
			//
			// //WebElement mo_error_1 = lp.getMo_error_1();
			// //String text2 = mo_error_1.getText();
			// // System.out.println(text2);
			// String text3 = "Invalid input (numbers only)";
			// if (text.contentEquals(text1)) {
			// System.out.println(text1 + "Failed ");
			//
			// } else if (text.contentEquals(text3)) {
			//
			// System.out.println(text3 + "Failed ");
			//
			// } else if(displayed==false) {
			// System.out.println("Passed ");
			// }
			// Allures.markStepAsPassed(driver, "Mobile Number validation");
			int parseInt = Integer.parseInt(INDEX);
			Excel_Utility.writeinexcel("PASS", parseInt);
			String ex = "mobile validation pass in ";
			String concat11 = ex.concat(titleName1);
			test.log(LogStatus.PASS, concat11);
		} catch (Exception e) {
			e.printStackTrace();
			int parseInt = Integer.parseInt(INDEX);
			Excel_Utility.writeinexcel("FAIL", parseInt);
			String ex = "mobile validation Fail in ";
			String titleName1 = Iteration;
			String concat11 = ex.concat(titleName1);
			test.log(LogStatus.FAIL, concat11);
		}
	}

	public void Pincode_Validation(String pincode, ExtentReports report, ExtentTest test, String Iteration,
			String INDEX) throws Exception {
		try {
			String titleName;
			titleName = "Pincode validation start";
			String titleName1 = Iteration;
			String concat1 = titleName.concat(titleName1);
			test = report.startTest(concat1);
			LibGlobal lib = new LibGlobal();
			LandingPage_Xpaths lp = new LandingPage_Xpaths();
			WebElement pinCode = lp.getPinCode();
			pinCode.sendKeys(pincode);
			int parseInt = Integer.parseInt(INDEX);
			Excel_Utility.writeinexcel("PASS", parseInt);
			String ex = "Pincode validation pass in ";
			String concat11 = ex.concat(titleName1);
			test.log(LogStatus.PASS, concat11);
		} catch (Exception e) {

			e.printStackTrace();
			int parseInt = Integer.parseInt(INDEX);
			Excel_Utility.writeinexcel("FAIL", parseInt);
			String ex = "Pincode validation Fail in ";
			String titleName1 = Iteration;
			String concat11 = ex.concat(titleName1);
			test.log(LogStatus.FAIL, concat11);
		}

	}

	public void EmailId_Validation(String EmailId, String amount_input_fd, String tenure_input_fd,
			String Are_you_a_senior_citizen, ExtentReports report, ExtentTest test, String Iteration, String INDEX)
			throws Exception {

		try {
			int parseInt = Integer.parseInt(INDEX);
			String titleName;
			titleName = "EmailID validation start";
			String titleName1 = Iteration;
			String concat1 = titleName.concat(titleName1);
			test = report.startTest(concat1);
			// Allures.startTest();
			LibGlobal lib = new LibGlobal();
			LandingPage_Xpaths lp = new LandingPage_Xpaths();
			WebElement emailID = lp.getEmailID();
			emailID.sendKeys(EmailId);
			// pinCode.sendKeys(Keys.ENTER);
			// WebElement termsandConditons = lp.getTermsandConditons();
			// lib.btnClick(termsandConditons);
			WebElement amount_input_fd1 = lp.getAmount_input_fd();
			lib.scrollDown(amount_input_fd1);
			Thread.sleep(2000);
			amount_input_fd1.clear();
			amount_input_fd1.sendKeys(amount_input_fd);
			amount_input_fd1.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			WebElement tenure_input_fd1 = lp.getTenure_input_fd();
			tenure_input_fd1.clear();
			tenure_input_fd1.sendKeys(tenure_input_fd);
			tenure_input_fd1.sendKeys(Keys.ENTER);

			WebElement citizenyes = lp.getCitizenyes();
			if (Are_you_a_senior_citizen.equals("Yes")) {
				Thread.sleep(2000);
				lib.btnClick(citizenyes);

			}
			WebElement invest_now_Bottom = lp.getInvest_now_Bottom();
			lib.btnClick(invest_now_Bottom);
			Thread.sleep(2000);
			WebElement invest_now_button = lp.getInvest_now_button();
			lib.btnClick(invest_now_button);

			Excel_Utility.writeinexcel("PASS", parseInt);
			String ex = "Email validation pass in ";
			String concat11 = ex.concat(titleName1);
			test.log(LogStatus.PASS, concat11);
		} catch (Exception e) {
			e.printStackTrace();
			int parseInt = Integer.parseInt(INDEX);
			Excel_Utility.writeinexcel("FAIL", parseInt);
			String ex = "Email validation Fail in ";
			String titleName1 = Iteration;
			String concat11 = ex.concat(titleName1);
			test.log(LogStatus.FAIL, concat11);
		}
	}

	public void OTP_validation(String verifyOtp, ExtentReports report, ExtentTest test, String Iteration, String INDEX)
			throws Exception {
		try {
			String titleName;
			titleName = "OTP validation start";
			String titleName1 = Iteration;
			String concat1 = titleName.concat(titleName1);
			test = report.startTest(concat1);
			// Allures.startTest();
			LibGlobal lib = new LibGlobal();
			LandingPage_Xpaths lp = new LandingPage_Xpaths();
			WebElement verifyOtp1 = lp.getVerifyOtp();
			verifyOtp1.sendKeys(verifyOtp);
			Thread.sleep(2000);
			WebElement verifyOtpSubmit = lp.getVerifyOtpSubmit();
			lib.btnClick(verifyOtpSubmit);
			int parseInt = Integer.parseInt(INDEX);
			Excel_Utility.writeinexcel("PASS", parseInt);
			String ex = "OTP_validation pass in ";
			String concat11 = ex.concat(titleName1);
			test.log(LogStatus.PASS, concat11);
			// Allures.markStepAsPassed(driver, "OTP_validation Passed");
		} catch (Exception e) {
			e.printStackTrace();
			int parseInt = Integer.parseInt(INDEX);
			Excel_Utility.writeinexcel("FAIL", parseInt);
			String ex = "OTP_validation  Fail in ";
			String titleName1 = Iteration;
			String concat11 = ex.concat(titleName1);
			test.log(LogStatus.FAIL, concat11);
		}
	}

	public void SchemePage(String amount_input_fd1, String tenure_input_fd2, String Select_Interest_Payout,
			String Are_you_a_senior_citizen1, ExtentReports report, ExtentTest test, String Iteration, String INDEX)
			throws Exception {

		try {
			int parseInt = Integer.parseInt(INDEX);
			String titleName;
			titleName = "Scheme  validation start";
			String titleName1 = Iteration;
			String concat1 = titleName.concat(titleName1);
			test = report.startTest(concat1);
			LibGlobal lib = new LibGlobal();
			WebDriver driver = lib.driver;
			Scheme_Details_Xpaths sd = new Scheme_Details_Xpaths();
			WebElement amount_input_fd2 = sd.getAmount_input_fd();
			amount_input_fd2.clear();
			amount_input_fd2.sendKeys(amount_input_fd1);
			amount_input_fd2.sendKeys(Keys.ENTER);
			Thread.sleep(2000);

			WebElement tenure_input_fd1 = sd.getTenure_input_fd();
			tenure_input_fd1.clear();
			tenure_input_fd1.sendKeys(tenure_input_fd2);
			tenure_input_fd1.sendKeys(Keys.ENTER);
			// System.out.println(tenure_input_fd2);
			Thread.sleep(2000);
			WebElement select_Interest_Payout2 = sd.getSelect_Interest_Payout();
			lib.btnClick(select_Interest_Payout2);
			System.out.println(Select_Interest_Payout);
			if (Select_Interest_Payout.equals("onMaturity")) {
				select_Interest_Payout2.sendKeys(Keys.ENTER);
			} else if (Select_Interest_Payout.equals("Monthly")) {
				select_Interest_Payout2.sendKeys(Keys.ARROW_DOWN);
				select_Interest_Payout2.sendKeys(Keys.ENTER);
			} else if (Select_Interest_Payout.equals("Quarterly")) {
				select_Interest_Payout2.sendKeys(Keys.ARROW_DOWN);
				select_Interest_Payout2.sendKeys(Keys.ARROW_DOWN);
				select_Interest_Payout2.sendKeys(Keys.ENTER);
			} else if (Select_Interest_Payout.equals("Half-Yearly")) {
				select_Interest_Payout2.sendKeys(Keys.ARROW_DOWN);
				select_Interest_Payout2.sendKeys(Keys.ARROW_DOWN);
				select_Interest_Payout2.sendKeys(Keys.ARROW_DOWN);
				select_Interest_Payout2.sendKeys(Keys.ENTER);
			} else if (Select_Interest_Payout.equals("Yearly")) {
				select_Interest_Payout2.sendKeys(Keys.ARROW_DOWN);
				select_Interest_Payout2.sendKeys(Keys.ARROW_DOWN);
				select_Interest_Payout2.sendKeys(Keys.ARROW_DOWN);
				select_Interest_Payout2.sendKeys(Keys.ARROW_DOWN);
				select_Interest_Payout2.sendKeys(Keys.ENTER);
			}
			// WebElement findElement =
			// driver.findElement(By.xpath("//select[@class=\"form-box intrestpayout\"]"));
			// lib.btnClick(findElement);

			// Select s=new Select(findElement);
			// s.selectByVisibleText(Select_Interest_Payout);
			// System.out.println(Select_Interest_Payout);
			Thread.sleep(3000);
			WebElement citizenyes1 = sd.getCitizenyes();
			System.out.println(Are_you_a_senior_citizen1);
			if (Are_you_a_senior_citizen1.equals("Yes")) {
				lib.btnClick(citizenyes1);
			}
			Thread.sleep(5000);
			lib.passScreenCapture("Calculator SreenShot");
			WebElement apply_investbtn = sd.getApply_investbtn();
			lib.scrollDown(apply_investbtn);
			lib.btnClick(apply_investbtn);
			Excel_Utility.writeinexcel("PASS", parseInt);
			String ex = "Scheme details page Pass in ";
			String concat11 = ex.concat(titleName1);
			test.log(LogStatus.PASS, concat11);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			int parseInt = Integer.parseInt(INDEX);
			Excel_Utility.writeinexcel("FAIL", parseInt);
			String ex = "Scheme details page   Fail in ";
			String titleName1 = Iteration;
			String concat11 = ex.concat(titleName1);
			test.log(LogStatus.FAIL, concat11);
		}
	}

	public void Pan_Details_Page(String s1_depositorPAN, String s1_depositortitle, String s1_depositorFName,
			String s1_depositorMName, String s1_depositorLName, String s1_depositorEmail, String s1_depositorDOB)
			throws Exception {

		LibGlobal lib = new LibGlobal();
		Pan_Details_Xpaths pan = new Pan_Details_Xpaths();
		Thread.sleep(3000);
		WebElement s1_depositorPANn = pan.getS1_depositorPAN();
		s1_depositorPANn.sendKeys(s1_depositorPAN);

		Thread.sleep(2000);
		WebElement icon_feather_edits = pan.getIcon_feather_edit();
		lib.btnClick(icon_feather_edits);

		Thread.sleep(2000);
		WebElement title = pan.getTitle();
		lib.btnClick(title);
		Thread.sleep(2000);
		WebElement s1_depositortitles = pan.getS1_depositortitle();
		// lib.doubleClick(s1_depositortitles);
		Thread.sleep(2000);
		Select s = new Select(s1_depositortitles);
		s.selectByVisibleText(s1_depositortitle);

		Thread.sleep(2000);
		WebElement s1_depositorFNames = pan.getS1_depositorFName();
		s1_depositorFNames.sendKeys(s1_depositorFName);

		Thread.sleep(2000);
		WebElement s1_depositorMNames = pan.getS1_depositorMName();
		s1_depositorMNames.sendKeys(s1_depositorMName);

		Thread.sleep(2000);
		WebElement s1_depositorLNames = pan.getS1_depositorLName();
		s1_depositorLNames.sendKeys(s1_depositorLName);

		Thread.sleep(2000);
		WebElement s1_depositorDOB1 = pan.getS1_depositorDOB();
		s1_depositorDOB1.sendKeys(s1_depositorDOB);

		Thread.sleep(2000);
		WebElement s1_depositorEmails = pan.getS1_depositorEmail();
		s1_depositorEmails.sendKeys(s1_depositorEmail);

		Thread.sleep(2000);
		WebElement proceed_Button = pan.getProceed_Button();
		lib.scrollDown(proceed_Button);
		lib.btnClick(proceed_Button);
	}
	public void Payment_screen() throws Exception {
		LibGlobal lib=new LibGlobal();
		Pan_Details_Xpaths pan=new Pan_Details_Xpaths();
			
		Thread.sleep(2000);
		WebElement termsAndConditions = pan.getTermsAndConditions();
		lib.btnClick(termsAndConditions);

		Thread.sleep(2000);
		WebElement gotIt = pan.getGotIt();
		lib.btnClick(gotIt);

		Thread.sleep(2000);
		WebElement depositorTC = pan.getDepositorTC();
		lib.btnClick(depositorTC);

		Thread.sleep(2000);
		WebElement step_back_1 = pan.getStep_back_1();
		lib.btnClick(step_back_1);

		Thread.sleep(2000);
		WebElement proceed_Button = pan.getProceed_Button();
		lib.scrollDown(proceed_Button);
		lib.btnClick(proceed_Button);

		Thread.sleep(2000);
		WebElement failurekyc_pop = pan.getFailurekyc_pop();
		lib.btnClick(failurekyc_pop);
	}

	public void Ckyc_Page(String Documenttype, String documentNo, String up_ckyc_frontpic, String up_ckyc_backpic)
			throws Exception {
		LibGlobal lib = new LibGlobal();
		Ckyc_Page_Xpaths cp = new Ckyc_Page_Xpaths();

		Thread.sleep(2000);
		WebElement documenttype1 = cp.getDocumenttype();
		Select s = new Select(documenttype1);
		s.selectByVisibleText(Documenttype);

		Thread.sleep(2000);
		WebElement documentNo1 = cp.getDocumentNo();
		documentNo1.sendKeys(documentNo);

		Thread.sleep(2000);
		WebElement up_ckyc_frontpic1 = cp.getUp_ckyc_frontpic();
		up_ckyc_frontpic1.sendKeys(up_ckyc_frontpic);

		Thread.sleep(2000);
		WebElement up_ckyc_backpic1 = cp.getUp_ckyc_backpic();
		up_ckyc_backpic1.sendKeys(up_ckyc_backpic);

		Thread.sleep(2000);
		WebElement step_btn_2 = cp.getStep_btn_2();
		lib.btnClick(step_btn_2);
	}

	public void Personal_details_Page(String Profie_Upload, String s3_Documentnoo, String s3_idproof,
			String s3_addrline1, String s3_addrline2, String s3_area, String s3_city, String s3_state,
			String s3_pincode) throws Exception {

		LibGlobal lib = new LibGlobal();
		Personal_Details_Page_Xpaths pd = new Personal_Details_Page_Xpaths();
		Thread.sleep(3000);
		WebElement profie_Upload = pd.getProfie_Upload();
		profie_Upload.sendKeys(Profie_Upload);

		Thread.sleep(1500);
		// WebElement reuploaddiv = pd.getReuploaddiv();
		// lib.btnClick(reuploaddiv);

		Thread.sleep(1500);
		WebElement s3_Documentnoo1 = pd.getS3_Documentnoo();
		lib.scrollDown(s3_Documentnoo1);
		s3_Documentnoo1.sendKeys(s3_Documentnoo);

		WebElement s3_idproof1 = pd.getS3_idproof();
		s3_idproof1.sendKeys(s3_idproof);

		// Thread.sleep(1500);
		// WebElement address_Edit = pd.getAddress_Edit();
		// lib.btnClick(address_Edit);

		Thread.sleep(1500);
		WebElement s3_addrline11 = pd.getS3_addrline1();
		s3_addrline11.sendKeys(s3_addrline1);

		WebElement s3_addrline22 = pd.getS3_addrline2();
		s3_addrline22.sendKeys(s3_addrline2);
		Thread.sleep(1500);

		WebElement s3_area1 = pd.getS3_area();
		s3_area1.sendKeys(s3_area);

		Thread.sleep(1500);
		WebElement s3_city1 = pd.getS3_city();
		s3_city1.sendKeys(s3_city);

		Thread.sleep(1500);
		WebElement s3_state1 = pd.getS3_state();
		s3_state1.sendKeys(s3_state);

		Thread.sleep(1500);
		WebElement s3_pincode1 = pd.getS3_pincode();
		s3_pincode1.sendKeys(s3_pincode);

		Thread.sleep(1500);
		WebElement step_btn_3 = pd.getStep_btn_3();
		lib.btnClick(step_btn_3);
	}

	public void Bank_details(String s4_accountno, String s4_confaccountno, String banknn, String bal, String s4_ifsc,
			String s4_branch, String s4_bankname, String s4_acctype, String s4_accholdername) throws Exception {

		LibGlobal lib = new LibGlobal();
		Bank_details_xpaths bd = new Bank_details_xpaths();
		WebElement s4_accountno1 = bd.getS4_accountno();
		s4_accountno1.sendKeys(s4_accountno);

		Thread.sleep(1500);
		WebElement s4_confaccountno1 = bd.getS4_confaccountno();
		s4_confaccountno1.sendKeys(s4_confaccountno);
		Thread.sleep(1500);
		WebElement eyeButton = bd.getEyeButton();
		lib.btnClick(eyeButton);

		Thread.sleep(1500);
		WebElement info_Icon = bd.getInfo_Icon();
		lib.btnClick(info_Icon);
		Thread.sleep(1500);
		WebElement info_done = bd.getInfo_done();
		lib.btnClick(info_done);

		Thread.sleep(1500);

		WebElement dont_Know_IFSC = bd.getDont_Know_IFSC();
		lib.btnClick(dont_Know_IFSC);

		Thread.sleep(1500);

		WebElement banknn1 = bd.getBanknn();
		banknn1.sendKeys(banknn);

		WebElement bal1 = bd.getBal();
		bal1.sendKeys(bal);

		WebElement done = bd.getDone();
		lib.btnClick(done);

		WebElement s4_ifsc1 = bd.getS4_ifsc();
		s4_ifsc1.sendKeys(s4_ifsc);
		Thread.sleep(1500);

		WebElement s4_branch1 = bd.getS4_branch();
		s4_branch1.sendKeys(s4_branch);

		WebElement s4_bankname1 = bd.getS4_bankname();
		s4_bankname1.sendKeys(s4_bankname);

		WebElement s4_acctype1 = bd.getS4_acctype();
		s4_acctype1.sendKeys(s4_acctype);

		WebElement s4_accholdername1 = bd.getS4_accholdername();
		s4_accholdername1.sendKeys(s4_accholdername);

		Thread.sleep(3000);

		WebElement step_btn_5 = bd.getStep_btn_5();
		lib.doubleClick(step_btn_5);
		lib.doubleClick(step_btn_5);
	}

	public void Additonal_Details_page(String s5_Occupation, String s5_Marital, String s5_Maturity_ins,
			String s5_spouseName, String s5_fatherName, String TDS_Certificate, String s5_taxact,
			String s5_FinancialYear, String s5_EstimatedIncome, String s5_esttotincome, String s5_formsfilled,
			String s5_AggregateAmount, String Add_Nominee, String s5_nomineeRelation, String s5_nomineetitle,
			String s5_nomineeFname, String s5_nomineeMname, String s5_nomineeLname, String s5_nomineeDOB,
			String Nominee_address_same_as_Applicant_address, String s5_nomadd1, String s5_nomadd2, String s5_nomarea,
			String s5_nomcity, String s5_nomstate, String s5_nompincode) throws Exception {

		LibGlobal lib = new LibGlobal();
		WebDriver driver = lib.driver;
		Additional_Details_Xpaths ad = new Additional_Details_Xpaths();

		WebElement s5_Occupation1 = ad.getS5_Occupation();
		s5_Occupation1.sendKeys(s5_Occupation);

		Thread.sleep(1500);
		WebElement s5_Marital1 = ad.getS5_Marital();
		s5_Marital1.sendKeys(s5_Marital);

		Thread.sleep(1500);
		WebElement s5_Maturity_ins1 = ad.getS5_Maturity_ins();
		s5_Maturity_ins1.sendKeys(s5_Maturity_ins);

		Thread.sleep(1500);
		WebElement s5_spouseName1 = ad.getS5_spouseName();
		s5_spouseName1.sendKeys(s5_spouseName);

		Thread.sleep(1500);
		WebElement s5_fatherName1 = ad.getS5_fatherName();
		s5_fatherName1.sendKeys(s5_fatherName);

		Thread.sleep(1500);
		String s1 = TDS_Certificate;
		System.out.println(TDS_Certificate);
		if (s1.equals("Yes")) {

			Thread.sleep(1500);
			WebElement tds_show = ad.getTds_show();
			lib.scrollDown(tds_show);
			lib.btnClick(tds_show);
			Thread.sleep(1500);

			WebElement s5_taxact1 = ad.getS5_taxact();
			s5_taxact1.sendKeys(s5_taxact);

			Thread.sleep(1000);
			WebElement s5_FinancialYear1 = ad.getS5_FinancialYear();
			s5_FinancialYear1.sendKeys(s5_FinancialYear);

			Thread.sleep(1000);
			WebElement s5_EstimatedIncome1 = ad.getS5_EstimatedIncome();
			s5_EstimatedIncome1.sendKeys(s5_EstimatedIncome);

			Thread.sleep(1000);
			WebElement s5_esttotincome1 = ad.getS5_esttotincome();
			s5_esttotincome1.sendKeys(s5_esttotincome);
			Thread.sleep(1000);

			WebElement s5_formsfilled1 = ad.getS5_formsfilled();
			s5_formsfilled1.sendKeys(s5_formsfilled);
			Thread.sleep(1000);

			WebElement s5_AggregateAmount1 = ad.getS5_AggregateAmount();
			s5_AggregateAmount1.sendKeys(s5_AggregateAmount);
		}
		String text = Add_Nominee;
		if (text.equals("Yes")) {
			
			Thread.sleep(1500);
			WebElement s5_nomineeRelation1 = ad.getS5_nomineeRelation();
			lib.scrollDown(s5_nomineeRelation1);
			Thread.sleep(1500);
			
			WebElement nomineeshow = ad.getNomineeshow();
			lib.scrollDown(nomineeshow);
			Thread.sleep(1500);
			
			s5_nomineeRelation1.sendKeys(s5_nomineeRelation);

			Thread.sleep(1500);
			WebElement s5_nomineetitle1 = ad.getS5_nomineetitle();
			s5_nomineetitle1.sendKeys(s5_nomineetitle);

			Thread.sleep(1500);
			WebElement s5_nomineeFname1 = ad.getS5_nomineeFname();
			s5_nomineeFname1.sendKeys(s5_nomineeFname);

			Thread.sleep(1500);
			WebElement s5_nomineeMname1 = ad.getS5_nomineeMname();
			s5_nomineeMname1.sendKeys(s5_nomineeMname);

			Thread.sleep(1500);
			WebElement s5_nomineeLname1 = ad.getS5_nomineeLname();
			s5_nomineeLname1.sendKeys(s5_nomineeLname);

			Thread.sleep(1000);
			WebElement s5_nomineeDOB1 = ad.getS5_nomineeDOB();
			s5_nomineeDOB1.sendKeys(s5_nomineeDOB);
		}
		String same_Nominee = Nominee_address_same_as_Applicant_address;
		if (same_Nominee.equals("No")) {

			Thread.sleep(2000);
			WebElement nomineeaddshow = ad.getNomineeaddshow();
			lib.scrollDown(nomineeaddshow);

			Thread.sleep(1500);
			WebElement s5_nomadd11 = ad.getS5_nomadd1();
			s5_nomadd11.sendKeys(s5_nomadd1);
			Thread.sleep(1000);

			WebElement s5_nomadd22 = ad.getS5_nomadd2();
			s5_nomadd22.sendKeys(s5_nomadd2);

			Thread.sleep(1500);
			WebElement s5_nomarea1 = ad.getS5_nomarea();
			s5_nomarea1.sendKeys(s5_nomarea);

			Thread.sleep(1000);
			WebElement s5_nomcity1 = ad.getS5_nomcity();
			s5_nomcity1.sendKeys(s5_nomcity);

			WebElement s5_nomstate1 = ad.getS5_nomstate();
			s5_nomstate1.sendKeys(s5_nomstate);

			Thread.sleep(1500);
			WebElement s5_nompincode1 = ad.getS5_nompincode();
			s5_nompincode1.sendKeys(s5_nompincode);
		}
		WebDriverWait wait = new WebDriverWait(driver, 150);
		WebElement step_btn_6 = ad.getStep_btn_6();
		wait.until(ExpectedConditions.visibilityOf(step_btn_6));
		lib.btnClick(step_btn_6);

	}
}
