package com.java8.ch06.test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.java8.ch06.api.MaxMinApi;

public class MaxMinAPITest {

	private MaxMinApi api;

	@BeforeTest
	public void setUp() {
		api = new MaxMinApi();
	}

	@Test
	public void test() {
		Assert.assertEquals(api.lowestCalorieDish().getCalories(), 120);
		Assert.assertEquals(api.mostCalorieDish().getCalories(), 800);
	}
}
