package com.java8.ch06.test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.java8.ch06.api.AverageFinder;

public class AverageFinderTest {

	private AverageFinder api;

	@BeforeTest
	public void setUp() {
		api = new AverageFinder();
	}

	@Test
	public void test() {
		Assert.assertEquals(api.avgUsingCollectors(), api.avgUsingReduction());
	}
}
