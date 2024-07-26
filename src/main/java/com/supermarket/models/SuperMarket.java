package com.supermarket.models;

import java.util.ArrayList;

import org.hibernate.mapping.List;
import com.supermarket.models.*;

public class SuperMarket {

	private ArrayList<TanaCategory> categories;
	public　void MakeEnv() {
		categories = new ArrayList<TanaCategory>(); 
		
		categories.add(new TanaCategory("日用品"));
		categories.add(new TanaCategory("食料品"));
	}
}
