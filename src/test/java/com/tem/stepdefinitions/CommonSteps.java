package com.tem.stepdefinitions;

import com.tem.app.Login;
import com.tem.utils.DependencyUtil;

import cucumber.api.java.en.Given;

public class CommonSteps {
	
	DependencyUtil service;
	
	public CommonSteps(DependencyUtil service) {
		this.service = service;
	}
	
	String userName = "ash";
	String password = "ash1";
	Login login;
	
	@Given("I have signed in to Netflix")
	public void i_have_signed_in_to_Netflix() {
		//scenario.write("Given I have signed in to Netflix...");
		login = new Login(userName, password);
		System.out.println("Signed in.." + login.getUserName() + "-" + login.getPassword());
	}
}
