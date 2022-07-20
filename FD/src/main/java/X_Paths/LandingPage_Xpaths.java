package X_Paths;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.LibGlobal;

public class LandingPage_Xpaths extends LibGlobal {
	
	public LandingPage_Xpaths() {
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindBy(id="MobileNo")
	private WebElement MobileNo;

	public WebElement getMobileNo() {
		return MobileNo;
	}
	@FindBy(xpath="//span[@id='MobileNo-error']")
	private WebElement MobileNo_error;
	
	public WebElement getMobileNo_error() {
		return MobileNo_error;
	}
	@FindBy(xpath="//span[@class='error']")
	private WebElement Mo_error_1;
	
	public WebElement getMo_error_1() {
		return Mo_error_1;
	}

	@FindBy(id="pinCode")
	private WebElement pinCode;

	public WebElement getPinCode() {
		return pinCode;
	}
	@FindBy(id="EmailID")
	private WebElement EmailID;

	public WebElement getEmailID() {
		return EmailID;
	}
    @FindBy(xpath="//a[text()=\"Terms & Conditions.\"]")
    private WebElement TermsandConditons;

	public WebElement getTermsandConditons() {
		return TermsandConditons;
	}
	@FindBy(id="invest_now_button")
	private WebElement invest_now_button;

	public WebElement getInvest_now_button() {
		return invest_now_button;
	}
	@FindBy(id="amount-input-fd")
	private WebElement amount_input_fd;

	public WebElement getAmount_input_fd() {
		return amount_input_fd;
	}
	@FindBy(id="tenure-input-fd")
	private WebElement tenure_input_fd;

	public WebElement getTenure_input_fd() {
		return tenure_input_fd;
	}
	
	@FindBy(xpath="//label[@for=\"citizenyes\"]")
	private WebElement citizenyes;
	
	public WebElement getCitizenyes() {
		return citizenyes;
	}
	@FindBy(xpath="//a[text()=\"INVEST NOW\"]")
	private WebElement Invest_now_Bottom;

	public WebElement getInvest_now_Bottom() {
		return Invest_now_Bottom;
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
