package com.definition;

import io.cucumber.java.en.*;

public class StepDefinition {

	@Given("user navigates to STFC_Landing Page")
	public void user_navigates_to_stfc_landing_page() {
		
		System.out.println("hioo");
	}

	@When("I enter Username as {string} and Password as {string} and EmailId as {string}")
	public void i_enter_username_as_and_password_as_and_email_id_as(String string, String string2, String string3) {
	}

	@Then("I click the InvestNow")
	public void i_click_the_invest_now() {
	}

	@Then("OTP field should displayed")
	public void otp_field_should_displayed() {
	}

	@Then("User Verify the Scheme_details_Page")
	public void user_verify_the_scheme_details_page() {
	}

	@When("user enter InvestAmount as {string} and Ternure_Input as {string}")
	public void user_enter_invest_amount_as_and_ternure_input_as(String string, String string2) {
	}

	@Then("user click tenure info button")
	public void user_click_tenure_info_button() {
	}

	@Then("user click tenure done button")
	public void user_click_tenure_done_button() {
	}

	@Then("user click SelectInterestPayout info button")
	public void user_click_select_interest_payout_info_button() {
	}

	@Then("user SelectInterestPayout done button")
	public void user_select_interest_payout_done_button() {
	}

	@Then("user choose the InterestPayout DropDown")
	public void user_choose_the_interest_payout_drop_down() {
	}

	@Then("user click the Are u senior citizen button")
	public void user_click_the_are_u_senior_citizen_button() {
	}

	@Then("user click the Continue Button")
	public void user_click_the_continue_button() {
	}

	@Then("PAN details Page should displayed")
	public void pan_details_page_should_displayed() {
	}

}
