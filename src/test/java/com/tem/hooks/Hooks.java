package com.tem.hooks;

import com.tem.utils.DependencyUtil;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	DependencyUtil service;
	
	public Hooks(DependencyUtil service) {
		this.service = service;
	}

	
	@Before
	public void beforeScenario(Scenario scenario) {
		service.scenario = scenario;
		System.out.println("Scenario starts here... " + service.scenario.getName());
		service.scenario.write("Scenario starts here...");
	}
	
	@After
	public void afterScenario(Scenario scenario) {
		System.out.println("Scenario ends here...");
		service.scenario.write("Scenario ends here...");
	}
}
