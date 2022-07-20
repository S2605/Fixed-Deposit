import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.LibGlobal;

public class Bank_Details_Xpaths extends LibGlobal {
  
	public Bank_Details_Xpaths() {
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindBy(xpath="//p[text()=\"Bank Details\"]")
	private WebElement Stage4;

	public WebElement getStage4() {
		return Stage4;
	}
}
