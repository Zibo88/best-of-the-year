package com.corsojava.bestoftheyear;

public class Movie {
	
	private int id;
	private String titolo="";
	
	
	public Movie(int id, String titolo) {
		super();
		this.id = id;
		this.titolo = titolo;
	}


	public String getTitolo() {
		return titolo;
	}
	
	public int getId() {
		return id;
	}
	
	
}
