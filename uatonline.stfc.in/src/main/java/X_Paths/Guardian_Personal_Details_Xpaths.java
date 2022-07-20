package X_Paths;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.LibGlobal;

public class Guardian_Personal_Details_Xpaths extends LibGlobal{

	public Guardian_Personal_Details_Xpaths() {
		
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(xpath="//h3[text()=\"Guardian Address Details\"]")
	private WebElement gaurdian_Pd_Page;
	public WebElement getGaurdian_Pd_Page() {
		return gaurdian_Pd_Page;
	}
	@FindBy(id="s3_guard_addrline1")
	private WebElement s3_guard_addrline1;
	public WebElement getS3_guard_addrline1() {
		return s3_guard_addrline1;
	}
	@FindBy(id="s3_guard_addrline2")
	private WebElement s3_guard_addrline2;
	public WebElement getS3_guard_addrline2() {
		return s3_guard_addrline2;
	}
	@FindBy(id="s3_guard_pincode")
	private WebElement s3_guard_pincode;
	public WebElement getS3_guard_pincode() {
		return s3_guard_pincode;
	}
	@FindBy(id="s3_guard_area")
	private WebElement s3_guard_area;
	public WebElement getS3_guard_area() {
		return s3_guard_area;
	}
	@FindBy(id="s3_guard_city")
	private WebElement s3_guard_city;
	public WebElement getS3_guard_city() {
		return s3_guard_city;
	}
	@FindBy(id="s3_guard_state")
	private WebElement s3_guard_state;
	public WebElement getS3_guard_state() {
		return s3_guard_state;
	}
	@FindBy(id="step-btn-guardian")
	private WebElement step_btn_guardian;
	public WebElement getStep_btn_guardian() {
		return step_btn_guardian;
	}
	
	@FindBy(id="guardian_photo")
	private WebElement guardian_photo;
	public WebElement getGuardian_photo() {
		return guardian_photo;
	}
}
