package com.learning.api;

import com.util.shared.model.Dish;
import com.util.shared.model.repo.DishRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;

public class FindReduceAPI {


    private final List<Dish> dishes;

    public FindReduceAPI() {
        dishes = DishRepository.list();
    }

    public Optional<Integer> countAvailableDishes() {
        return dishes
                .stream()
                .map(d -> 1)
                .reduce(Integer::sum);
    }
}
