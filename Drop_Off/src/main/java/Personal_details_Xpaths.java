import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.LibGlobal;

public class Personal_details_Xpaths extends LibGlobal {

	public Personal_details_Xpaths() {

		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindBy(xpath = "//p[text()=\"Personal Details\"]")
	private WebElement Stage3;

	public WebElement getStage3() {
		return Stage3;
	}
}
