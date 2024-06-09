package org.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Baseclass.Base;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\org\\feature\\Openmrs.feature",
                  glue="org.stepdefinition",
                  monochrome=false,
                  dryRun=false,
                  plugin={"pretty",
                		  "html:HTMLReports/openmrsLoginReport.html",
                		  "json:JSONReports/openmrsLoginReport.html",
                		  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
                		 })
public class Run {
	
}
