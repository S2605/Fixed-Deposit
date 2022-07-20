import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.LibGlobal;

public class Landing_Page_Xpaths extends LibGlobal {
	
	public Landing_Page_Xpaths() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(id="MobileNo")
	private WebElement MobileNo;
	public WebElement getMobileNo() {
		return MobileNo;
	}
	@FindBy(id="pincode")
	private WebElement pincode;
	public WebElement getPincode() {
		return pincode;
	}
	@FindBy(id="EmailID")
	private WebElement EmailID;
	public WebElement getEmailID() {
		return EmailID;
	}
	
	@FindBy(id="invest_now_button")
	private WebElement invest_now_button;
	public WebElement getInvest_now_button() {
		return invest_now_button;
	}
	@FindBy(id="verifyOtp")
	private WebElement verifyOtp;
	public WebElement getVerifyOtp() {
		return verifyOtp;
	}
	@FindBy(id="verifyOtpSubmit")
	private WebElement verifyOtpSubmit;
	public WebElement getVerifyOtpSubmit() {
		return verifyOtpSubmit;
	}
	
	
	
}
