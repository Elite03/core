package com.java8.ch06.api;

import java.util.List;
import java.util.stream.Collectors;

import com.util.shared.model.Dish;
import com.util.shared.model.repo.DishRepository;

public class Summarization {

	private List<Dish> dishes;

	public Summarization() {
		dishes = DishRepository.list();
	}

	public Integer countCaloriesInReduction() {
		return dishes.stream().map(Dish::getCalories).reduce(0, Integer::sum);
	}

	public Integer countCaloriesInCollector() {
		return dishes.stream().collect(Collectors.summingInt(Dish::getCalories));
	}
}
