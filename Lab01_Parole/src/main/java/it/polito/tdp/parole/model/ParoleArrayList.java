package it.polito.tdp.parole.model;

import java.util.*;

public class ParoleArrayList {
	
	private List<String> lista;
		
	public ParoleArrayList() {
		lista = new ArrayList<String>();
	}
	
	public void addParola(String p) {
		lista.add(p);
		Collections.sort(lista);
	}
	
	public List<String> getElenco() {
		return lista;
	}
	
	public void reset() {
		lista.clear();
	}
	
	public void cancella(String s) {
		if(lista.contains(s)) {
			lista.remove(s);
		}
	}

}
