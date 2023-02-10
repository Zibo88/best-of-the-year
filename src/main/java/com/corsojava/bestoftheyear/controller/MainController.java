package com.corsojava.bestoftheyear.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.corsojava.bestoftheyear.Movie;
import com.corsojava.bestoftheyear.Songs;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/")
public class MainController {
	
	@GetMapping()
	public String home() {
		return "index";
	}
	
	@GetMapping("/movies") 
	public String movies(Model model) {
		List <Movie> myBestMovies = getBestMovies();
		model.addAttribute("movies", myBestMovies);
		return "movies";
	}
	
	@GetMapping("/songs")
	public String songs(Model model) {
		List <Songs> myBestSong = getBestSongs();
		model.addAttribute("songs", myBestSong);
		return "songs";
	}
	
	
	private List<Movie> getBestMovies(){
		List<Movie> bestMovie = new ArrayList<>();
		
		Movie myMovie1 = new Movie(1, "primo");
		bestMovie.add(myMovie1);
		
		Movie myMovie2 = new Movie(2, "secondo");
		bestMovie.add(myMovie2);
		
		return bestMovie;
		
	}
	
	private List<Songs> getBestSongs(){
		List<Songs> bestSongs = new ArrayList<>();
		
		Songs mySong1 = new Songs(1, "primo");
		bestSongs.add(mySong1);
		
		Songs mySong2 = new Songs(2, "secondo");
		bestSongs.add(mySong2);
		
		return bestSongs;
		
	}
	
	
	
	
	
}


