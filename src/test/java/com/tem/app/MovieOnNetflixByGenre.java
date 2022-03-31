package com.tem.app;

import java.util.ArrayList;
import java.util.List;

public class MovieOnNetflixByGenre {

	private List<MovieByGenre> MovieByGenreList = new ArrayList<>();
	private List<MovieByGenre> foundList = new ArrayList<>();
	
	/**
	 * 
	 * @param MovieByGenre
	 */
	public void setMovieByGenreList(MovieByGenre MovieByGenre) {
		MovieByGenreList.add(MovieByGenre);
	}
	
	/**
	 * 
	 * @param Genre
	 * @return foundList
	 */
	public List<MovieByGenre> getMovieByGenreList(String Genre) {
		
		/*
		 * 
		 */
		for (MovieByGenre MovieByGenre : MovieByGenreList) {
			if(MovieByGenre.getGenre().equals(Genre)) {
				foundList.add(MovieByGenre);
				continue;
			}
		}
		
		return foundList;
		
	}
}
