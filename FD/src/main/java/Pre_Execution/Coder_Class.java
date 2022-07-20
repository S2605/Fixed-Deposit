package Pre_Execution;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import BaseClass.LibGlobal;
import Iteration.Excel_Utility;
import X_Paths.LandingPage_Xpaths;
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
			String ex="mobile validation pass in ";
			String concat11 = ex.concat(titleName1);
			test.log(LogStatus.PASS, concat11); 
		} catch (Exception e) {
			e.printStackTrace();
			int parseInt = Integer.parseInt(INDEX);
			Excel_Utility.writeinexcel("FAIL", parseInt);
			String ex="mobile validation Fail in ";
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
			// Allures.startTest();
			LibGlobal lib = new LibGlobal();
			LandingPage_Xpaths lp = new LandingPage_Xpaths();
			WebElement pinCode = lp.getPinCode();
			pinCode.sendKeys(pincode);
			// pinCode.sendKeys(Keys.ENTER);
			// Allures.markStepAsPassed(driver, "Pincode validation Passed");
			int parseInt = Integer.parseInt(INDEX);
			Excel_Utility.writeinexcel("PASS", parseInt);
			String ex="Pincode validation pass in ";
			String concat11 = ex.concat(titleName1);
			test.log(LogStatus.PASS, concat11);
		} catch (Exception e) {

			e.printStackTrace();
			int parseInt = Integer.parseInt(INDEX);
			Excel_Utility.writeinexcel("FAIL", parseInt);
			String ex="Pincode validation Fail in ";
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
				Excel_Utility.writeinexcelForReasons("Are_you_a_senior_citizen : " + "PASS", parseInt);

			}
			WebElement invest_now_Bottom = lp.getInvest_now_Bottom();
			lib.btnClick(invest_now_Bottom);
			Thread.sleep(2000);
			WebElement invest_now_button = lp.getInvest_now_button();
			lib.btnClick(invest_now_button);

			Excel_Utility.writeinexcel("PASS", parseInt);
			String ex="Email validation pass in ";
			String concat11 = ex.concat(titleName1);
			test.log(LogStatus.PASS, concat11);
		} catch (Exception e) {
			e.printStackTrace();
			int parseInt = Integer.parseInt(INDEX);
			Excel_Utility.writeinexcel("FAIL", parseInt);
			String ex="Email validation Fail in ";
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
			String ex="OTP_validation pass in ";
			String concat11 = ex.concat(titleName1);
			test.log(LogStatus.PASS, concat11);
			// Allures.markStepAsPassed(driver, "OTP_validation Passed");
		} catch (Exception e) {
			e.printStackTrace();
			int parseInt = Integer.parseInt(INDEX);
			Excel_Utility.writeinexcel("FAIL", parseInt);
			String ex="OTP_validation  Fail in ";
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
				Excel_Utility.writeinexcelForReasons("Select_Interest_Payout : " + "PASS", parseInt);
			} else if (Select_Interest_Payout.equals("Monthly")) {
				select_Interest_Payout2.sendKeys(Keys.ARROW_DOWN);
				select_Interest_Payout2.sendKeys(Keys.ENTER);
				Excel_Utility.writeinexcelForReasons("Select_Interest_Payout : " + "PASS", parseInt);
			} else if (Select_Interest_Payout.equals("Quarterly")) {
				select_Interest_Payout2.sendKeys(Keys.ARROW_DOWN);
				select_Interest_Payout2.sendKeys(Keys.ARROW_DOWN);
				select_Interest_Payout2.sendKeys(Keys.ENTER);
				Excel_Utility.writeinexcelForReasons("Select_Interest_Payout : " + "PASS", parseInt);
			} else if (Select_Interest_Payout.equals("Half-Yearly")) {
				select_Interest_Payout2.sendKeys(Keys.ARROW_DOWN);
				select_Interest_Payout2.sendKeys(Keys.ARROW_DOWN);
				select_Interest_Payout2.sendKeys(Keys.ARROW_DOWN);
				select_Interest_Payout2.sendKeys(Keys.ENTER);
				Excel_Utility.writeinexcelForReasons("Select_Interest_Payout : " + "PASS", parseInt);
			} else if (Select_Interest_Payout.equals("Yearly")) {
				select_Interest_Payout2.sendKeys(Keys.ARROW_DOWN);
				select_Interest_Payout2.sendKeys(Keys.ARROW_DOWN);
				select_Interest_Payout2.sendKeys(Keys.ARROW_DOWN);
				select_Interest_Payout2.sendKeys(Keys.ARROW_DOWN);
				select_Interest_Payout2.sendKeys(Keys.ENTER);
				Excel_Utility.writeinexcelForReasons("Select_Interest_Payout : " + "PASS", parseInt);
			} else {
				Excel_Utility.writeinexcelForReasons("Select_Interest_Payout : " + "FAIL", parseInt);
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
				Excel_Utility.writeinexcelForReasons("Are_you_a_senior_citizen1 : " + "PASS", parseInt);
			}
			Thread.sleep(5000);
			lib.passScreenCapture("Calculator SreenShot");
			WebElement apply_investbtn = sd.getApply_investbtn();
			lib.btnClick(apply_investbtn);
			Excel_Utility.writeinexcel("PASS", parseInt);
			String ex="Scheme details page Pass in ";
			String concat11 = ex.concat(titleName1);
			test.log(LogStatus.PASS, concat11);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			int parseInt = Integer.parseInt(INDEX);
			Excel_Utility.writeinexcel("FAIL", parseInt);
			String ex="Scheme details page   Fail in ";
			String titleName1 = Iteration;
			String concat11 = ex.concat(titleName1);
			test.log(LogStatus.FAIL, concat11);
		}
	}
}
