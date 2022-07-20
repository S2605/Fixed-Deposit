import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.LibGlobal;

public class Payment_Details_Xpaths extends LibGlobal {

	public Payment_Details_Xpaths() {
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindBy(xpath = "//p[text()=\"Payment\"]")
	private WebElement Stage2;

	public WebElement getStage2() {
		return Stage2;
	}

	@FindBy(xpath = "//a[@class=\"edit-btn step2calc_edit\"]")
	private WebElement deposit_Summary_button;

	public WebElement getDeposit_Summary_button() {
		return deposit_Summary_button;
	}
	
	@FindBy(xpath = "//button[@class=\"modal-btn term-btn f-m\"]")
	private WebElement TermsandConditions;

	public WebElement getTermsandConditions() {
		return TermsandConditions;
	}
	@FindBy(xpath = "//*[@id=\"step-def_2\"]/div/div[3]")
	private WebElement check_Box;

	public WebElement getCheck_Box() {
		return check_Box;
	}
	@FindBy(id = "setp3-proceed")
	private WebElement ProceedBtn;

	public WebElement getProceedBtn() {
		return ProceedBtn;
	}
	
			
			
			
			
			
			
			
			
			
			
			
			
			
}
