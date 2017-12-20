package com.learning.api.client;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.learning.api.UniqueFilteringAPI;

public class UniqueFilteringAPIClient {

	private UniqueFilteringAPI object;
	private final Logger LOG;

	public UniqueFilteringAPIClient() {
		this.object = new UniqueFilteringAPI();
		this.LOG = LoggerFactory.getLogger(UniqueFilteringAPIClient.class);
	}

	public void operateSequence() {
		// this.object.getEvenDistinces().forEach(e -> LOG.info("{}", e));
		// this.object.getMeatDishes().forEach(e -> LOG.info("{}", e));
		// LOG.info("Total distinct meats: {}", object.getDistinctTypeCount());
		this.displayArrayPairs();
	}

	public void displayArrayPairs() {
		List<Integer> listA = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> listB = Arrays.asList(4, 5);
		LOG.info("total Combinations: {}", this.object.getPairs(listA, listB).count());
		LOG.info("total count: {}", this.object.getParisDivisibleByThree(listA, listB).count());
	}

	public static void main(String[] args) {
		UniqueFilteringAPIClient object = new UniqueFilteringAPIClient();
		object.operateSequence();

	}
}
