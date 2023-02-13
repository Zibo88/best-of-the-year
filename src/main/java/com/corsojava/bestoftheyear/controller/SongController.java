package com.corsojava.bestoftheyear.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.corsojava.bestoftheyear.Songs;

@Controller
@RequestMapping("/songs")
public class SongController {
	@GetMapping
	public String songs(Model model) {
//		richiamo il metodo privato che mi crea una lista
		List <Songs> myBestSong = getBestSongs();
		model.addAttribute("songs", myBestSong);
		return "songs";
	}
	

	
//	funzione che deve ritornare una lista
	private List<Songs> getBestSongs(){
		List<Songs> bestSongs = new ArrayList<>();
		
		Songs mySong1 = new Songs(1, "prima canzone");
		bestSongs.add(mySong1);
		
		Songs mySong2 = new Songs(2, "seconda canzone");
		bestSongs.add(mySong2);
		
		return bestSongs;
		
	}
	
	@GetMapping("/{id}") 
	public String dettaglioMovie(Model model, @PathVariable("id") String id ) {
		List<Songs> bestSong = getBestSongs();
		model.addAttribute("song", bestSong.get(Integer.parseInt(id)-1));
	    return "song";
	}
}
