package X_Paths;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.LibGlobal;

public class Pan_Details_Xpaths extends LibGlobal {

	public Pan_Details_Xpaths() {
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindBy(id = "s1_depositorPAN")
	private WebElement s1_depositorPAN;

	public WebElement getS1_depositorPAN() {
		return s1_depositorPAN;
	}
	
	@FindBy(xpath ="//h3[text()='Enter your PAN details']")
	private WebElement currenStatge;

	public WebElement getCurrenStatge() {
		return currenStatge;
	}

	@FindBy(xpath ="//span[@class=\"edit-btn s1_editbtn\"]")
	private WebElement Icon_feather_edit;

	public WebElement getIcon_feather_edit() {
		return Icon_feather_edit;
	}
//	@FindBy(xpath="//*[@id=\"step1_personaldet_show\"]/div[5]/div[1]/div/label")
//	private WebElement title;
//
//	public WebElement getTitle() {
//		return title;
//	}

	@FindBy(id = "s1_depositortitle")
	private WebElement s1_depositortitle;

	public WebElement getS1_depositortitle() {
		return s1_depositortitle;
	}

	@FindBy(id = "s1_depositorFName")
	private WebElement s1_depositorFName;

	public WebElement getS1_depositorFName() {
		return s1_depositorFName;
	}

	@FindBy(id = "s1_depositorMName")
	private WebElement s1_depositorMName;

	public WebElement getS1_depositorMName() {
		return s1_depositorMName;
	}

	@FindBy(id = "s1_depositorLName")
	private WebElement s1_depositorLName;

	public WebElement getS1_depositorLName() {
		return s1_depositorLName;
	}
	
	@FindBy(id="s1_depositorDOB")
	private WebElement s1_depositorDOB;

	public WebElement getS1_depositorDOB() {
		return s1_depositorDOB;
	}

	@FindBy(id = "s1_depositorEmail")
	private WebElement s1_depositorEmail;

	public WebElement getS1_depositorEmail() {
		return s1_depositorEmail;
	}

	@FindBy(xpath = "//button[@class=\"step-btn-1 primary-btn form-btn-g\"]")
	private WebElement Proceed_Button;

	public WebElement getProceed_Button() {
		return Proceed_Button;
	}
	@FindBy(xpath="(//a[@class=\"edit-btn\"])[1]")
	private WebElement deposit_Summary_Edit;

	public WebElement getDeposit_Summary_Edit() {
		return deposit_Summary_Edit;
	}	
	@FindBy(xpath="//button[@class=\"modal-btn term-btn f-m\"]")
	private WebElement TermsAndConditions;

	public WebElement getTermsAndConditions() {
		return TermsAndConditions;
	}
	@FindBy(xpath="(//button[@class=\"primary-btn modal-close-btn\"])[1]")
    private WebElement gotIt;

	public WebElement getGotIt() {
		return gotIt;
	}	
	@FindBy(xpath="//*[@id=\"step-def_2\"]/div/div[3]/label")
	private WebElement depositorTC;

	public WebElement getDepositorTC() {
		return depositorTC;
	}
	
	@FindBy(id="step-back-1")
	private WebElement step_back_1;

	public WebElement getStep_back_1() {
		return step_back_1;
	}
	
	@FindBy(id="payNow")
	private WebElement failurekyc_pop;

	public WebElement getFailurekyc_pop() {
		return failurekyc_pop;
	}
	
	@FindBy(xpath="(//div[@class=\"_3-zL border-global\"])[2]")
    private WebElement netBanking;

	public WebElement getNetBanking() {
		return netBanking;
	}
	@FindBy(xpath="(//div[@class=\"_p7la pos-r ib border-global\"])[2]")
    private WebElement HDFC;

	public WebElement getHDFC() {
		return HDFC;
	}
	
	@FindBy(xpath="//button[@class=\"btn btn-primary w100 pos-r _2fNU   \"]")
    private WebElement PAY;

	public WebElement getPAY() {
		return PAY;
	}
	
	@FindBy(xpath="//button[@class=\"btn btnd\"]")
    private WebElement Sucessful;

	public WebElement getSucessful() {
		return Sucessful;
	}
	@FindBy(xpath="//h3[text()=\"Your Deposit Summary\"]")
	private WebElement Stage2;

	public WebElement getStage2() {
		return Stage2;
	}
	
	
	
	
	
	
	
	public WebElement getSetp3_proceed() {
		return setp3_proceed;
	}

	@FindBy(id="setp3-proceed")
	private WebElement setp3_proceed;
	
	
	@FindBy(xpath="//label[@for=\"star6\"]")
	private WebElement star;

	public WebElement getStar() {
		return star;
	}
	@FindBy(id="paymentSuccess")
	private WebElement paymentSuccess;

	public WebElement getPaymentSuccess() {
		return paymentSuccess;
	}
	
	
	
	

}
