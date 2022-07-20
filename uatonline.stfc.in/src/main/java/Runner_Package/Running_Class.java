package Runner_Package;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import BaseClass.LibGlobal;
import Iteration.Excel_Utility;
import Pre_Execution.Coding_Class;
import X_Paths.Additional_Details_Xpaths;
import X_Paths.Bank_details_xpaths;
import X_Paths.Ckyc_Page_Xpaths;
import X_Paths.Gaurdian_CKYC_Xpaths;
import X_Paths.Guardian_Personal_Details_Xpaths;
import X_Paths.Minor_Pan_Xpaths;
import X_Paths.Pan_Details_Xpaths;
import X_Paths.PennyDrop_Xpaths;
import X_Paths.Personal_Details_Page_Xpaths;
import X_Paths.Scheme_Details_Xpaths;
import X_Paths.Star_xpaths;
import ch.qos.logback.core.net.SyslogOutputStream;

public class Running_Class {
	public ExtentReports report;
	public ExtentTest test;

	@BeforeTest
	public void ExtentReport() {

		report = new ExtentReports(
				"C:\\Users\\s2605\\eclipse-workspace\\stfc-fd-automation\\uatonline.stfc.in\\Extent_Report");
	}

	@DataProvider
	public static Iterator<Object[]> getTestData() {
		ArrayList<Object[]> dataFromexcel = Excel_Utility.getDataFromexcel();
		return dataFromexcel.iterator();
	}

	@Test(dataProvider = "getTestData")
	public void All_Pages(String INDEX, String Iterations, String MobileNo, String PinCode, String EmailID,
			String VerifyOtp, String Amount_input_fd, String Tenure_input_fd, String Select_Interest_Payout,
			String S1_depositorPAN, String S1_depositorMName, String S1_depositorEmail, String Documenttype,
			String DocumentNo, String Up_ckyc_frontpic, String Up_ckyc_backpic, String S3_addrline1,
			String S3_addrline2, String S3_pincode, String Profie_Upload, String S4_accountno, String S4_confaccountno,
			String Banknn, String Bal, String Ifsccodes, String S4_acctype, String S4_accholdername,
			String OcrChkUpload, String S4_accountno1, String S4_confaccountno1, String Banknn1, String Bal1,
			String Ifsccodes1, String S4_acctype1, String S4_accholdername1, String S5_Occupation, String S5_Marital,
			String S5_Maturity_ins, String S5_spouseName, String S5_fatherName, String TDS_Certificate,
			String S5_taxact, String S5_FinancialYear, String S5_EstimatedIncome, String S5_esttotincome,
			String S5_formsfilled, String S5_AggregateAmount, String Add_Nominee, String S5_nomineeRelation,
			String S5_nomineetitle, String s5_nomineeFname, String S5_nomineeFname, String S5_nomineeLname,
			String S5_nomineeDOB, String Nominee_address_same_as_Applicant_address, String S5_nomadd1,
			String S5_nomadd2, String S5_nomarea, String S5_nomcity, String S5_nomstate, String S5_nompincode,
			String Others, String S5_othersNmae, String Marital_Status) throws Exception {

		LibGlobal lib = new LibGlobal();

		try {

			lib.launchBrowser("Chrome");
			lib.loadUrl("https://uatonlinefd.stfc.in/fixed-deposit-online/");
			Thread.sleep(10000);
			Coding_Class.Landing_Page(MobileNo, PinCode, EmailID, VerifyOtp, INDEX);

			Scheme_Details_Xpaths scheme = new Scheme_Details_Xpaths();

			WebElement scheme_Details_Page = scheme.getScheme_Details_Page();
			lib.ExplicitWait(scheme_Details_Page);

			String text = scheme_Details_Page.getText();
			System.out.println(text);

			if (text.equals("Investment Amount")) {

				Coding_Class.Scheme_Page(Amount_input_fd, Tenure_input_fd, Select_Interest_Payout, INDEX);
			}

			Pan_Details_Xpaths pan = new Pan_Details_Xpaths();

			WebElement currenStatge = pan.getCurrenStatge();
            lib.ExplicitWait(currenStatge);
			
			String text2 = currenStatge.getText();

			System.out.println(text2);

			if (text2.equals("Enter your PAN details")) {

				Coding_Class.Pan_details_Page(S1_depositorPAN, S1_depositorMName, S1_depositorEmail, INDEX);
			}

			WebElement stage2 = pan.getStage2();
//			lib.ExplicitWait(stage2);
			String text3 = stage2.getText();
			System.out.println(text3);
         
			
			if (text3.equals("Your Deposit Summary")) {

				Coding_Class.Payment_Screen(INDEX);

			}
			Star_xpaths ss = new Star_xpaths();

			WebElement congragulations_Screen = ss.getCongragulations_Screen();
			String text4 = congragulations_Screen.getText();
			System.out.println(text4);

			if (text4.equals("Congratulations!")) {

				Coding_Class.Congragulations_screen();
			}
			Ckyc_Page_Xpaths ck = new Ckyc_Page_Xpaths();
			WebElement ckyc_fail = ck.getCKYC_fail();
			String text5 = ckyc_fail.getText();
			System.out.println(text5);

			if (text5.equals("We are unable to verify depositor details with C-KYC")) {

				Coding_Class.Ckyc_Fail_Page(Documenttype, INDEX, DocumentNo, Up_ckyc_frontpic, Up_ckyc_backpic);

			}

			Coding_Class.Personal_Details_Page(S3_addrline1, S3_addrline2, S3_pincode, Profie_Upload, INDEX);
			Coding_Class.Bank_Page(S4_accountno, S4_confaccountno, Banknn, Bal, Ifsccodes, S4_acctype, S4_accholdername,
					INDEX);
			Coding_Class.pennyDrop(OcrChkUpload, S4_accountno1, S4_confaccountno1, Banknn1, Bal1, Ifsccodes1,
					S4_acctype1, S4_accholdername1, INDEX);
			Coding_Class.Additonal_Details_page(S5_Occupation, S5_Marital, S5_Maturity_ins, S5_spouseName,
					S5_fatherName, TDS_Certificate, S5_taxact, S5_FinancialYear, S5_EstimatedIncome, S5_esttotincome,
					S5_formsfilled, S5_AggregateAmount, Add_Nominee, S5_nomineeRelation, S5_nomineetitle,
					s5_nomineeFname, S5_nomineeFname, S5_nomineeLname, S5_nomineeDOB,
					Nominee_address_same_as_Applicant_address, S5_nomadd1, S5_nomadd2, S5_nomarea, S5_nomcity,
					S5_nomstate, S5_nompincode, Others, S5_othersNmae, Marital_Status, INDEX);

			Thread.sleep(5000);
			int parseInt = Integer.parseInt(INDEX);
			Excel_Utility.writeinexcel("PASS", parseInt);
			String s1 = "Fixed Deposit Journey is  Completed Sucessfully in";
			String s = Iterations;
			String concat = s1.concat(s);
			Excel_Utility.writeinexcelForReasons(concat, parseInt);
			lib.passScreenCapture("Deposit Sucessfully");
			lib.quitBrowser();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			int parseInt = Integer.parseInt(INDEX);
			String s1 = "Fixed Deposit Journey is'nt Completed Sucessfully in";
			String s = Iterations;
			String concat = s1.concat(s);
			Excel_Utility.writeinexcelForReasons(concat, parseInt);

		}

	}

}
