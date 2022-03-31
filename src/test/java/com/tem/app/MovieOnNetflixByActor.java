package com.tem.app;

import java.util.ArrayList;
import java.util.List;

public class MovieOnNetflixByActor {

	private List<MovieByActor> MovieByActorList = new ArrayList<>();
	private List<MovieByActor> foundList = new ArrayList<>();
	
	/**
	 * 
	 * @param MovieByActor
	 */
	public void setMovieByActorList(MovieByActor MovieByActor) {
		MovieByActorList.add(MovieByActor);
	}
	
	/**
	 * 
	 * @param actor
	 * @return foundList
	 */
	public List<MovieByActor> getMovieByActorList(String actor) {
		
		/*
		 * 
		 */
		for (MovieByActor MovieByActor : MovieByActorList) {
			if(MovieByActor.getActor().equals(actor)) {
				foundList.add(MovieByActor);
				continue;
			}
		}
		
		return foundList;
		
	}
}
