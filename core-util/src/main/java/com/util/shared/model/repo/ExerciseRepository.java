package com.util.shared.model.repo;

import com.util.shared.model.Trader;
import com.util.shared.model.Transaction;

import java.util.Arrays;
import java.util.List;

public class ExerciseRepository {

	public List<Trader> traders;

	public List<Transaction> transactions;

	public ExerciseRepository() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		this.traders = Arrays.asList(raoul, mario, alan, brian);

		this.transactions = Arrays.asList(new Transaction(brian, 2011, 300), new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400), new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950));
	}

	public List<Transaction> getTransactions() {
		return this.transactions;
	}

	public List<Trader> getTraders() {
		return this.traders;
	}

}
