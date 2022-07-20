package Pre_Execution;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import BaseClass.LibGlobal;
import Iteration.Excel_Utility1;
import X_Paths.LandingPage_Xpaths;
import X_Paths.Pan_Details_Xpaths;
import X_Paths.Scheme_Details_Xpaths;

public class All_Validations {

	public void mobile_Validation(String INDEX, String Iteration, String ErrorMsg, String mobileNo, String pinCode,
			String emailID, String OTP, String Amount_input_fd, String Tenure_input_fd, String Select_Interest_Payout,
			String S1_depositorPAN, String S1_depositorMName) throws Exception {

		try {
			LibGlobal lib = new LibGlobal();
			LandingPage_Xpaths lp = new LandingPage_Xpaths();
			String reason = "Invalid Mobile Number";
			String s = Iteration;
			String concat = reason.concat(s);

			String reason11 = "Invalid Pincode ";
			String concat11 = reason11.concat(s);

			String reason22 = "Invalid Email Id  ";
			String concat22 = reason22.concat(s);

			String reason23 = "Invalid  OTP  ";
			String concat23 = reason23.concat(s);

			WebElement mobileNo1 = lp.getMobileNo();
			lib.scrollDown(mobileNo1);
			Thread.sleep(2000);
			mobileNo1.sendKeys(mobileNo);
			mobileNo1.sendKeys(Keys.TAB);

			WebElement pinCode1 = lp.getPinCode();
			pinCode1.sendKeys(pinCode);

			WebElement emailID1 = lp.getEmailID();
			emailID1.sendKeys(emailID);

			Thread.sleep(3000);
			WebElement invest_now_button = lp.getInvest_now_button();
			lib.btnClick(invest_now_button);

			Thread.sleep(3000);

			String text = ErrorMsg;
			System.out.println(text);

			int parseInt = Integer.parseInt(INDEX);

			if (text.equals("Invalid Mobile Number")) {

				Excel_Utility1.writeinexcel("FAIL", parseInt);
				Excel_Utility1.writeinexcelForReasons(concat, parseInt);

			} else if (text.equals("Invalid pincode")) {

				Excel_Utility1.writeinexcel("FAIL", parseInt);
				Excel_Utility1.writeinexcelForReasons(concat11, parseInt);
			} else if (text.equals("Please enter a valid Email ID")) {

				Excel_Utility1.writeinexcel("FAIL", parseInt);
				Excel_Utility1.writeinexcelForReasons(concat22, parseInt);
			} else if (text.equals("Invalid OTP")) {

				WebElement verifyOtp = lp.getVerifyOtp();
				verifyOtp.sendKeys(OTP);

				Thread.sleep(3000);
				WebElement verifyOtpSubmit = lp.getVerifyOtpSubmit();
				lib.btnClick(verifyOtpSubmit);
				
				Excel_Utility1.writeinexcel("FAIL", parseInt);
				Excel_Utility1.writeinexcelForReasons(concat23, parseInt);

				
			} else if (text.equals("Landing page")) {

				Thread.sleep(3000);
				WebElement verifyOtp = lp.getVerifyOtp();
				verifyOtp.sendKeys(OTP);

				Thread.sleep(3000);
				WebElement verifyOtpSubmit = lp.getVerifyOtpSubmit();
				lib.btnClick(verifyOtpSubmit);

				Thread.sleep(5000);
				Scheme_Details_Xpaths scheme = new Scheme_Details_Xpaths();

				WebElement amount_input_fd = scheme.getAmount_input_fd();
				amount_input_fd.clear();
				amount_input_fd.sendKeys(Amount_input_fd);
				amount_input_fd.sendKeys(Keys.ENTER);

				Thread.sleep(2000);
				WebElement tenure_input_fd = scheme.getTenure_input_fd();
				tenure_input_fd.clear();
				tenure_input_fd.sendKeys(Tenure_input_fd);
				tenure_input_fd.sendKeys(Keys.ENTER);

				Thread.sleep(2000);
				WebElement select_Interest_Payout = scheme.getSelect_Interest_Payout();
				lib.selectOptionByText(select_Interest_Payout, Select_Interest_Payout);

				Thread.sleep(2000);
				WebElement apply_investbtn = scheme.getApply_investbtn();
				lib.scrollDown(apply_investbtn);
				lib.btnClick(apply_investbtn);
				
			} else if (text.equals("Pan details Page")) {
				
				Thread.sleep(3000);
				WebElement verifyOtp = lp.getVerifyOtp();
				verifyOtp.sendKeys(OTP);

				Thread.sleep(2000);
				WebElement verifyOtpSubmit = lp.getVerifyOtpSubmit();
				lib.btnClick(verifyOtpSubmit);

				Thread.sleep(5000);
				Scheme_Details_Xpaths scheme = new Scheme_Details_Xpaths();

				WebElement amount_input_fd = scheme.getAmount_input_fd();
				amount_input_fd.clear();
				amount_input_fd.sendKeys(Amount_input_fd);
				amount_input_fd.sendKeys(Keys.ENTER);

				Thread.sleep(2000);
				WebElement tenure_input_fd = scheme.getTenure_input_fd();
				tenure_input_fd.clear();
				tenure_input_fd.sendKeys(Tenure_input_fd);
				tenure_input_fd.sendKeys(Keys.ENTER);

				Thread.sleep(2000);
				WebElement select_Interest_Payout = scheme.getSelect_Interest_Payout();
				lib.selectOptionByText(select_Interest_Payout, Select_Interest_Payout);

				Thread.sleep(2000);
				WebElement apply_investbtn = scheme.getApply_investbtn();
				lib.scrollDown(apply_investbtn);
				lib.btnClick(apply_investbtn);
				Thread.sleep(5000);
				Pan_Details_Xpaths pan = new Pan_Details_Xpaths();
				WebElement proceed_Button = pan.getProceed_Button();
				lib.scrollDown(proceed_Button);
				lib.btnClick(proceed_Button);

				
			}else if (text.equals("Pan details Page 1")) {
				
				Thread.sleep(3000);
				WebElement verifyOtp = lp.getVerifyOtp();
				verifyOtp.sendKeys(OTP);

				Thread.sleep(2000);
				WebElement verifyOtpSubmit = lp.getVerifyOtpSubmit();
				lib.btnClick(verifyOtpSubmit);

				Thread.sleep(5000);
				Scheme_Details_Xpaths scheme = new Scheme_Details_Xpaths();

				WebElement amount_input_fd = scheme.getAmount_input_fd();
				amount_input_fd.clear();
				amount_input_fd.sendKeys(Amount_input_fd);
				amount_input_fd.sendKeys(Keys.ENTER);

				Thread.sleep(2000);
				WebElement tenure_input_fd = scheme.getTenure_input_fd();
				tenure_input_fd.clear();
				tenure_input_fd.sendKeys(Tenure_input_fd);
				tenure_input_fd.sendKeys(Keys.ENTER);

				Thread.sleep(2000);
				WebElement select_Interest_Payout = scheme.getSelect_Interest_Payout();
				lib.selectOptionByText(select_Interest_Payout, Select_Interest_Payout);

				Thread.sleep(2000);
				WebElement apply_investbtn = scheme.getApply_investbtn();
				lib.scrollDown(apply_investbtn);
				lib.btnClick(apply_investbtn);
				
				Pan_Details_Xpaths pan = new Pan_Details_Xpaths();
				Thread.sleep(5000);
				WebElement s1_depositorPAN = pan.getS1_depositorPAN();
				lib.scrollUp(s1_depositorPAN);
				s1_depositorPAN.sendKeys(S1_depositorPAN);

				Thread.sleep(2000);
				WebElement icon_feather_edit = pan.getIcon_feather_edit();
				lib.btnClick(icon_feather_edit);

				Thread.sleep(2000);
				WebElement s1_depositorMName = pan.getS1_depositorMName();
				s1_depositorMName.sendKeys(S1_depositorMName);
				
				Thread.sleep(2000);
				WebElement proceed_Button = pan.getProceed_Button();
				lib.scrollDown(proceed_Button);
				lib.btnClick(proceed_Button);
			}
			

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
