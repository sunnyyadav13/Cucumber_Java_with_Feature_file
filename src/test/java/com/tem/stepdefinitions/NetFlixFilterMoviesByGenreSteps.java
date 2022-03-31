package com.tem.stepdefinitions;

import java.util.List;

import org.junit.Assert;

import com.tem.app.MovieByGenre;
import com.tem.app.MovieOnNetflixByGenre;
import com.tem.utils.DependencyUtil;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class NetFlixFilterMoviesByGenreSteps {
	DependencyUtil service;
	
	public NetFlixFilterMoviesByGenreSteps(DependencyUtil service) {
		this.service = service;
	}

	int moviesOnNetflixByGenre;
	
	
	MovieByGenre movie;
	MovieOnNetflixByGenre moviesOnNetFlixByGenre = new MovieOnNetflixByGenre(); 
	
	@And("I have the following movies by genre on Netflix")
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
			
			movie = new MovieByGenre(list.get(0), list.get(1));
			moviesOnNetFlixByGenre.setMovieByGenreList(movie);
		}	
	}

	@When("I search for movies by Genre {string}")
	public void i_search_for_movies_by(String genre) {
		moviesOnNetflixByGenre = moviesOnNetFlixByGenre.getMovieByGenreList(genre).size();
		System.out.println("Movies count actual: " + moviesOnNetflixByGenre);
	}

	@Then("I find Number of {string} by Genre")
	public void i_find_Number_of(String expected) {
		try {
			System.out.println("Actual: " + moviesOnNetflixByGenre);
			System.out.println("Expected: " + expected);
			Assert.assertEquals(Integer.parseInt(expected), moviesOnNetflixByGenre);
			System.out.println("Test Passed");
		} catch (Exception e) {
			System.out.println("Test Failed");
			Assert.fail();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
