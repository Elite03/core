package com.java8.ch06.test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.java8.ch06.api.GroupingTransactions;
import com.util.shared.model.ch06.Currency;
import com.util.shared.model.ch06.Transaction;

public class GroupingByTransactionTest {

	private GroupingTransactions api;
	private Logger LOG;

	@BeforeTest
	public void setup() {
		api = new GroupingTransactions();
		LOG = LoggerFactory.getLogger(GroupingByTransactionTest.class);
	}

	@Test
	public void groupingImperativelyTest() {
		Map<Currency, List<Transaction>> myMap = api.groupingImperatively();
		Assert.assertNotNull(myMap);
		List<Transaction> transactions = null;
		Iterator<Currency> iterator = myMap.keySet().iterator();
		Currency currency = null;
		Iterator<Transaction> transactionIterator = null;

		while (iterator.hasNext()) {
			currency = iterator.next();
			transactions = myMap.get(currency);
			transactionIterator = transactions.listIterator();
			while (transactionIterator.hasNext()) {
				LOG.info("Key: {}, Value: {}", currency, transactionIterator.next());
			}

		}
	}

	@Test(dependsOnMethods = "groupingImperativelyTest")
	public void groupingFunctionallyTest() {
		LOG.info("Starting Functionally\n");
		Map<Currency, List<Transaction>> myMap = api.groupingFunctionally();
		Assert.assertNotNull(myMap);
		List<Transaction> transactions = null;
		Iterator<Currency> iterator = myMap.keySet().iterator();
		Currency currency = null;
		Iterator<Transaction> transactionIterator = null;

		while (iterator.hasNext()) {
			currency = iterator.next();
			transactions = myMap.get(currency);
			transactionIterator = transactions.listIterator();
			while (transactionIterator.hasNext()) {
				LOG.info("Key: {}, Value: {}", currency, transactionIterator.next());
			}

		}
	}
}
