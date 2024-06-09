package org.stepdefinition;

import org.testng.Assert;

import com.Baseclass.Base;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.pom.LoginPage;
import com.poma.PageObjectManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef extends Base  {
	
	PageObjectManager pom = new PageObjectManager();
	
	@Given("user launch Chrome browser")
	public void user_launch_chrome_browser() {
	    
		getDriver("chrome");
	}
	
	@When("user opens Url {string}")
	public void user_opens_url(String url) {
		launchUrl(url);
	}
	@When("user enter the username in the {string} in the email field")
	public void user_enter_the_username_in_the_in_the_email_field(String username) {
		passInput(pom.getLp().getUsername(),username);
	}
	@When("user enter the password in the {string} in the password field")
	public void user_enter_the_password_in_the_in_the_password_field(String password) {
		passInput(pom.getLp().getPassword(),password);
	}

	@When("user click inpatient ward")
	public void user_click_inpatient_ward() {
		clickButton(pom.getLp().getClick());
	}

	@When("user click login button")
	public void user_click_login_button() {
		clickButton(pom.getLp().getLogin());
	}
	
	@Then("user can view Dashboard page")
	public void user_can_view_dashboard_page() {
	Assert.assertEquals("Logged in as Super User (admin) at Inpatient Ward",
            "Logged in as Super User (admin) at Inpatient Ward");
	}
	
	@Given("user click Register to enter details")
	public void user_click_register_to_enter_details() {
		clickButton(pom.getRp().getRegister());
	}
	@When("user enter firstname in the given field")
	public void user_enter_firstname_in_the_given_field() {
	    passInput(pom.getRp().getFirstname(), "kaviya");
    }
	@When("user click familyname to enter family name")
	public void user_click_familyname_to_enter_family_name() {
	    clickButton(pom.getRp().getFamilynameclick());
	}
	@When("user enter family name in the family name field")
	public void user_enter_family_name_in_the_family_name_field() {
	    passInput(pom.getRp().getFamilyname(),"k");
	}
	@When("user click arrow button to navigate to next page")
	public void user_click_arrow_button_to_navigate_to_next_page() {
	    clickButton(pom.getRp().getArrow1());
	}
	@When("User select gender")
	public void user_select_gender() {
	    clickButton(pom.getRp().getGender());
	}
	@When("user click arrow button to go next page")
	public void user_click_arrow_button_to_go_next_page() {
	    clickButton(pom.getRp().getArrow2());
	}
	@When("user enter birthdate in the date field")
	public void user_enter_birthdate_in_the_date_field() {
	    passInput(pom.getRp().getBirthdate(),"11");
	}
	@When("user select birthmonth using dropdown")
	public void user_select_birthmonth_using_dropdown() {
		selectbyVisibletext(pom.getRp().getMonth(),"February");
	}
	@When("user click birthyear button")
	public void user_click_birthyear_button() {
	    clickButton(pom.getRp().getYearclick());
	}

	@When("user enter birthyear in the year field")
	public void user_enter_birthyear_in_the_year_field() {
	    passInput(pom.getRp().getYearenter(),"1996");
	}
	@When("user click arrow button")
	public void user_click_arrow_button() {
	    clickButton(pom.getRp().getArrow3());
	}

	@When("user click country name to enter country name")
	public void user_click_country_name_to_enter_country_name() throws InterruptedException {
		Thread.sleep(5000);
	    clickButton(pom.getRp().getCountryclick());
	}
	@When("user enter country name")
	public void user_enter_country_name() throws InterruptedException {
		Thread.sleep(5000);
	    passInput(pom.getRp().getCountryenter(),"india");
	}

	@When("click phonenumber button")
	public void click_phonenumber_button() {
	    clickButton(pom.getRp().getClickphone());
	}
	@When("enter phonenumber")
	public void enter_phonenumber() {
	   passInput(pom.getRp().getEnterphone(),"9167543987");
	   
	}
	
	@When("user click submit to confirm")
	public void user_click_submit_to_confirm() {
	    clickButton(pom.getRp().getSubmit());
	}
	@Then("user verify patient details registered or not")
	public void user_verify_patient_details_registered_or_not() {
	    Assert.assertEquals(driver.getTitle(),"OpenMRS Electronic Medical Record");
	}
	
	@Given("user click start visit to enter vitals details")
	public void user_click_start_visit_to_enter_vitals_details() throws InterruptedException {
		Thread.sleep(3000);
		clickButton(pom.getVp().getStartvisit());
	}
	@When("user click confirm button using alert")
	public void user_click_confirm_button_using_alert() throws InterruptedException {
		Thread.sleep(3000);
		clickButton(pom.getVp().getConfirm());
	}
	@When("user click capture vitals menu")
	public void user_click_capture_vitals_menu() throws InterruptedException {
		Thread.sleep(10000);
		clickButton(pom.getVp().getCapture());
	}
	@When("user enter heigth")
	public void user_enter_heigth() {
	   passInput(pom.getVp().getHeight(),"156");
	}
	@When("user click weight button")
	public void user_click_weight_button() {
	    clickButton(pom.getVp().getWeightclick());
	}
	@When("user enter weight in the field")
	public void user_enter_weight_in_the_field() {
	    passInput(pom.getVp().getWeightenter(),"58");
	}
	@When("user click temp to enter temperature")
	public void user_click_temp_to_enter_temperature() throws InterruptedException {
		
		Thread.sleep(5000);
		clickButton(pom.getVp().getTempclick());
	}
	@When("user enter temp in the field")
	public void user_enter_temp_in_the_field() throws InterruptedException {
		Thread.sleep(5000);
	    passInput(pom.getVp().getTempenter(),"34");
	}
	@When("user click pulse to enter pulse")
	public void user_click_pulse_to_enter_pulse() throws InterruptedException {
		Thread.sleep(5000);
	    clickButton(pom.getVp().getPulseclick());
	}
	@When("user enter pulse in the field")
	public void user_enter_pulse_in_the_field() throws InterruptedException {
		Thread.sleep(5000);
	    passInput(pom.getVp().getPulseenter(),"44");
	}
	@When("user click blood pres min to enter level")
	public void user_click_blood_pres_min_to_enter_level() throws InterruptedException {
		Thread.sleep(5000);
	    clickButton(pom.getVp().getBloodclick());
	}
	@When("user enter min blood pressure")
	public void user_enter_min_blood_pressure() throws InterruptedException {
		Thread.sleep(5000);
		passInput(pom.getVp().getBloodenter(), "80");
	   
	}
	@When("user click high blood pres button enter blood pres")
	public void user_click_high_blood_pres_button_enter_blood_pres() throws InterruptedException {
		Thread.sleep(5000);
		clickButton(pom.getVp().getBloodmaxclick());
	}
	@When("user enter high blood pres level")
	public void user_enter_high_blood_pres_level() throws InterruptedException {
		Thread.sleep(5000);
	   passInput(pom.getVp().getBloodmaxenter(),"120");
	}
	
	@When("user click save form button")
	public void user_click_save_form_button() {
	  clickButton(pom.getVp().getSaveform());
	}
	@When("user click save button to save the details")
	public void user_click_save_button_to_save_the_details() {
        clickButton(pom.getVp().getSave());
	}
	
	@When("user click patientname to check the deatils")
	public void user_click_patientname_to_check_the_deatils() throws InterruptedException {
		Thread.sleep(10000);
	    clickButton(pom.getVp().getCheck());
	}
	@Then("user verify patient medical details registered or not")
	public void user_verify_patient_medical_details_registered_or_not() {
	    Assert.assertEquals(driver.getTitle(), "OpenMRS Electronic Medical Record");
	}
	
	@Given("user click delete patient")
	public void user_click_delete_patient() {
	   
		clickButton(pom.getDp().getDelete());
	}
	@When("user write reason for delete")
	public void user_write_reason_for_delete() {
	    passInput(pom.getDp().getReason(),"doctor not available");
	}
	@When("user click confirm button to delete")
	public void user_click_confirm_button_to_delete() {
	    clickButton(pom.getDp().getDeleteconfirm());
	}
	
	@When("user click patient details to delete")
	public void user_click_patient_details_to_delete() throws InterruptedException {
		Thread.sleep(3000);
	    clickButton(pom.getDp().getDetaildelete());
	}
	@When("user click logout button")
	public void user_click_logout_button() throws InterruptedException {
		Thread.sleep(3000);
	   clickButton(pom.getDp().getLogout());
	}


	
}
