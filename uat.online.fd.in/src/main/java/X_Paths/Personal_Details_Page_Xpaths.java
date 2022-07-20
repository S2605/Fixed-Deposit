package X_Paths;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.LibGlobal;

public class Personal_Details_Page_Xpaths extends LibGlobal {

	public Personal_Details_Page_Xpaths() {
		PageFactory.initElements(driver, this);
		
	}
	
	@CacheLookup
	@FindBy(xpath="//button[@class=\"upload-btn p-relative up-btn\"]")
	private WebElement Profie_Upload;

	public WebElement getProfie_Upload() {
		return Profie_Upload;
	}
	
	@FindBy(id="s3_Documentnoo")
	private WebElement s3_Documentnoo;

	public WebElement getS3_Documentnoo() {
		return s3_Documentnoo;
	}
	@FindBy(id="s3_idproof")
	private WebElement s3_idproof;

	public WebElement getS3_idproof() {
		return s3_idproof;
	}
	
	@FindBy(xpath="//*[@id=\"reuploaddiv\"]")
	private WebElement reuploaddiv;
	
	public WebElement getReuploaddiv() {
		return reuploaddiv;
	}
	@FindBy(xpath="(//span[@class=\"s3_editbtn edit-btn modal-btn\"])[1]")
	private WebElement Address_Edit;

	public WebElement getAddress_Edit() {
		return Address_Edit;
	}

	@FindBy(id="s3_addrline1")
	private WebElement s3_addrline1;

	public WebElement getS3_addrline1() {
		return s3_addrline1;
	}

	@FindBy(id="s3_addrline2")
	private WebElement s3_addrline2;

	public WebElement getS3_addrline2() {
		return s3_addrline2;
	}
	@FindBy(id="s3_area")
	private WebElement s3_area;

	public WebElement getS3_area() {
		return s3_area;
	}
	@FindBy(id="s3_city")
	private WebElement s3_city;

	public WebElement getS3_city() {
		return s3_city;
	}
	@FindBy(id="s3_state")
	private WebElement s3_state;

	public WebElement getS3_state() {
		return s3_state;
	}
	@FindBy(id="s3_pincode")
	private WebElement s3_pincode;

	public WebElement getS3_pincode() {
		return s3_pincode;
	}
	
	@FindBy(id="step-btn-3")
	private WebElement step_btn_3;

	public WebElement getStep_btn_3() {
		return step_btn_3;
	}
}
