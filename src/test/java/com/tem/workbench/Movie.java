package com.tem.workbench;

/**
 * 
 * This class defines all the variables, setters/getters and constructor
 * for Movies
 * @author ash
 *
 */
public class Movie {

	private String movie;
	private String actor;
	
	public Movie(String movie, String actor) {
		this.movie = movie;
		this.actor = actor;
	}
	
	public void setMovie(String movie) {
		this.movie = movie;
	}
	
	public void setActor(String actor) {
		this.actor = actor;
	}
	
	public String getMovie() {
		return movie;
	}
	
	public String getActor() {
		return actor;
	}
}
