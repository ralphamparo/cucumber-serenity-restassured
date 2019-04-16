package com.serene.tests.features.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Steps;

import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
public class CountryStepDfn {
	

	@Before
	public void setup()
	{
		RestAssured.reset();
    	RestAssured.baseURI = "https://restcountries.eu/";
	}
	
	@After
	public void tearDown()
	{
        RestAssured.reset();
	}
	@Steps
	CountryAPISteps countryAPISteps;

	@Given("^I provide a valid country name \"([^\"]*)\"")
    public void i_provide_valid_country_name(String country) {
		Serenity.setSessionVariable("name").to(country);
		countryAPISteps.provideCountryName(country);
	}

	@When("^I send request to verify if \"([^\"]*)\"'s capital is \"([^\"]*)\"")
	public void i_send_request_to_retrieve_country_info(String country,String capital) throws Throwable {
		countryAPISteps.getCapital(country, capital);
	}

	
}
