package X_paths;

import LibGloabal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ckyc_Xpaths extends BaseClass {

    public Ckyc_Xpaths() {
        PageFactory.initElements(driver, this);

    }
    @CacheLookup
    @FindBy(xpath = "//p[text()='We are unable to verify depositor details with C-KYC']")
    private WebElement CKYC_fail;

    public WebElement getCKYC_fail() {
        return CKYC_fail;
    }

    @FindBy(id = "Documenttype")
    private WebElement Documenttype;

    public WebElement getDocumenttype() {
        return Documenttype;
    }

    @FindBy(xpath = "(//a[@class='uploada'])[2]")
    private WebElement Document_Field;

    public WebElement getDocument_Field() {
        return Document_Field;
    }

    @FindBy(id ="DocumentNo")
    private WebElement DocumentNo;

    public WebElement getDocumentNo() {
        return DocumentNo;
    }

    @FindBy(id ="up_ckyc_frontpic")
    private WebElement up_ckyc_frontpic;

    public WebElement getUp_ckyc_frontpic() {
        return up_ckyc_frontpic;
    }

    @FindBy(id ="up_ckyc_backpic")
    private WebElement up_ckyc_backpic;

    public WebElement getUp_ckyc_backpic() {
        return up_ckyc_backpic;
    }

    @FindBy(id="depInv-img-preview")
    private WebElement depInv_img_preview;

    public WebElement getDepInv_img_preview() {
        return depInv_img_preview;
    }

    @FindBy(id="dep-preview-img-done")
    private WebElement dep_preview_img_done;

    public WebElement getDep_preview_img_done() {
        return dep_preview_img_done;
    }

    @FindBy(id ="step-btn-2")
    private WebElement step_btn_2;

    public WebElement getStep_btn_2() {
        return step_btn_2;
    }

}
