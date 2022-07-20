package Pre_Execution;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import BaseClass.LibGlobal;
import Iteration.Excel_Utility;
import X_Paths.Additional_Details_Xpaths;
import X_Paths.Bank_details_xpaths;
import X_Paths.Ckyc_Page_Xpaths;
import X_Paths.Gaurdian_CKYC_Xpaths;
import X_Paths.Guardian_Personal_Details_Xpaths;
import X_Paths.LandingPage_Xpaths;
import X_Paths.Minor_Pan_Xpaths;
import X_Paths.Pan_Details_Xpaths;
import X_Paths.PennyDrop_Xpaths;
import X_Paths.Personal_Details_Page_Xpaths;
import X_Paths.Scheme_Details_Xpaths;
import X_Paths.Star_xpaths;

public class Coding_Class {

	public static void Landing_Page(String MobileNo, String PinCode, String EmailID, String VerifyOtp, String INDEX)
			throws Exception {

		try {
			LibGlobal lib = new LibGlobal();
			LandingPage_Xpaths lp = new LandingPage_Xpaths();

			Thread.sleep(3000);
			WebElement mobileNo = lp.getMobileNo();
			mobileNo.sendKeys(MobileNo);

			WebElement pinCode = lp.getPinCode();
			pinCode.sendKeys(PinCode);

			WebElement emailID = lp.getEmailID();
			emailID.sendKeys(EmailID);

			WebElement invest_now_button = lp.getInvest_now_button();
			lib.btnClick(invest_now_button);
			Thread.sleep(2000);

			WebElement verifyOtp = lp.getVerifyOtp();
			verifyOtp.sendKeys(VerifyOtp);

			Thread.sleep(2000);
			WebElement verifyOtpSubmit = lp.getVerifyOtpSubmit();
			lib.btnClick(verifyOtpSubmit);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			int parseInt = Integer.parseInt(INDEX);
			Excel_Utility.writeinexcel("FAIL", parseInt);
		}

	}

	public static void Scheme_Page(String Amount_input_fd, String Tenure_input_fd, String Select_Interest_Payout,
			String INDEX) throws Exception {

		try {
			LibGlobal lib = new LibGlobal();
			Scheme_Details_Xpaths scheme = new Scheme_Details_Xpaths();

			Thread.sleep(3000);
			WebElement amount_input_fd = scheme.getAmount_input_fd();
			amount_input_fd.clear();
			amount_input_fd.sendKeys(Amount_input_fd);
			amount_input_fd.sendKeys(Keys.ENTER);

			Thread.sleep(2000);
			WebElement tenure_info = scheme.getTenure_info();
			lib.btnClick(tenure_info);

			Thread.sleep(2000);
			WebElement tenure_info_done = scheme.getTenure_info_done();
			lib.btnClick(tenure_info_done);

			Thread.sleep(2000);
			WebElement tenure_input_fd = scheme.getTenure_input_fd();
			tenure_input_fd.clear();
			tenure_input_fd.sendKeys(Tenure_input_fd);
			tenure_input_fd.sendKeys(Keys.ENTER);

			Thread.sleep(2000);
			WebElement select_Interest_Payout_Info = scheme.getSelect_Interest_Payout_Info();
			lib.btnClick(select_Interest_Payout_Info);

			Thread.sleep(2000);
			WebElement select_Interest_Payout_Info_done = scheme.getSelect_Interest_Payout_Info_done();
			lib.btnClick(select_Interest_Payout_Info_done);

			Thread.sleep(2000);
			WebElement select_Interest_Payout = scheme.getSelect_Interest_Payout();
			lib.selectOptionByText(select_Interest_Payout, Select_Interest_Payout);

			Thread.sleep(2000);
			WebElement senior_citizen_info = scheme.getSenior_citizen_info();
			lib.btnClick(senior_citizen_info);

			Thread.sleep(2000);
			WebElement senior_citizen_info_done = scheme.getSenior_citizen_info_done();
			lib.btnClick(senior_citizen_info_done);

			Thread.sleep(2000);
			WebElement maturity_info = scheme.getMaturity_info();
			lib.btnClick(maturity_info);

			Thread.sleep(2000);
			WebElement maturity_info_done = scheme.getMaturity_info_done();
			lib.btnClick(maturity_info_done);

			Thread.sleep(2000);
			WebElement poppular_picks_info = scheme.getPoppular_picks_info();
			lib.btnClick(poppular_picks_info);

			Thread.sleep(2000);
			WebElement poppular_picks_info_done = scheme.getPoppular_picks_info_done();
			lib.btnClick(poppular_picks_info_done);

			Thread.sleep(3000);
			WebElement apply_investbtn = scheme.getApply_investbtn();
			lib.scrollDown(apply_investbtn);
			lib.btnClick(apply_investbtn);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.printStackTrace();
			int parseInt = Integer.parseInt(INDEX);
			Excel_Utility.writeinexcel("FAIL", parseInt);
		}

	}

