package X_paths;

import LibGloabal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Star_Xpaths extends BaseClass {
    public Star_Xpaths(){
        PageFactory.initElements(driver,this);

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
