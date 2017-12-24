package com.java8.ch06.api;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.util.shared.model.Dish;
import com.util.shared.model.repo.DishRepository;

public class MaxMinApi {

	private List<Dish> dishes;

	public MaxMinApi() {
		dishes = DishRepository.list();
	}

	private Comparator<Dish> dishComprator() {
		return Comparator.comparing(Dish::getCalories);
	}

	public Dish mostCalorieDish() {
		return dishes.stream().collect(Collectors.maxBy(dishComprator())).get();
	}

	public Dish lowestCalorieDish() {
		return dishes.stream().collect(Collectors.minBy(dishComprator())).get();
	}

	// 120,800
}
