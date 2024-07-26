package com.supermarket.models;

import jakarta.servlet.http.HttpSession;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Shohin {
	private final String categoryName;
	private final String shohinName; 
	private final int price; 
}
