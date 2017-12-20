package com.learning.api;

import java.util.List;
import java.util.stream.Collectors;

import com.util.shared.model.Dish;
import com.util.shared.model.repo.DishRepository;

public class Basics {

    private List<Dish> dishes;

    public Basics() {
        this.dishes = DishRepository.list();
    }

    public List<Dish> vegitarianDishes() {
        return dishes.stream().filter(Dish::isVegetarian).collect(Collectors.toList());
    }

}
