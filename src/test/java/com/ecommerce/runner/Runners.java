package com.ecommerce.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", glue = { "com.ecommerce.stepDefinitions" }, plugin = {
		"html:target/cucucmber-html-report.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })
public class Runners extends AbstractTestNGCucumberTests {

}
