package org.reporting;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features folder\\LoginPage.feature",glue="org.stepdefinition",monochrome=true,plugin="json:src\\test\\resources\\Jason folder\\report\\A.json")

public class TestRunner {
	@AfterClass
	public static void genreport() {
		Reporting.genReport("C:\\Users\\ELCOT\\eclipse-workspace\\Cucumber\\src\\test\\resources\\Jason folder\\report\\A.json");
	}

}
