package X_Paths;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.LibGlobal;

public class Ckyc_Page_Xpaths extends LibGlobal{

	public Ckyc_Page_Xpaths() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	
	@FindBy(xpath="(//p[text()=\"Please select the document type\"])[1]")
	private WebElement CKYC_fail;
	
	public WebElement getCKYC_fail() {
		return CKYC_fail;
	}
	@FindBy(id="Documenttype")
	private WebElement Documenttype;
	
	public WebElement getDocumenttype() {
		return Documenttype;
	}
	@FindBy(xpath="//*[@id=\"ckyc_doc_uploadForm\"]/div[1]/div[1]/div/label")
	private WebElement Document_Field;
	
	public WebElement getDocument_Field() {
		return Document_Field;
	}
	@FindBy(id="DocumentNo")
	private WebElement DocumentNo;

	public WebElement getDocumentNo() {
		return DocumentNo;
	}
	@FindBy(id="up_ckyc_frontpic")
	private WebElement up_ckyc_frontpic;

	public WebElement getUp_ckyc_frontpic() {
		return up_ckyc_frontpic;
	}
	
	@FindBy(id="up_ckyc_backpic")
	private WebElement up_ckyc_backpic;

	public WebElement getUp_ckyc_backpic() {
		return up_ckyc_backpic;
	}
	
	@FindBy(id="step-btn-2")
	private WebElement step_btn_2;

	public WebElement getStep_btn_2() {
		return step_btn_2;
	}
}

