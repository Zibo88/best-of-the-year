package com.corsojava.bestoftheyear;

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
