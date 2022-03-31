package com.tem.app;

/**
 * 
 * This class defines all the variables, setters/getters and constructor
 * for Movies
 * @author ash
 *
 */
public class MovieByGenre extends Movie {

	private String genre;
	
	public MovieByGenre(String movie, String genre) {
		super(movie);
		this.genre = genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}
}
