package com.stepDefinition;

import com.BaseClass.WaitBaseClass;
import com.Pojo.SchemeDetails_Xpaths;
import com.Pojo.X_Paths;
import com.constants.Constants;
import io.cucumber.java.en.*;
public class definition extends WaitBaseClass {

    @Given("user navigates to STFC_Landing Page")
    public void user_navigates_to_stfc_landing_page() {

        try {
            String s = "fixed";
            if (Constants.UrlChecking.contains(s)) {

                System.out.println("Url verified successfully");
                String s1 = writeInPropertiesFile("ValidUrl", "PASS");
                System.out.println(s1);

            } else {
                System.out.println("Url mismatch");
                writeInPropertiesFile("InValidUrl", "FAIL");
            }

        } catch (Exception e) {
            System.out.println(e);
            takeScreenShotFail("user couldn't see the login page");
        }

    }

    @When("I enter Username as {string} and Password as {string} and EmailId as {string}")
    public void i_enter_username_as_and_password_as_and_email_id_as(String Mobile_No, String Pin_code, String emailId) {
        try {
            highlightWebElement(X_Paths.getInstance().getMobileNo());
            waitSendKeys(X_Paths.getInstance().getMobileNo(), Mobile_No);
            highlightWebElement(X_Paths.getInstance().getPinCode());
            waitSendKeys(X_Paths.getInstance().getPinCode(), Pin_code);
            highlightWebElement(X_Paths.getInstance().getEmailID());
            waitSendKeys(X_Paths.getInstance().getEmailID(), emailId);
            String s = writeInPropertiesFile("validEmailId", "PASS");
            System.out.println(s);
        } catch (Exception e) {
            System.out.println(e);
            takeScreenShotFail("invalid Arguments");
        }
    }
    @Then("I click the InvestNow")
    public void i_click_the_invest_now() {

        try {
            btnClick(X_Paths.getInstance().getInvest_now_button());
        } catch (Exception e) {
            System.out.println(e);
            takeScreenShotFail("Invest now button is not clicked");
        }

    }

    @Then("OTP field should displayed")
    public void otp_field_should_displayed() {

        try {
            boolean displayed = X_Paths.getInstance().getVerifyOtp().isDisplayed();
            if (displayed) {

                System.out.println("OTP field is displayed");

            } else {
                System.out.println("OTP field is not displayed");
            }
        } catch (Exception e) {
            System.out.println(e);
            takeScreenShotFail("Invest now button is not clicked");
        }

    }

    @Then("User Verify the Scheme_details_Page")
    public void user_verify_the_scheme_details_page() {

        try {
            boolean displayed = SchemeDetails_Xpaths.getInstance().getScheme_Details_Page().isDisplayed();

            if (displayed) {
                System.out.println("User is on the Scheme Details Page");

            } else {
                System.out.println("User couldn't see the Scheme Details Page");
            }
        } catch (Exception e) {
            System.out.println(e);
            takeScreenShotFail("User couldn't see the Scheme Details Page");
        }

    }


    @When("user enter InvestAmount as {string} and Ternure_Input as {string}")
    public void user_enter_invest_amount_as_and_ternure_input_as(String amountInputFd, String tenureinputfd) {
        try {
            clear(SchemeDetails_Xpaths.getInstance().getAmount_input_fd());
            waitSendKeys(SchemeDetails_Xpaths.getInstance().getAmount_input_fd(), amountInputFd);
            clear(SchemeDetails_Xpaths.getInstance().getTenure_input_fd());
            waitSendKeys(SchemeDetails_Xpaths.getInstance().getTenure_input_fd(), tenureinputfd);
        } catch (Exception e) {
            System.out.println(e);
            takeScreenShotFail("Invest now button is not clicked");
        }

    }

    @Then("user click tenure info button")
    public void user_click_tenure_info_button() {

        try {
            System.out.println("user click tenure info button");
        } catch (Exception e) {
            System.out.println(e);
            takeScreenShotFail("user click tenure info button is not clicked");
        }
    }

    @Then("user click tenure done button")
    public void user_click_tenure_done_button() {

        try {
            System.out.println("user click tenure done button");
        } catch (Exception e) {
            System.out.println(e);
            takeScreenShotFail("user click tenure done button is not clicked");
        }
    }

    @Then("user click SelectInterestPayout info button")
    public void user_click_select_interest_payout_info_button() {
        try {
            System.out.println("user click SelectInterestPayout info button");
        } catch (Exception e) {
            System.out.println(e);
            takeScreenShotFail("user click SelectInterestPayout info button is not clicked");
        }
    }

    @Then("user SelectInterestPayout done button")
    public void user_select_interest_payout_done_button() {
        try {
            System.out.println("user SelectInterestPayout done button");
        } catch (Exception e) {
            System.out.println(e);
            takeScreenShotFail("user SelectInterestPayout done button is not clicked");

        }
    }

    @Then("user choose the InterestPayout DropDown")
    public void user_choose_the_interest_payout_drop_down() {
        try {
            System.out.println("user choose the InterestPayout DropDown");
        } catch (Exception e) {
            System.out.println(e);
            takeScreenShotFail("user choose the InterestPayout DropDown is not selected");
        }
    }

    @Then("user click the Are u senior citizen button")
    public void user_click_the_are_u_senior_citizen_button() {
        try {
            System.out.println("user click the Are u senior citizen button");
        } catch (Exception e) {
            System.out.println(e);
            takeScreenShotFail("user click the Are u senior citizen button is not clicked");
        }
    }

    @Then("user click the Continue Button")
    public void user_click_the_continue_button() {

        try {
            System.out.println("user click the Continue Button");
        } catch (Exception e) {
            System.out.println(e);
            takeScreenShotFail("user click the Continue Button is not clicked");
        }
    }

    @Then("PAN details Page should displayed")
    public void pan_details_page_should_displayed() {

        try {
            System.out.println("PAN details Page should displayed");
        } catch (Exception e) {
            System.out.println(e);
            takeScreenShotFail("PAN details Page is not displayed");
        }
    }

}







