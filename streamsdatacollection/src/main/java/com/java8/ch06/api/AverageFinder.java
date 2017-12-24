package com.java8.ch06.api;

import java.util.List;
import java.util.stream.Collectors;

import com.util.shared.model.Dish;
import com.util.shared.model.repo.DishRepository;

public class AverageFinder {

	private List<Dish> dishes;

	public AverageFinder() {
		dishes = DishRepository.list();
	}

	private Integer totalCount() {
		return (int) dishes.stream().count();
	}

	public double avgUsingReduction() {
		return dishes.stream().map(Dish::getCalories).reduce(Integer::sum).get() / this.totalCount();
	}

	public double avgUsingCollectors() {
		return dishes.stream().collect(Collectors.averagingDouble(Dish::getCalories));
	}
}
