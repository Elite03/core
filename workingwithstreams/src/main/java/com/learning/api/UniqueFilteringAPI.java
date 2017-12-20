package com.learning.api;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import com.util.shared.model.Dish;
import com.util.shared.model.enums.Type;
import com.util.shared.model.repo.DishRepository;

public class UniqueFilteringAPI {
	private List<Dish> dishes = DishRepository.list();

	public List<Integer> intRepository() {
		return Arrays.asList(1, 2, 1, 3, 3, 2, 4);
	}

	public Stream<Integer> getEvenDistinces() {
		return this.intRepository().stream().filter(element -> Math.floorDiv(element, 2) == 0).distinct();
	}

	public Stream<Dish> getMeatDishes() {
		return this.dishes.stream().filter(d -> d.getType() == Type.MEAT).limit(2);
	}

	public Long getDistinctTypeCount() {
		return this.dishes.stream().map(Dish::getType).map(String::valueOf).distinct().count();
	}

	public Stream<Integer> getSquares(Integer... array) {
		return Arrays.asList(array).stream().map(e -> e * e);
	}

	public Stream<int[]> getPairs(List<Integer> listA, List<Integer> listB) {
		return listA.stream().flatMap(i -> listB.stream().map(j -> new int[] { i, j }));
	}

	public Stream<int[]> getParisDivisibleByThree(List<Integer> listA, List<Integer> listB) {
		return listA.stream().flatMap(
				i -> listB.stream().filter(j -> Objects.equals(Integer.sum(i, j) % 3, 0)).map(k -> new int[] { i, k }));
	}

}
