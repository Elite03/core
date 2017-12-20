package com.learning.api.client;

import java.util.stream.IntStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.learning.api.ReductionAPI;
import com.util.shared.model.Dish;
import com.util.shared.model.repo.DishRepository;

public class ReductionApiClient {

	public final Logger LOG;

	public ReductionApiClient() {
		this.LOG = LoggerFactory.getLogger(ReductionApiClient.class);
	}

	public Integer caluclateCalories() {
		Integer initValue = 0;
		for (Dish d : DishRepository.list()) {
			initValue = Integer.sum(initValue, d.getCalories());
		}

		return initValue;
	}

	public void calcualteSum() {
		Integer sumUpto100 = ReductionAPI.addition(IntStream.range(0, 100).boxed()).get();
		Integer sumWithInitValue = ReductionAPI.addition(9, IntStream.range(0, 4).boxed());
		Integer calcualteCalories = ReductionAPI.totalCalories(DishRepository.list().stream()).get();
		LOG.info("{}", sumUpto100);
		LOG.info("{}", sumWithInitValue);
		LOG.info("{}", calcualteCalories);
		LOG.info("{}", caluclateCalories());

	}

	public static void main(String[] args) {
		ReductionApiClient object = new ReductionApiClient();
		object.calcualteSum();
	}
}
