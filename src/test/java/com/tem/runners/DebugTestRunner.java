package com.tem.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		strict = true, 
        features = "classpath:features", 
        glue = { "com.tem.stepdefinitions"  }, 
        plugin = {"html:target/cucumber-pretty-report/regression-tests",
		"json:target/cucumber.json" }, 
        tags = { "@Debug" }

)

public class DebugTestRunner {

}
