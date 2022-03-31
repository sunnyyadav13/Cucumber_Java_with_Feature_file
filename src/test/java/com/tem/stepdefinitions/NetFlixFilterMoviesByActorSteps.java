package com.tem.stepdefinitions;

import java.util.List;

import org.junit.Assert;

import com.tem.app.MovieByActor;
import com.tem.app.MovieOnNetflixByActor;
import com.tem.utils.DependencyUtil;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class NetFlixFilterMoviesByActorSteps {
	
	DependencyUtil service;
	
	public NetFlixFilterMoviesByActorSteps(DependencyUtil service) {
		this.service = service;
	}
	
	
	int moviesOnNetflixByActor;
	

	MovieByActor movieByActor;
	MovieOnNetflixByActor moviesOnNetFlix = new MovieOnNetflixByActor(); 


	@And("I have the following movies on Netflix based on Actor")
	public void i_have_the_following_movies_on_Netflix(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	   
	
		List<List<String>> rows = dataTable.asLists(String.class);
		
		for (List<String> list : rows) {
			System.out.println("Movie: " + list.get(0));
			System.out.println("Actor: " + list.get(1));
			
			movieByActor = new MovieByActor(list.get(0), list.get(1));
			moviesOnNetFlix.setMovieByActorList(movieByActor);
		}	
	}

	@When("I search for movies by Actor {string}")
	public void i_search_for_movies_by(String actor) {
		moviesOnNetflixByActor = moviesOnNetFlix.getMovieByActorList(actor).size();
		System.out.println("Movies count actual: " + moviesOnNetflixByActor);
	}

	@Then("I find Number of {string} by Actor")
	public void i_find_Number_of(String expected) {
		try {
			System.out.println("Actual: " + moviesOnNetflixByActor);
			System.out.println("Expected: " + expected);
			Assert.assertEquals(Integer.parseInt(expected), moviesOnNetflixByActor);
			System.out.println("Test Passed");
		} catch (AssertionError e) {
			System.out.println("Test Failed");
			Assert.fail();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
