package com.serene.tests.features;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= "src/test/resources/Features/Country/Country.Feature")

public class CountryAPITestRunner {
	
}
