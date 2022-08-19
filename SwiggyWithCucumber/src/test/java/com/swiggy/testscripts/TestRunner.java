package com.swiggy.testscripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "Features" 
				, glue = "com.swiggy.testscripts" 
				, plugin = {"progress", "html:target/Cucumber.html"}
					)

public class TestRunner extends AbstractTestNGCucumberTests {

}