	public static void Pan_details_Page(String S1_depositorPAN, String S1_depositorMName, String S1_depositorEmail,
			String INDEX) throws Exception {

		try {
			LibGlobal lib = new LibGlobal();
			Pan_Details_Xpaths pan = new Pan_Details_Xpaths();

			Thread.sleep(3000);
			WebElement s1_depositorPAN = pan.getS1_depositorPAN();
			s1_depositorPAN.sendKeys(S1_depositorPAN);

			Thread.sleep(5000);
			WebElement icon_feather_edit = pan.getIcon_feather_edit();
			lib.btnClick(icon_feather_edit);

			WebElement s1_depositorMName = pan.getS1_depositorMName();
			s1_depositorMName.sendKeys(S1_depositorMName);

			// WebElement s1_depositorEmail = pan.getS1_depositorEmail();
			// s1_depositorEmail.sendKeys(S1_depositorEmail);

			Thread.sleep(2000);
			WebElement proceed_Button = pan.getProceed_Button();
			lib.scrollDown(proceed_Button);
			lib.btnClick(proceed_Button);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.printStackTrace();
			int parseInt = Integer.parseInt(INDEX);
			Excel_Utility.writeinexcel("FAIL", parseInt);
		}
	}

	public static void Guardian_Pan_Page(String S1_depositorGuardianPAN, String S1_depositorGuardianMName,
			String S1_depositorGuardianEmail) throws Exception {
		LibGlobal lib = new LibGlobal();
		Minor_Pan_Xpaths minor = new Minor_Pan_Xpaths();
		Thread.sleep(3000);
		WebElement s1_depositorGuardianPAN = minor.getS1_depositorGuardianPAN();
		s1_depositorGuardianPAN.sendKeys(S1_depositorGuardianPAN);

		WebElement guardian_Edit = minor.getGuardian_Edit();
		lib.btnClick(guardian_Edit);

		WebElement s1_depositorGuardianMName = minor.getS1_depositorGuardianMName();
		s1_depositorGuardianMName.sendKeys(S1_depositorGuardianMName);

		WebElement s1_depositorGuardianEmail = minor.getS1_depositorGuardianEmail();
		s1_depositorGuardianEmail.sendKeys(S1_depositorGuardianEmail);

		Thread.sleep(2000);
		WebElement step_gar_btn_1 = minor.getStep_gar_btn_1();
		lib.btnClick(step_gar_btn_1);

	}

