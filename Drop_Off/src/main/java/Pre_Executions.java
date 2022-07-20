import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseClass.LibGlobal;

public class Pre_Executions {

	public void LandingPage(String MobileNo, String pincode, String EmailID, String verifyOtp) throws Exception {

		LibGlobal lib = new LibGlobal();
		Landing_Page_Xpaths lp = new Landing_Page_Xpaths();

		Thread.sleep(2000);
		WebElement mobileNo1 = lp.getMobileNo();
		mobileNo1.sendKeys(MobileNo);

		Thread.sleep(2000);
		WebElement pincode1 = lp.getPincode();
		pincode1.sendKeys(pincode);

		Thread.sleep(2000);
		WebElement emailID1 = lp.getEmailID();
		emailID1.sendKeys(EmailID);

		Thread.sleep(2000);
		WebElement invest_now_button = lp.getInvest_now_button();
		lib.btnClick(invest_now_button);

		Thread.sleep(3000);
		WebElement verifyOtp1 = lp.getVerifyOtp();
		verifyOtp1.sendKeys(verifyOtp);

		Thread.sleep(2000);
		WebElement verifyOtpSubmit = lp.getVerifyOtpSubmit();
		lib.btnClick(verifyOtpSubmit);

	}

	public void SchemeDetailsPage(String amount_input_fd, String tenureOptions, String tenure_input_fd,
			String select_Interest_Payout, String citizenyes) throws Exception {
		LibGlobal lib = new LibGlobal();
		Scheme_Details_Xpaths sd = new Scheme_Details_Xpaths();

		WebElement amount_input_fd1 = sd.getAmount_input_fd();
		amount_input_fd1.clear();
		amount_input_fd1.sendKeys(amount_input_fd);

		Thread.sleep(2000);
		WebElement tenureOptions1 = sd.getTenureOptions();
		Select s = new Select(tenureOptions1);
		s.selectByVisibleText(tenureOptions);

		Thread.sleep(2000);
		WebElement tenure_input_fd1 = sd.getTenure_input_fd();
		tenure_input_fd1.clear();
		tenure_input_fd1.sendKeys(tenure_input_fd);

		Thread.sleep(2000);
		WebElement select_Interest_Payout1 = sd.getSelect_Interest_Payout();
		Select s1 = new Select(select_Interest_Payout1);
		s1.selectByVisibleText(select_Interest_Payout);

		Thread.sleep(2000);
		String text = citizenyes;

		if (text.equals("Yes")) {

			WebElement citizenyes1 = sd.getCitizenyes();
			lib.doubleClick(citizenyes1);
		}
		Thread.sleep(2000);
		WebElement apply_investbtn = sd.getApply_investbtn();
		lib.scrollDown(apply_investbtn);
		lib.btnClick(apply_investbtn);

	}

	public void Pan_Details_Page(String s1_depositorPAN, String s1_depositortitle, String s1_depositorMName)
			throws Exception {
		LibGlobal lib = new LibGlobal();
		Pan_details_Xpaths pan = new Pan_details_Xpaths();
		Thread.sleep(3000);
		WebElement s1_depositorPAN1 = pan.getS1_depositorPAN();
		s1_depositorPAN1.sendKeys(s1_depositorPAN);

		Thread.sleep(5000);
		WebElement icon_feather_edit = pan.getIcon_feather_edit();
		lib.btnClick(icon_feather_edit);

		Thread.sleep(1500);
		WebElement s1_depositortitle1 = pan.getS1_depositortitle();
		Select s = new Select(s1_depositortitle1);
		s.selectByVisibleText(s1_depositortitle);

		Thread.sleep(1500);
		WebElement s1_depositorMName1 = pan.getS1_depositorMName();
		s1_depositorMName1.sendKeys(s1_depositorMName);

		Thread.sleep(1500);
		WebElement step_back_1 = pan.getStep_back_1();
		lib.btnClick(step_back_1);
	}

}
