package com.supermarket.models;

import java.util.ArrayList;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class TanaCategory {
	private final String categoryName;
	
	private ArrayList<Tana> tanas; 
	
	public TanaCategory(String categoryName) {
		this.categoryName = categoryName;
		
		tanas = new ArrayList<Tana>();
		for( int l= 1; l <=3 ; l++) {
			tanas.add(new Tana("Tana-"+Integer.toString(l)));
		}
	}
}
