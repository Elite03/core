package com.learning.api.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.learning.api.Basics;

public class BasicsClient {

    private final Logger LOG;
    private Basics object;

    public BasicsClient() {
        this.LOG = LoggerFactory.getLogger(BasicsClient.class);
        this.object = new Basics();
    }

    public void operationSequence() {
        this.displayVeganDishes();
    }

    public void displayVeganDishes() {
        object.vegitarianDishes().forEach(e -> LOG.info("element: {}", e.toString()));
    }

    public static void main(String[] args) {
        BasicsClient client = new BasicsClient();
        client.operationSequence();
    }
}
