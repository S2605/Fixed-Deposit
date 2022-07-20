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
import X_Paths.Minor_Pan_Xpaths;
import X_Paths.Pan_Details_Xpaths;
import X_Paths.PennyDrop_Xpaths;
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
			Thread.sleep(5000);
			WebElement mobileNo2 = lp.getMobileNo();
			lib.scrollDown(mobileNo2);
			Thread.sleep(2000);
			mobileNo2.sendKeys(MobileNo);
			Thread.sleep(2000);
			int parseInt = Integer.parseInt(INDEX);
			// Excel_Utility.writeinexcel("PASS", parseInt);
			String ex = "mobile validation pass in ";
			String concat11 = ex.concat(titleName1);
			test.log(LogStatus.PASS, concat11);
		} catch (Exception e) {
			e.printStackTrace();
			int parseInt = Integer.parseInt(INDEX);
//			Excel_Utility.writeinexcel("FAIL", parseInt);
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
			// Excel_Utility.writeinexcel("PASS", parseInt);
			String ex = "Pincode validation pass in ";
			String concat11 = ex.concat(titleName1);
			test.log(LogStatus.PASS, concat11);
		} catch (Exception e) {

			e.printStackTrace();
			int parseInt = Integer.parseInt(INDEX);
//			Excel_Utility.writeinexcel("FAIL", parseInt);
			String ex = "Pincode validation Fail in ";
			String titleName1 = Iteration;
			String concat11 = ex.concat(titleName1);
			test.log(LogStatus.FAIL, concat11);
		}

	}

	public void EmailId_Validation(String EmailId, ExtentReports report, ExtentTest test, String Iteration,
			String INDEX) throws Exception {
		try {
			int parseInt = Integer.parseInt(INDEX);
			String titleName;
			titleName = "EmailID validation start";
			String titleName1 = Iteration;
			String concat1 = titleName.concat(titleName1);
			test = report.startTest(concat1);
			LibGlobal lib = new LibGlobal();
			LandingPage_Xpaths lp = new LandingPage_Xpaths();
			WebElement emailID = lp.getEmailID();
			emailID.sendKeys(EmailId);
			Thread.sleep(2000);
			WebElement invest_now_button = lp.getInvest_now_button();
			lib.btnClick(invest_now_button);

			// Excel_Utility.writeinexcel("PASS", parseInt);
			String ex = "Email validation pass in ";
			String concat11 = ex.concat(titleName1);
			// test.log(LogStatus.PASS, concat11);
		} catch (Exception e) {
			e.printStackTrace();
			int parseInt = Integer.parseInt(INDEX);
//			Excel_Utility.writeinexcel("FAIL", parseInt);
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
			LibGlobal lib = new LibGlobal();
			LandingPage_Xpaths lp = new LandingPage_Xpaths();
			Thread.sleep(2000);
			WebElement invest_now_button = lp.getInvest_now_button();
			lib.btnClick(invest_now_button);
			Thread.sleep(2000);
			WebElement verifyOtp1 = lp.getVerifyOtp();
			verifyOtp1.sendKeys(verifyOtp);
			Thread.sleep(2000);
			WebElement verifyOtpSubmit = lp.getVerifyOtpSubmit();
			lib.btnClick(verifyOtpSubmit);
			Thread.sleep(5000);
			int parseInt = Integer.parseInt(INDEX);
			// Excel_Utility.writeinexcel("PASS", parseInt);
			String ex = "OTP_validation pass in ";
			String concat11 = ex.concat(titleName1);
			test.log(LogStatus.PASS, concat11);
		} catch (Exception e) {
			e.printStackTrace();
			int parseInt = Integer.parseInt(INDEX);
//			Excel_Utility.writeinexcel("FAIL", parseInt);
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
			Thread.sleep(2000);
			WebElement select_Interest_Payout2 = sd.getSelect_Interest_Payout();
			Select s = new Select(select_Interest_Payout2);
			s.selectByVisibleText(Select_Interest_Payout);
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
			// Excel_Utility.writeinexcel("PASS", parseInt);
			String ex = "Scheme details page Pass in ";
			String concat11 = ex.concat(titleName1);
			test.log(LogStatus.PASS, concat11);
		} catch (Exception e) {
			e.printStackTrace();
			int parseInt = Integer.parseInt(INDEX);
//			Excel_Utility.writeinexcel("FAIL", parseInt);
			String ex = "Scheme details page   Fail in ";
			String titleName1 = Iteration;
			String concat11 = ex.concat(titleName1);
			test.log(LogStatus.FAIL, concat11);
		}
	}

	public void Pan_Details_Page(String s1_depositorPAN, String s1_depositortitle, String s1_depositorFName,
			String s1_depositorMName, String s1_depositorLName, String s1_depositorEmail, String s1_depositorDOB,
			String Iteration, String INDEX, ExtentTest test) throws Exception {

		try {
			LibGlobal lib = new LibGlobal();
			Pan_Details_Xpaths pan = new Pan_Details_Xpaths();
			Thread.sleep(3000);
			WebElement s1_depositorPANn = pan.getS1_depositorPAN();
			s1_depositorPANn.sendKeys(s1_depositorPAN);

			Thread.sleep(10000);
			WebElement icon_feather_edits = pan.getIcon_feather_edit();
			lib.doubleClick(icon_feather_edits);

			
			Thread.sleep(2000);
//			WebElement s1_depositortitles = pan.getS1_depositortitle();
//			Select s = new Select(s1_depositortitles);
//			s.selectByVisibleText(s1_depositortitle);

			// Thread.sleep(2000);
			// WebElement s1_depositorFNames = pan.getS1_depositorFName();
			// s1_depositorFNames.sendKeys(s1_depositorFName);

			Thread.sleep(2000);
			WebElement s1_depositorMNames = pan.getS1_depositorMName();
			s1_depositorMNames.sendKeys(s1_depositorMName);

			// Thread.sleep(2000);
			// WebElement s1_depositorLNames = pan.getS1_depositorLName();
			// s1_depositorLNames.sendKeys(s1_depositorLName);

			// Thread.sleep(2000);
			// WebElement s1_depositorDOB1 = pan.getS1_depositorDOB();
			// s1_depositorDOB1.sendKeys(s1_depositorDOB);

			Thread.sleep(2000);
//			WebElement s1_depositorEmails = pan.getS1_depositorEmail();
//			s1_depositorEmails.sendKeys(s1_depositorEmail);

			Thread.sleep(2000);
			WebElement proceed_Button = pan.getProceed_Button();
			lib.scrollDown(proceed_Button);
			lib.btnClick(proceed_Button);
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
			int parseInt = Integer.parseInt(INDEX);
//			Excel_Utility.writeinexcel("FAIL", parseInt);
			String ex = "PAN details page   Fail in ";
			String titleName1 = Iteration;
			String concat11 = ex.concat(titleName1);
			test.log(LogStatus.FAIL, concat11);
		}

	}

	public void Guardian_Pan_Flow(String s1_depositorGuardianPAN, String s1_depositorGuardianMName,
			String s1_depositorGuardianEmail) throws Exception {

		LibGlobal lib = new LibGlobal();
		Minor_Pan_Xpaths minor = new Minor_Pan_Xpaths();
		WebElement s1_depositorGuardianPAN1 = minor.getS1_depositorGuardianPAN();
		s1_depositorGuardianPAN1.sendKeys(s1_depositorGuardianPAN);

		Thread.sleep(5000);
		WebElement guardian_Edit = minor.getGuardian_Edit();
		lib.btnClick(guardian_Edit);
		
		WebElement s1_depositorGuardianMName1 = minor.getS1_depositorGuardianMName();
		s1_depositorGuardianMName1.sendKeys(s1_depositorGuardianMName);

		WebElement s1_depositorGuardianEmail1 = minor.getS1_depositorGuardianEmail();
		s1_depositorGuardianEmail1.sendKeys(s1_depositorGuardianEmail);

		WebElement step_gar_btn_1 = minor.getStep_gar_btn_1();
		lib.btnClick(step_gar_btn_1);
	}

	public void Payment_screen(String Iteration, String INDEX, ExtentTest test) throws Exception {
		try {
			LibGlobal lib = new LibGlobal();
			Pan_Details_Xpaths pan = new Pan_Details_Xpaths();

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
			// WebElement step_back_1 = pan.getStep_back_1();
			// lib.btnClick(step_back_1);

			Thread.sleep(2000);

			// lib.scrollDown(proceed_Button);
			// lib.btnClick(proceed_Button);

			Thread.sleep(2000);
			WebElement failurekyc_pop = pan.getFailurekyc_pop();
			lib.btnClick(failurekyc_pop);
			Thread.sleep(5000);

			WebElement netBanking = pan.getNetBanking();
			lib.btnClick(netBanking);

			Thread.sleep(2000);
			WebElement hdfc = pan.getHDFC();
			lib.btnClick(hdfc);

			Thread.sleep(2000);
			WebElement pay = pan.getPAY();
			lib.btnClick(pay);

			Thread.sleep(5000);
			WebElement sucessful = pan.getSucessful();
			lib.btnClick(sucessful);

			Thread.sleep(5000);
			WebElement star = pan.getStar();
			lib.btnClick(star);

			WebElement paymentSuccess = pan.getPaymentSuccess();
			lib.btnClick(paymentSuccess);

			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
			int parseInt = Integer.parseInt(INDEX);
//			Excel_Utility.writeinexcel("FAIL", parseInt);
			String ex = "Payment page   Fail in ";
			String titleName1 = Iteration;
			String concat11 = ex.concat(titleName1);
			test.log(LogStatus.FAIL, concat11);
		}

	}

	public void Ckyc_Page(String Documenttype, String DocumentNo, String up_ckyc_frontpic, String up_ckyc_backpic,
			String Iteration, String INDEX, ExtentTest test) throws Exception {
		try {
			LibGlobal lib = new LibGlobal();
			Ckyc_Page_Xpaths cp = new Ckyc_Page_Xpaths();

			Thread.sleep(4000);
			WebElement documenttype1 = cp.getDocumenttype();
//            lib.doubleClick(documenttype1);
//            documenttype1.sendKeys(Keys.ARROW_DOWN);
//            documenttype1.sendKeys(Keys.ENTER);
			Select s = new Select(documenttype1);
			s.selectByVisibleText(Documenttype);
			s.selectByVisibleText("PASSPORT");

			Thread.sleep(2000);
			WebElement documentNo1 = cp.getDocumentNo();
			documentNo1.sendKeys(DocumentNo);

			Thread.sleep(2000);
			WebElement up_ckyc_frontpic1 = cp.getUp_ckyc_frontpic();
			up_ckyc_frontpic1.sendKeys(up_ckyc_frontpic);

			Thread.sleep(2000);
			WebElement up_ckyc_backpic1 = cp.getUp_ckyc_backpic();
			up_ckyc_backpic1.sendKeys(up_ckyc_backpic);

			Thread.sleep(2000);
			WebElement step_btn_2 = cp.getStep_btn_2();
			lib.btnClick(step_btn_2);
		} catch (Exception e) {
			e.printStackTrace();
			int parseInt = Integer.parseInt(INDEX);
//			Excel_Utility.writeinexcel("FAIL", parseInt);
			String ex = "CKYC page Fail in ";
			String titleName1 = Iteration;
			String concat11 = ex.concat(titleName1);
			test.log(LogStatus.FAIL, concat11);
		}
	}

	public void Personal_details_Page(String Profie_Upload, String s3_Documentnoo, String s3_idproof,
			String s3_addrline1, String s3_addrline2, String s3_area, String s3_city, String s3_state,
			String s3_pincode, String INDEX, String Iteration, ExtentTest test) throws Exception {

		try {
			LibGlobal lib = new LibGlobal();
			WebDriver driver = lib.driver;
			Personal_Details_Page_Xpaths pd = new Personal_Details_Page_Xpaths();

			Thread.sleep(1500);

			WebElement address_Edit = pd.getAddress_Edit();
			lib.scrollDown(address_Edit);
			lib.btnClick(address_Edit);

			Thread.sleep(1500);

			WebElement profie_Upload = pd.getProfie_Upload();
			profie_Upload.sendKeys(Profie_Upload);

			Thread.sleep(1500);
			WebElement s3_addrline11 = pd.getS3_addrline1();
			s3_addrline11.sendKeys(s3_addrline1);

			Thread.sleep(1500);
			WebElement s3_addrline22 = pd.getS3_addrline2();
			s3_addrline22.sendKeys(s3_addrline2);
			Thread.sleep(1500);

			WebElement s3_pincode1 = pd.getS3_pincode();
			s3_pincode1.sendKeys(s3_pincode);

			WebElement s3_area1 = pd.getS3_area();
			s3_area1.sendKeys(s3_area);

			Thread.sleep(1500);
			WebElement s3_city1 = pd.getS3_city();
			s3_city1.sendKeys(s3_city);

			Thread.sleep(1500);
			WebElement s3_state1 = pd.getS3_state();
			s3_state1.sendKeys(s3_state);

			Thread.sleep(1500);
			WebElement step_btn_3 = pd.getStep_btn_3();
			lib.scrollDown(step_btn_3);
			lib.btnClick(step_btn_3);
		} catch (Exception e) {
			e.printStackTrace();
			int parseInt = Integer.parseInt(INDEX);
//			Excel_Utility.writeinexcel("FAIL", parseInt);
			String ex = "Personal detail page Fail in ";
			String titleName1 = Iteration;
			String concat11 = ex.concat(titleName1);
			test.log(LogStatus.FAIL, concat11);
		}
	}

	public void Bank_details(String s4_accountno, String s4_confaccountno, String banknn, String bal, String s4_ifsc,
			String s4_branch, String s4_bankname, String s4_acctype, String s4_accholdername, String ifsccodes,
			String Iteration, String INDEX, ExtentTest test) throws Exception {

		try {
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

			Thread.sleep(1500);
			WebElement bal1 = bd.getBal();
			bal1.sendKeys(bal);

			Thread.sleep(1500);
			WebElement ifsc_code_search = bd.getIfsc_code_search();
			lib.btnClick(ifsc_code_search);

			Thread.sleep(2000);

			WebElement ifsccodes1 = bd.getIfsccodes();
			ifsccodes1.sendKeys(ifsccodes);

			Thread.sleep(2000);
			lib.btnClick(ifsc_code_search);

			Thread.sleep(1500);
			WebElement s4_acctype1 = bd.getS4_acctype();
			s4_acctype1.sendKeys(s4_acctype);

			Thread.sleep(1500);
			WebElement s4_accholdername1 = bd.getS4_accholdername();
			s4_accholdername1.sendKeys(s4_accholdername);

			Thread.sleep(5000);
			WebElement uploaddivshow = bd.getUploaddivshow();
			lib.btnClick(uploaddivshow);
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
			int parseInt = Integer.parseInt(INDEX);
//			Excel_Utility.writeinexcel("FAIL", parseInt);
			String ex = "Bank details page Fail in ";
			String titleName1 = Iteration;
			String concat11 = ex.concat(titleName1);
			test.log(LogStatus.FAIL, concat11);
		}

	}

	public void pennyDrop(String ocrChkUpload, String Iteration, String INDEX, ExtentTest test) throws Exception {

		try {
			LibGlobal lib = new LibGlobal();
			PennyDrop_Xpaths penny = new PennyDrop_Xpaths();
			WebElement ocrChkUpload1 = penny.getOcrChkUpload();
			ocrChkUpload1.sendKeys(ocrChkUpload);

			Thread.sleep(3000);
			WebElement step_btn_5 = penny.getStep_btn_5();
			lib.btnClick(step_btn_5);
		} catch (Exception e) {
			e.printStackTrace();
			int parseInt = Integer.parseInt(INDEX);
//			Excel_Utility.writeinexcel("FAIL", parseInt);
			String ex = "Penny drop  page Fail in ";
			String titleName1 = Iteration;
			String concat11 = ex.concat(titleName1);
			test.log(LogStatus.FAIL, concat11);
		}
	}

	public void Additonal_Details_page(String s5_Occupation, String s5_Marital, String s5_Maturity_ins,
			String s5_spouseName, String s5_fatherName, String TDS_Certificate, String s5_taxact,
			String s5_FinancialYear, String s5_EstimatedIncome, String s5_esttotincome, String s5_formsfilled,
			String s5_AggregateAmount, String Add_Nominee, String s5_nomineeRelation, String s5_nomineetitle,
			String s5_nomineeFname, String s5_nomineeMname, String s5_nomineeLname, String s5_nomineeDOB,
			String Nominee_address_same_as_Applicant_address, String s5_nomadd1, String s5_nomadd2, String s5_nomarea,
			String s5_nomcity, String s5_nomstate, String s5_nompincode, String INDEX, String Iteration,
			ExtentTest test) throws Exception {

		try {
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
				lib.btnClick(nomineeshow);
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
				lib.btnClick(nomineeaddshow);

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

		} catch (Exception e) {
			e.printStackTrace();
			int parseInt = Integer.parseInt(INDEX);
//			Excel_Utility.writeinexcel("FAIL", parseInt);
			String ex = "Additional Details page Fail in ";
			String titleName1 = Iteration;
			String concat11 = ex.concat(titleName1);
			test.log(LogStatus.FAIL, concat11);
		}

	}
}
