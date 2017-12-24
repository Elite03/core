package com.java8.ch06.test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.java8.ch06.api.Summarization;

public class SummarizationTest {

	private Summarization api;

	@BeforeTest
	public void setup() {
		api = new Summarization();
	}

	@Test
	public void test() {
		Assert.assertEquals(api.countCaloriesInCollector(), api.countCaloriesInReduction());
	}
}