	public static void Payment_Screen(String INDEX) throws Exception {

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
			WebElement deposit_Summary_Edit = pan.getDeposit_Summary_Edit();
			lib.btnClick(deposit_Summary_Edit);

			Thread.sleep(2000);
			Scheme_Details_Xpaths scheme = new Scheme_Details_Xpaths();
			WebElement apply_investbtn2 = scheme.getApply_investbtn2();
			lib.scrollDown(apply_investbtn2);
			lib.btnClick(apply_investbtn2);

			Thread.sleep(2000);
			WebElement depositorTC = pan.getDepositorTC();
			lib.btnClick(depositorTC);

			Thread.sleep(2000);
			WebElement failurekyc_pop = pan.getFailurekyc_pop();
			lib.btnClick(failurekyc_pop);

			Thread.sleep(5000);
			WebElement netBanking = pan.getNetBanking();
			lib.scrollDown(netBanking);
			lib.btnClick(netBanking);

			Thread.sleep(4000);
			WebElement hdfc = pan.getHDFC();
			lib.btnClick(hdfc);

			
			WebElement pay = pan.getPAY();
			lib.ExplicitWait(pay);
			lib.scrollDown(pay);
			lib.btnClick(pay);

			Thread.sleep(5000);
			WebElement sucessful = pan.getSucessful();
			lib.btnClick(sucessful);

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.printStackTrace();
			int parseInt = Integer.parseInt(INDEX);
			Excel_Utility.writeinexcel("FAIL", parseInt);
		}

	}
	public static  void Congragulations_screen() throws Exception {
		
		LibGlobal lib=new  LibGlobal();
		
		Star_xpaths s=new Star_xpaths();
		
		Thread.sleep(3000);
		WebElement star = s.getStar();
		lib.btnClick(star);
		
		Thread.sleep(3000);
		WebElement paymentSuccess = s.getPaymentSuccess();
        lib.btnClick(paymentSuccess);
	   
		
	}

	public static void Ckyc_Fail_Page(String Documenttype, String INDEX, String DocumentNo, String Up_ckyc_frontpic,
			String Up_ckyc_backpic) throws Exception {

		try {
			LibGlobal lib = new LibGlobal();
			Ckyc_Page_Xpaths ck = new Ckyc_Page_Xpaths();

			Thread.sleep(3000);

			WebElement documenttype = ck.getDocumenttype();
			lib.selectOptionByText(documenttype, Documenttype);

			Thread.sleep(1500);
			WebElement documentNo = ck.getDocumentNo();
			documentNo.sendKeys(DocumentNo);

			Thread.sleep(2000);
			WebElement up_ckyc_frontpic1 = ck.getUp_ckyc_frontpic();
			up_ckyc_frontpic1.sendKeys(Up_ckyc_frontpic);

			Thread.sleep(2000);
			WebElement up_ckyc_backpic1 = ck.getUp_ckyc_backpic();
			up_ckyc_backpic1.sendKeys(Up_ckyc_backpic);

			Thread.sleep(2000);
			WebElement step_btn_2 = ck.getStep_btn_2();
			lib.btnClick(step_btn_2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			int parseInt = Integer.parseInt(INDEX);
			Excel_Utility.writeinexcel("FAIL", parseInt);
		}

	}

	public static void Gaurdian_Ckyc_fail(String Guard_Documenttype, String Guard_DocumentNo,
			String Guard_up_ckyc_frontpic, String Guard_up_ckyc_backpic) throws Exception {
		LibGlobal lib = new LibGlobal();
		Gaurdian_CKYC_Xpaths gaurd = new Gaurdian_CKYC_Xpaths();
		WebElement guard_Documenttype = gaurd.getGuard_Documenttype();
		guard_Documenttype.sendKeys(Guard_Documenttype);

		Thread.sleep(2000);
		WebElement guard_DocumentNo = gaurd.getGuard_DocumentNo();
		guard_DocumentNo.sendKeys(Guard_DocumentNo);

		Thread.sleep(2000);
		WebElement guard_up_ckyc_frontpic = gaurd.getGuard_up_ckyc_frontpic();
		guard_up_ckyc_frontpic.sendKeys(Guard_up_ckyc_frontpic);

		Thread.sleep(2000);
		WebElement guard_up_ckyc_backpic = gaurd.getGuard_up_ckyc_backpic();
		guard_up_ckyc_backpic.sendKeys(Guard_up_ckyc_backpic);

		Thread.sleep(2000);
		WebElement step_btn_upload_guardian = gaurd.getStep_btn_upload_guardian();
		lib.scrollDown(step_btn_upload_guardian);
		lib.btnClick(step_btn_upload_guardian);
	}

	public static void Personal_Details_Page(String S3_addrline1, String S3_addrline2, String S3_pincode,
			String Profie_Upload, String INDEX) throws Exception {
		try {
			LibGlobal lib = new LibGlobal();
			Thread.sleep(3000);
			Personal_Details_Page_Xpaths pr = new Personal_Details_Page_Xpaths();
			WebElement address_Edit = pr.getAddress_Edit();
			lib.scrollDown(address_Edit);
			lib.btnClick(address_Edit);

			Thread.sleep(1500);
			WebElement s3_addrline1 = pr.getS3_addrline1();
			s3_addrline1.sendKeys(S3_addrline1);

			Thread.sleep(1500);
			WebElement s3_addrline2 = pr.getS3_addrline2();
			s3_addrline2.sendKeys(S3_addrline2);

			Thread.sleep(1500);
			WebElement s3_pincode = pr.getS3_pincode();
			s3_pincode.sendKeys(S3_pincode);

			Thread.sleep(1500);
			WebElement profie_Upload = pr.getProfie_Upload();
			lib.scrollUp(profie_Upload);
			profie_Upload.sendKeys(Profie_Upload);

			Thread.sleep(1500);
			WebElement step_btn_3 = pr.getStep_btn_3();
			lib.scrollDown(step_btn_3);
			lib.btnClick(step_btn_3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.printStackTrace();
			int parseInt = Integer.parseInt(INDEX);
			Excel_Utility.writeinexcel("FAIL", parseInt);
		}
	}

	public static void Gaurdian_Personal_details_Page(String S3_guard_addrline1, String S3_guard_addrline2,
			String S3_guard_pincode, String Guardian_photo) throws Exception {
		LibGlobal lib = new LibGlobal();
		Guardian_Personal_Details_Xpaths gpd = new Guardian_Personal_Details_Xpaths();
		WebElement s3_guard_addrline1 = gpd.getS3_guard_addrline1();
		s3_guard_addrline1.sendKeys(S3_guard_addrline1);

		WebElement s3_guard_addrline2 = gpd.getS3_guard_addrline2();
		s3_guard_addrline2.sendKeys(S3_guard_addrline2);

		WebElement s3_guard_pincode = gpd.getS3_guard_pincode();
		s3_guard_pincode.sendKeys(S3_guard_pincode);

		WebElement guardian_photo = gpd.getGuardian_photo();
		lib.scrollUp(guardian_photo);
		guardian_photo.sendKeys(Guardian_photo);

		WebElement step_btn_guardian = gpd.getStep_btn_guardian();
		lib.scrollDown(step_btn_guardian);
		lib.btnClick(step_btn_guardian);

	}

	public static void Bank_Page(String S4_accountno, String S4_confaccountno, String Banknn, String Bal,
			String Ifsccodes, String S4_acctype, String S4_accholdername, String INDEX) throws Exception {

		try {
			Thread.sleep(3000);
			LibGlobal lib = new LibGlobal();
			Bank_details_xpaths bd = new Bank_details_xpaths();
			WebElement s4_accountno1 = bd.getS4_accountno();
			s4_accountno1.sendKeys(S4_accountno);

			Thread.sleep(1500);
			WebElement s4_confaccountno1 = bd.getS4_confaccountno();
			s4_confaccountno1.sendKeys(S4_confaccountno);

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
			banknn1.sendKeys(Banknn);

			Thread.sleep(1500);
			WebElement bal1 = bd.getBal();
			bal1.sendKeys(Bal);

			Thread.sleep(1500);
			WebElement ifsc_code_search = bd.getIfsc_code_search();
			lib.btnClick(ifsc_code_search);

			Thread.sleep(2000);

			WebElement ifsccodes1 = bd.getIfsccodes();
			ifsccodes1.sendKeys(Ifsccodes);

			Thread.sleep(2000);
			lib.btnClick(ifsc_code_search);

			Thread.sleep(1500);
			WebElement s4_acctype1 = bd.getS4_acctype();
			s4_acctype1.sendKeys(S4_acctype);

			Thread.sleep(1500);
			WebElement s4_accholdername1 = bd.getS4_accholdername();
			s4_accholdername1.sendKeys(S4_accholdername);
			//// Thread.sleep(5000);
			//// WebElement uploaddivshow = bd.getUploaddivshow();
			//// lib.btnClick(uploaddivshow);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.printStackTrace();
			int parseInt = Integer.parseInt(INDEX);
			Excel_Utility.writeinexcel("FAIL", parseInt);
		}
	}

	public static void pennyDrop(String OcrChkUpload, String S4_accountno1, String S4_confaccountno1, String Banknn1,
			String Bal1, String Ifsccodes1, String S4_acctype1, String S4_accholdername1, String INDEX)
			throws Exception {

		try {
			LibGlobal lib = new LibGlobal();
			PennyDrop_Xpaths penny = new PennyDrop_Xpaths();
			WebElement ocrChkUpload1 = penny.getOcrChkUpload();
			ocrChkUpload1.sendKeys(OcrChkUpload);

			Thread.sleep(3000);
			WebElement step_btn_5 = penny.getStep_btn_5();
			lib.btnClick(step_btn_5);

			Thread.sleep(3000);
			Bank_details_xpaths bd = new Bank_details_xpaths();
			WebElement s4_accountno1 = bd.getS4_accountno();
			s4_accountno1.sendKeys(S4_accountno1);

			Thread.sleep(3000);
			Thread.sleep(1500);
			WebElement s4_confaccountno1 = bd.getS4_confaccountno();
			s4_confaccountno1.sendKeys(S4_confaccountno1);

			Thread.sleep(3000);
			WebElement dont_Know_IFSC = bd.getDont_Know_IFSC();
			lib.btnClick(dont_Know_IFSC);

			Thread.sleep(1500);
			WebElement banknn1 = bd.getBanknn();
			banknn1.sendKeys(Banknn1);

			Thread.sleep(1500);
			WebElement bal1 = bd.getBal();
			bal1.sendKeys(Bal1);

			Thread.sleep(1500);
			WebElement ifsc_code_search = bd.getIfsc_code_search();
			lib.btnClick(ifsc_code_search);

			Thread.sleep(2000);
			WebElement ifsccodes1 = bd.getIfsccodes();
			ifsccodes1.sendKeys(Ifsccodes1);

			Thread.sleep(2000);
			lib.btnClick(ifsc_code_search);

			Thread.sleep(1500);
			WebElement s4_acctype1 = bd.getS4_acctype();
			s4_acctype1.sendKeys(S4_acctype1);

			Thread.sleep(1500);
			WebElement s4_accholdername1 = bd.getS4_accholdername();
			s4_accholdername1.sendKeys(S4_accholdername1);
			Thread.sleep(3000);
			lib.scrollDown(step_btn_5);
			lib.btnClick(step_btn_5);
		} catch (Exception e) {
			e.printStackTrace();
			e.printStackTrace();
			int parseInt = Integer.parseInt(INDEX);
			Excel_Utility.writeinexcel("FAIL", parseInt);

		}
	}

	public static void Additonal_Details_page(String S5_Occupation, String Others, String S5_othersNmae,
			String Marital_Status, String S5_Marital, String S5_Maturity_ins, String S5_spouseName,
			String S5_fatherName, String TDS_Certificate, String S5_taxact, String S5_FinancialYear,
			String S5_EstimatedIncome, String S5_esttotincome, String S5_formsfilled, String S5_AggregateAmount,
			String Add_Nominee, String S5_nomineeRelation, String S5_nomineetitle, String s5_nomineeFname,
			String S5_nomineeFname, String S5_nomineeLname, String S5_nomineeDOB,
			String Nominee_address_same_as_Applicant_address, String S5_nomadd1, String S5_nomadd2, String S5_nomarea,
			String S5_nomcity, String S5_nomstate, String S5_nompincode, String INDEX) throws Exception {

		try {
			LibGlobal lib = new LibGlobal();
			WebDriver driver = lib.driver;

			Additional_Details_Xpaths ad = new Additional_Details_Xpaths();

			Thread.sleep(4000);
			WebElement s5_Occupation1 = ad.getS5_Occupation();
			s5_Occupation1.sendKeys(S5_Occupation);

			Thread.sleep(3000);

			WebElement s5_Marital1 = ad.getS5_Marital();
			lib.btnClick(s5_Marital1);
			Thread.sleep(1500);
			s5_Marital1.sendKeys(Keys.ARROW_DOWN);
			s5_Marital1.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1500);
			s5_Marital1.sendKeys(Keys.ENTER);
			
//			s5_Marital1.sendKeys(S5_Marital);
			Thread.sleep(3000);
			WebElement s5_Maturity_ins2 = ad.getS5_Maturity_ins();
			lib.btnClick(s5_Maturity_ins2);
			Thread.sleep(1500);
			s5_Maturity_ins2.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1500);
			s5_Maturity_ins2.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			String s = Others;
//			if (s.equals("Yes")) {

				WebElement s5_othersNmae = ad.getS5_othersNmae();
				s5_othersNmae.sendKeys("Farmer");

//			}
			Thread.sleep(2000);
			String ss = Marital_Status;
//			if (ss.equals("Yes")) {
				Thread.sleep(1500);
				WebElement s5_spouseName1 = ad.getS5_spouseName();
				s5_spouseName1.sendKeys("Sath");

//			}
//			Thread.sleep(1500);
//			WebElement s5_fatherName1 = ad.getS5_fatherName();
//			s5_fatherName1.sendKeys(S5_fatherName);

//			Thread.sleep(1500);
//			String s1 = TDS_Certificate;
//			System.out.println(TDS_Certificate);
//
//			if (s1.equals("Yes")) {
//
//				Thread.sleep(1500);
//				WebElement tds_show = ad.getTds_show();
//				lib.scrollDown(tds_show);
//				lib.btnClick(tds_show);
//				Thread.sleep(1500);
//
//				WebElement s5_taxact1 = ad.getS5_taxact();
//				s5_taxact1.sendKeys(S5_taxact);
//
//				Thread.sleep(1000);
//				WebElement s5_FinancialYear1 = ad.getS5_FinancialYear();
//				s5_FinancialYear1.sendKeys(S5_FinancialYear);
//
//				Thread.sleep(1000);
//				WebElement s5_EstimatedIncome1 = ad.getS5_EstimatedIncome();
//				s5_EstimatedIncome1.sendKeys(S5_EstimatedIncome);
//
//				Thread.sleep(1000);
//				WebElement s5_esttotincome1 = ad.getS5_esttotincome();
//				s5_esttotincome1.sendKeys(S5_esttotincome);
//				Thread.sleep(1000);
//
//				WebElement s5_formsfilled1 = ad.getS5_formsfilled();
//				s5_formsfilled1.sendKeys(S5_formsfilled);
//				Thread.sleep(1000);
//
//				WebElement s5_AggregateAmount1 = ad.getS5_AggregateAmount();
//				s5_AggregateAmount1.sendKeys(S5_AggregateAmount);
//			}
//
//			String text = Add_Nominee;
//			if (text.equals("Yes")) {
//
//				Thread.sleep(1500);
//				WebElement s5_nomineeRelation1 = ad.getS5_nomineeRelation();
//				lib.scrollDown(s5_nomineeRelation1);
//				Thread.sleep(1500);
//
//				WebElement nomineeshow = ad.getNomineeshow();
//				lib.scrollDown(nomineeshow);
//				lib.btnClick(nomineeshow);
//				Thread.sleep(1500);
//
//				s5_nomineeRelation1.sendKeys(S5_nomineeRelation);
//
//				Thread.sleep(1500);
//				WebElement s5_nomineetitle1 = ad.getS5_nomineetitle();
//				s5_nomineetitle1.sendKeys(S5_nomineetitle);
//
//				Thread.sleep(1500);
//				WebElement s5_nomineeFname1 = ad.getS5_nomineeFname();
//				s5_nomineeFname1.sendKeys(s5_nomineeFname);
//
//				Thread.sleep(1500);
//				WebElement s5_nomineeMname1 = ad.getS5_nomineeMname();
//				s5_nomineeMname1.sendKeys(S5_nomineeFname);
//
//				Thread.sleep(1500);
//				WebElement s5_nomineeLname1 = ad.getS5_nomineeLname();
//				s5_nomineeLname1.sendKeys(S5_nomineeLname);
//
//				Thread.sleep(1000);
//				WebElement s5_nomineeDOB1 = ad.getS5_nomineeDOB();
//				s5_nomineeDOB1.sendKeys(S5_nomineeDOB);
//			}
//			String same_Nominee = Nominee_address_same_as_Applicant_address;
//
//			if (same_Nominee.equals("No")) {
//
//				Thread.sleep(2000);
//				WebElement nomineeaddshow = ad.getNomineeaddshow();
//				lib.scrollDown(nomineeaddshow);
//				lib.btnClick(nomineeaddshow);
//
//				Thread.sleep(1500);
//				WebElement s5_nomadd11 = ad.getS5_nomadd1();
//				s5_nomadd11.sendKeys(S5_nomadd1);
//				Thread.sleep(1000);
//
//				WebElement s5_nomadd22 = ad.getS5_nomadd2();
//				s5_nomadd22.sendKeys(S5_nomadd2);
//
//				Thread.sleep(1500);
//				WebElement s5_nomarea1 = ad.getS5_nomarea();
//				s5_nomarea1.sendKeys(S5_nomarea);
//
//				Thread.sleep(1000);
//				WebElement s5_nomcity1 = ad.getS5_nomcity();
//				s5_nomcity1.sendKeys(S5_nomcity);
//
//				WebElement s5_nomstate1 = ad.getS5_nomstate();
//				s5_nomstate1.sendKeys(S5_nomstate);
//
//				Thread.sleep(1500);
//				WebElement s5_nompincode1 = ad.getS5_nompincode();
//				s5_nompincode1.sendKeys(S5_nompincode);
//			}

			WebDriverWait wait = new WebDriverWait(driver, 150);
			WebElement step_btn_6 = ad.getStep_btn_6();
			wait.until(ExpectedConditions.visibilityOf(step_btn_6));
			lib.scrollDown(step_btn_6);
			lib.btnClick(step_btn_6);

		} catch (Exception e) {
			e.printStackTrace();
			e.printStackTrace();
			int parseInt = Integer.parseInt(INDEX);
			Excel_Utility.writeinexcel("FAIL", parseInt);

		}

	}

}
