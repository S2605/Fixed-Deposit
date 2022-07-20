package X_Paths;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.LibGlobal;

public class Scheme_Details_Xpaths extends LibGlobal {
	public Scheme_Details_Xpaths() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "amount-input-fd")
	private WebElement amount_input_fd;

	public WebElement getAmount_input_fd() {
		return amount_input_fd;
	}
	@FindBy(id="tenure-input-fd")
	private WebElement tenure_input_fd;

	public WebElement getTenure_input_fd() {
		return tenure_input_fd;
	}
	@FindBy(xpath="//select[@class=\"form-box intrestpayout\"]")
	private WebElement Select_Interest_Payout;

	public WebElement getSelect_Interest_Payout() {
		return Select_Interest_Payout;
	}
	@FindBy(id="citizenyes")
	private WebElement citizenyes;

	public WebElement getCitizenyes() {
		return citizenyes;
	}
	@FindBy(id="apply_investbtn")
	private WebElement apply_investbtn;

	public WebElement getApply_investbtn() {
		return apply_investbtn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
