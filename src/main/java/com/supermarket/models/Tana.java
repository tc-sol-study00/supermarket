package com.supermarket.models;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Tana {
	
	private final String taneName;
	private final int maxchinretsuShohin = 10;
	private ArrayList<Shohin> chinretsuShohins = new ArrayList<Shohin>();
}
