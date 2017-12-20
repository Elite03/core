package com.learning.api;

import java.util.Optional;
import java.util.stream.Stream;

import com.util.shared.model.Dish;

public class ReductionAPI {

	public static Optional<Integer> addition(Stream<Integer> intStream) {
		return intStream.reduce(Integer::sum);
	}

	public static Integer addition(Integer initalValue, Stream<Integer> intStream) {
		return intStream.reduce(initalValue, Integer::sum);
	}

	public static Optional<Integer> totalCalories(Stream<Dish> stream) {
		return stream.map(Dish::getCalories).reduce(Integer::sum);
	}
}
