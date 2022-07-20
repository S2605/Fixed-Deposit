package X_paths;

import LibGloabal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Minor_Pan_Xpaths extends BaseClass {

    public Minor_Pan_Xpaths(){
        PageFactory.initElements(driver,this);

    }
    @CacheLookup
    @FindBy(xpath="//p[text()='The depositor is Minor, Please enter your guardian details.']")
    private WebElement Guardian_Flow;
    public WebElement getGuardian_Flow() {
        return Guardian_Flow;
    }
    @FindBy(id="s1_depositorGuardianPAN")
    private WebElement s1_depositorGuardianPAN;
    public WebElement getS1_depositorGuardianPAN() {
        return s1_depositorGuardianPAN;
    }
    @FindBy(xpath="//span[@class='edit-btn s1_gar_editbtn editallbtn']")
    private WebElement guardian_Edit;
    public WebElement getGuardian_Edit() {
        return guardian_Edit;
    }
    @FindBy(id="s1_depositorGuardianMName")
    private WebElement s1_depositorGuardianMName;
    public WebElement getS1_depositorGuardianMName() {
        return s1_depositorGuardianMName;
    }
    @FindBy(id="s1_depositorGuardianEmail")
    private WebElement s1_depositorGuardianEmail;
    public WebElement getS1_depositorGuardianEmail() {
        return s1_depositorGuardianEmail;
    }

    @FindBy(id="step-gar-btn-1")
    private WebElement step_gar_btn_1;
    public WebElement getStep_gar_btn_1() {
        return step_gar_btn_1;
    }

}
