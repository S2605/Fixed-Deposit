package X_Paths;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.LibGlobal;

public class Star_xpaths extends LibGlobal {
	
	public Star_xpaths() {
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindBy(xpath="//h2[text()='Congratulations!']")
	private WebElement congragulations_Screen;

	public WebElement getCongragulations_Screen() {
		return congragulations_Screen;
	}

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
