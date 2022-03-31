package com.tem.app;

/**
 * 
 * This class defines all the variables, setters/getters and constructor
 * for Movies
 * @author ash
 *
 */
public class MovieByActor extends Movie {

	private String actor;
	
	public MovieByActor(String movie, String actor) {
		super(movie);
		this.actor = actor;
	}
	
	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getActor() {
		return actor;
	}
}
