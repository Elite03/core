package com.learning.api;

import java.util.List;
import java.util.Optional;

public class MaximaAndMinima {

    public Optional<Integer> findMax(List<Integer> intList) {
        return intList
                .stream()
                .reduce(Integer::max);
    }

    public Optional<Integer> findMin(List<Integer> integerList) {
        return integerList
                .stream().reduce(Integer::min);
    }

}
