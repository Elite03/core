package com.java8.ch06.test;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.java8.ch06.api.GroupingTransactions;
import com.util.shared.model.ch06.Transaction;
import com.util.shared.model.repo.TransactionRepo;

public class TestingGroupingByTransaction {

	private List<Transaction> list;
	private GroupingTransactions gt;

	@BeforeTest
	public void setUp() {
		list = TransactionRepo.all();
		gt = new GroupingTransactions();
	}

	public Long countCurrnecies() {
		return list.stream().map(Transaction::getCurrency).distinct().count();
	}

	@Test
	public void test() {
		long count = countCurrnecies();
		long currencyCount = gt.groupingFunctionally().keySet().stream().count();
		Assert.assertEquals(count, currencyCount);

	}

}
