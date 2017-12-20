package com.learning.api;

import java.util.List;
import java.util.Optional;

import com.util.shared.model.Dish;
import com.util.shared.model.repo.DishRepository;

public class FindingAPI {

    private static List<Dish> dishRepository() {
        return DishRepository.list();
    }

    public static boolean isVegitarian() {
        return dishRepository()
                .stream()
                .anyMatch(Dish::isVegetarian);
    }

    public static Optional<Dish> findFirstVegDish() {
        return dishRepository()
                .stream()
                .filter(Dish::isVegetarian)
                .findFirst();
    }

    public static Optional<Dish> findAnyVegDish() {
        return dishRepository()
                .stream()
                .filter(Dish::isVegetarian)
                .findAny();
    }
}
