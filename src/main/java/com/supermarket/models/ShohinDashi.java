package com.supermarket.models;

import java.util.ArrayList;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class ShohinDashi {

	private ArrayList<Shohin> deliveryList = new ArrayList<Shohin>();

	public ShohinDashi() {
		deliveryList.add(new Shohin("日用品", "フィルター", 300));
		deliveryList.add(new Shohin("日用品", "フィルター", 300));
		deliveryList.add(new Shohin("日用品", "フィルター", 300));
		deliveryList.add(new Shohin("日用品", "フィルター", 300));
	}

	public void ShohinSet(ArrayList<TanaCategory> tanaCategories) {
		this.deliveryList.forEach(data -> {
			var categery = data.getCategoryName();
			TanaCategory selectedCategory = tanaCategories.stream().filter( s -> s.getCategoryName().equals(categery)).findFirst().orElse(null); ;
			if(selectedCategory != null) {
				selectedCategory.getTanas().forEach(data2 -> {
					if(data2.getChinretsuShohins().stream().count()< data2.getMaxchinretsuShohin()){
						data2.getChinretsuShohins().add(data);
					}
				});
			}
		});
	}
}