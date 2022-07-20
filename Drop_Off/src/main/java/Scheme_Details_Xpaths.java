import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.LibGlobal;

public class Scheme_Details_Xpaths extends LibGlobal {

	public Scheme_Details_Xpaths() {
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindBy(id = "amount-input-fd")
	private WebElement amount_input_fd;

	public WebElement getAmount_input_fd() {
		return amount_input_fd;
	}

	@FindBy(xpath = "//select[@class=\"mon_select\"]")
	private WebElement tenureOptions;

	public WebElement getTenureOptions() {
		return tenureOptions;
	}

	@FindBy(id = "tenure-input-fd")
	private WebElement tenure_input_fd;

	public WebElement getTenure_input_fd() {
		return tenure_input_fd;
	}

	@FindBy(id = "intPayout")
	private WebElement Select_Interest_Payout;

	public WebElement getSelect_Interest_Payout() {
		return Select_Interest_Payout;
	}

	@FindBy(xpath = "//*[@id=\"stepper\"]/div/div[1]/h3/div/div[1]/div/form/div[4]")
	private WebElement citizenyes;

	public WebElement getCitizenyes() {
		return citizenyes;
	}

	@FindBy(id = "apply_investbtn")
	private WebElement apply_investbtn;

	public WebElement getApply_investbtn() {
		return apply_investbtn;
	}

}
