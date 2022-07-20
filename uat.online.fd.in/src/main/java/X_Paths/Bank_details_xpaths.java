package X_Paths;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.LibGlobal;

public class Bank_details_xpaths  extends LibGlobal{
	
	public Bank_details_xpaths() {
		PageFactory.initElements(driver, this);
	}
   @CacheLookup 
   @FindBy(id="s4_accountno")
   private WebElement s4_accountno;
   
   public WebElement getS4_accountno() {
	return s4_accountno;
}
   @FindBy(id="s4_confaccountno")
   private WebElement s4_confaccountno;

  public WebElement getS4_confaccountno() {
	return s4_confaccountno;
}
   @FindBy(xpath="//button[@class=\"info-btn pw-btn\"]")
   private WebElement eyeButton;

public WebElement getEyeButton() {
	return eyeButton;
}
   @FindBy(xpath="//button[@class=\"modal-btn info-btn\"]")
   private WebElement info_Icon;

   public WebElement getInfo_Icon() {
	return info_Icon;
}
   @FindBy(xpath=" (//button[@class=\"primary-btn modal-close-btn\"])[3]")
   private WebElement Info_done;
  
    public WebElement getInfo_done() {
	return Info_done;
}
	@FindBy(id="s4_ifsc")
    private WebElement s4_ifsc;

	public WebElement getS4_ifsc() {
		return s4_ifsc;
	}
    @FindBy(xpath="//button[@class=\"modal-btn dont-ifsc\"]")
    private WebElement dont_Know_IFSC;

	public WebElement getDont_Know_IFSC() {
		return dont_Know_IFSC;
	} 
    @FindBy(id="step-back-3")
    private WebElement step_back_3;

	public WebElement getStep_back_3() {
		return step_back_3;
	}
	@FindBy(xpath="(//button[@class=\"primary-btn m-0 form-btn-g\"])[1]")
	private WebElement step_btn_3;

	public WebElement getStep_btn_3() {
		return step_btn_3;
	}
    @FindBy(id="banknn")
    private WebElement banknn;

	public WebElement getBanknn() {
		return banknn;
	}
	@FindBy(id="bal")
	private WebElement bal;

	public WebElement getBal() {
		return bal;
	}
	@FindBy(xpath="(//button[@class=\"primary-btn modal-close-btn\"])[4]")
	private WebElement done;

	public WebElement getDone() {
		return done;
	}
	@FindBy(id="uploaddivshow")
	private WebElement uploaddivshow;

	public WebElement getUploaddivshow() {
		return uploaddivshow;
	}
	@FindBy(id="s4_branch")
    private WebElement s4_branch;

	public WebElement getS4_branch() {
		return s4_branch;
	}
	@FindBy(id="s4_bankname")
	private WebElement s4_bankname;

	public WebElement getS4_bankname() {
		return s4_bankname;
	}
	@FindBy(id="s4_acctype")
	private WebElement s4_acctype;

	public WebElement getS4_acctype() {
		return s4_acctype;
	}
	@FindBy(id="s4_accholdername")
	private WebElement s4_accholdername;

	public WebElement getS4_accholdername() {
		return s4_accholdername;
	}
	@FindBy(id="step-btn-5")
	private WebElement step_btn_5;

	public WebElement getStep_btn_5() {
		return step_btn_5;
	}
	
}
