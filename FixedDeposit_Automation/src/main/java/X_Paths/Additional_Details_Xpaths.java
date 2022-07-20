package X_Paths;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.LibGlobal;  

public class Additional_Details_Xpaths  extends LibGlobal{

	public Additional_Details_Xpaths() {
	 
		PageFactory.initElements(driver, this);
		
	}
	@CacheLookup
	@FindBy(xpath="//h3[text()='Tax Exemption']")
	private WebElement stage_Final;
	
	public WebElement getStage_Final() {
		return stage_Final;
	}
	@FindBy(id="s5_Occupation")
	private WebElement s5_Occupation;
	public WebElement getS5_Occupation() {
		return s5_Occupation;
	}
	@FindBy(id="s5_Marital")
	private WebElement s5_Marital;
	public WebElement getS5_Marital() {
		return s5_Marital;
	}
	@FindBy(id="s5_Maturity_ins")
	private WebElement s5_Maturity_ins;
	public WebElement getS5_Maturity_ins() {
		return s5_Maturity_ins;
	}
	@FindBy(id="s5_spouseName")
	private WebElement s5_spouseName;
	public WebElement getS5_spouseName() {
		return s5_spouseName;
	}
	@FindBy(id="s5_fatherName")
	private WebElement s5_fatherName;
	public WebElement getS5_fatherName() {
		return s5_fatherName;
	}
	@FindBy(xpath="//button[@class=\"btn-tds modal-btn\"]")
	private WebElement info_TDS;
	public WebElement getInfo_TDS() {
		return info_TDS;
	}
	@FindBy(id="tds-show")
	private WebElement tds_show;
	public WebElement getTds_show() {
		return tds_show;
	}
	@FindBy(id="tds-hide")
	private WebElement tds_hide;
	public WebElement getTds_hide() {
		return tds_hide;
	}
	@FindBy(id="s5_taxact")
	private WebElement s5_taxact;
	public WebElement getS5_taxact() {
		return s5_taxact;
	}
	@FindBy(id="s5_FinancialYear")
	private WebElement s5_FinancialYear;
	public WebElement getS5_FinancialYear() {
		return s5_FinancialYear;
	}
	@FindBy(id="s5_EstimatedIncome")
	private WebElement s5_EstimatedIncome;
	public WebElement getS5_EstimatedIncome() {
		return s5_EstimatedIncome;
	}
	@FindBy(id="s5_esttotincome")
	private WebElement s5_esttotincome;
	public WebElement getS5_esttotincome() {
		return s5_esttotincome;
	}
	@FindBy(id="s5_formsfilled")
	private WebElement s5_formsfilled;
	public WebElement getS5_formsfilled() {
		return s5_formsfilled;
	}
	@FindBy(id="s5_AggregateAmount")
	private WebElement s5_AggregateAmount;
	public WebElement getS5_AggregateAmount() {
		return s5_AggregateAmount;
	}
	@FindBy(id="nomineeshow")
	private WebElement nomineeshow;
	public WebElement getNomineeshow() {
		return nomineeshow;
	}
	@FindBy(id="nomineehide")
	private WebElement nomineehide;
	public WebElement getNomineehide() {
		return nomineehide;
	}
	@FindBy(id="s5_nomineeRelation")
	private WebElement s5_nomineeRelation;
	public WebElement getS5_nomineeRelation() {
		return s5_nomineeRelation;
	}
	@FindBy(id="s5_nomineetitle")
	private WebElement s5_nomineetitle;
	public WebElement getS5_nomineetitle() {
		return s5_nomineetitle;
	}
	
	@FindBy(id="s5_nomineeFname")
	private WebElement s5_nomineeFname;
	public WebElement getS5_nomineeFname() {
		return s5_nomineeFname;
	}
	@FindBy(id="s5_nomineeMname")
	private WebElement s5_nomineeMname;
	public WebElement getS5_nomineeMname() {
		return s5_nomineeMname;
	}
	@FindBy(id="s5_nomineeLname")
	private WebElement s5_nomineeLname;
	
	public WebElement getS5_nomineeLname() {
		return s5_nomineeLname;
	}
	@FindBy(id="s5_nomineeDOB")
	private WebElement s5_nomineeDOB;
	public WebElement getS5_nomineeDOB() {
		return s5_nomineeDOB;
	}
	@FindBy(id="nomineeaddshow")
	private WebElement nomineeaddshow;
	public WebElement getNomineeaddshow() {
		return nomineeaddshow;
	}
	
	@FindBy(id="nomineeaddhide")
	private WebElement nomineeaddhide;
	public WebElement getNomineeaddhide() {
		return nomineeaddhide;
	}
	@FindBy(id="s5_nomadd1")
	private WebElement s5_nomadd1;
	
	public WebElement getS5_nomadd1() {
		return s5_nomadd1;
	}
	@FindBy(id="s5_nomadd2")
	private WebElement s5_nomadd2;
	
	
	public WebElement getS5_nomadd2() {
		return s5_nomadd2;
	}
	
	@FindBy(id="s5_nomarea")
	private WebElement s5_nomarea;
	
	public WebElement getS5_nomarea() {
		return s5_nomarea;
	}
	@FindBy(id="s5_nomcity")
	private WebElement s5_nomcity;
	public WebElement getS5_nomcity() {
		return s5_nomcity;
	}
	
	@FindBy(id="s5_nomstate")
	private WebElement s5_nomstate;
	public WebElement getS5_nomstate() {
		return s5_nomstate;
	}
	
	@FindBy(id="s5_nompincode")
	private WebElement s5_nompincode;
	
	
	public WebElement getS5_nompincode() {
		return s5_nompincode;
	}
	@FindBy(id="step-btn-6")
	private WebElement step_btn_6;
	
	public WebElement getStep_btn_6() {
		return step_btn_6;
	}
	
	
	
}
