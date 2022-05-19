package org.hookstest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ELCOT\\eclipse-workspace\\Cucumber\\src\\test\\resources\\Features folder\\Hooks.feature",
					glue="org.hooks")


public class TestRunner {

}
