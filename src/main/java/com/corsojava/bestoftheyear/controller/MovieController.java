package com.corsojava.bestoftheyear.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.corsojava.bestoftheyear.Movie;

@Controller
@RequestMapping("/movies")
public class MovieController {

	@GetMapping 
	public String movies(Model model) {
		List <Movie> myBestMovies = getBestMovies();
		model.addAttribute("movies", myBestMovies);
		return "movies";
	}
	
//	funzione che deve ritornare una lista
	private List<Movie> getBestMovies(){
		List<Movie> bestMovie = new ArrayList<>();
		
		Movie myMovie1 = new Movie(1, "primo");
		bestMovie.add(myMovie1);
		
		Movie myMovie2 = new Movie(2, "secondo");
		bestMovie.add(myMovie2);
		
		return bestMovie;
		
	}
	
	
	@GetMapping("/{id}") 
	public String dettaglioMovie(Model model, @PathVariable("id") String id ) {
		List<Movie> bestMovie = getBestMovies();
		model.addAttribute("movie", bestMovie.get(Integer.parseInt(id)-1) );
	    return "movie";
	}
	
	
}
