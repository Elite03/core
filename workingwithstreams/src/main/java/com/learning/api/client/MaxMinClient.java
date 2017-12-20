package com.learning.api.client;

import com.learning.api.MaximaAndMinima;

import java.util.List;
import java.util.Optional;

public class MaxMinClient {

    private final MaximaAndMinima maximaAndMinima;

    public MaxMinClient(MaximaAndMinima maximaAndMinima) {
        this.maximaAndMinima = maximaAndMinima;
    }


    public Optional<Integer> findMax(List<Integer> intList) {
        return maximaAndMinima.findMax(intList);
    }

    public Optional<Integer> findMin(List<Integer> integerList) {
        return maximaAndMinima.findMin(integerList);
    }
}
