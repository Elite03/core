package com.java8.ch06.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.util.shared.model.ch06.Currency;
import com.util.shared.model.ch06.Transaction;
import com.util.shared.model.repo.TransactionRepo;

public class GroupingTransactions {

	private List<Transaction> transactions;

	public GroupingTransactions() {
		this.transactions = TransactionRepo.all();
	}

	public Map<Currency, List<Transaction>> groupingImperatively() {
		Map<Currency, List<Transaction>> collectedMap = new HashMap<>();

		for (Transaction t : transactions) {
			Currency currency = t.getCurrency();
			List<Transaction> transactionByCurrency = collectedMap.get(currency);
			if (transactionByCurrency == null) {
				transactionByCurrency = new ArrayList<>();
			}
			transactionByCurrency.add(t);
			collectedMap.put(currency, transactionByCurrency);
		}

		return collectedMap;
	}

	public Map<Currency, List<Transaction>> groupingFunctionally() {
		return transactions.stream().collect(Collectors.groupingBy(Transaction::getCurrency));
	}
}
