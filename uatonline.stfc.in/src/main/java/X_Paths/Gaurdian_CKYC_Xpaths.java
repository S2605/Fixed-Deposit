package X_Paths;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.LibGlobal;

public class Gaurdian_CKYC_Xpaths  extends LibGlobal{

	public Gaurdian_CKYC_Xpaths() {
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindBy(xpath="(//p[text()=\"We are unable to verify your guardian details with C-KYC\"])[1]")
	private WebElement Gaurdian_CKYC_Fail_Page;

	public WebElement getGaurdian_CKYC_Fail_Page() {
		return Gaurdian_CKYC_Fail_Page;
	}
	
	
	@FindBy(id="guard_Documenttype")
	private WebElement guard_Documenttype; 

	public WebElement getGuard_Documenttype() {
		return guard_Documenttype;
	}
	
	@FindBy(id="guard_DocumentNo")
	private WebElement guard_DocumentNo;

	public WebElement getGuard_DocumentNo() {
		return guard_DocumentNo;
	}
	
	@FindBy(id="guard_up_ckyc_frontpic")
	private WebElement guard_up_ckyc_frontpic;

	public WebElement getGuard_up_ckyc_frontpic() {
		return guard_up_ckyc_frontpic;
	}
	@FindBy(id="guard_up_ckyc_backpic")
	private WebElement guard_up_ckyc_backpic;

	public WebElement getGuard_up_ckyc_backpic() {
		return guard_up_ckyc_backpic;
	}
	
	@FindBy(id="step-btn-upload-guardian")
	private WebElement step_btn_upload_guardian;

	public WebElement getStep_btn_upload_guardian() {
		return step_btn_upload_guardian;
	}

}
