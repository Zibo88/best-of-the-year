package com.corsojava.bestoftheyear;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class Songs {
	
	private int id;
	private String titolo = "";
	
	public Songs(int id, String titolo) {
		super();
		this.id = id;
		this.titolo = titolo;
	}

	public int getId() {
		return id;
	}

	public String getTitolo() {
		return titolo;
	}
	
	
	
	
	
	
	
}
