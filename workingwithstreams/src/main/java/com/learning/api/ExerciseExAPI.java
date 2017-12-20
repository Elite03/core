package com.learning.api;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.util.shared.model.Trader;
import com.util.shared.model.Transaction;
import com.util.shared.model.repo.ExerciseRepository;

public class ExerciseExAPI {

	private List<Transaction> transactions;

	public ExerciseExAPI() {
		ExerciseRepository ge = new ExerciseRepository();
		this.transactions = ge.getTransactions();
	}

	public List<Transaction> ofYear2011AndSortedByValue() {
		return this.transactions.stream().filter(t -> Objects.equals(t.getYear(), 2011))
				.sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());

	}

	public List<String> uniqueCityOfTraders() {
		return transactions.stream().map(Transaction::getTrader).map(Trader::getCity).distinct()
				.collect(Collectors.toList());
	}

	public Stream<String> tradersFromCambridgeSortedByName() {
		return this.transactions.stream().filter(t -> t.getTrader().getCity().equalsIgnoreCase("Cambridge"))
				.map(r -> r.getTrader().getName()).sorted();

	}

	public String allTraderNames() {
		return this.transactions.stream().map(t -> t.getTrader().getName()).sorted().reduce("", String::concat);
	}

	public boolean fromMilan() {
		return this.transactions.stream().anyMatch(t -> t.getTrader().getCity().equals("Milan"));
	}

	public List<Integer> allTransactionValuesOfCambridge() {
		return this.transactions.stream().filter(t -> t.getTrader().getCity().equals("Cambridge"))
				.map(Transaction::getValue).collect(Collectors.toList());
	}

	public Integer highestValuedTransaction() {
		return this.transactions.stream().map(Transaction::getValue).reduce(Integer::max).get();
	}

	public Stream<int[]> pythagoreanTriplesInt(int initValue, int finalValue, int secondVariableValue) {

		return IntStream.rangeClosed(1, 100).boxed()
				.flatMap(a -> IntStream.rangeClosed(a, 100).filter(b -> Math.sqrt(a * a + b * b) % 1 == 0)
						.mapToObj(b -> new int[] { a, b, (int) Math.sqrt(a * a + b * b) }));
	}

	public Stream<double[]> pythagoranTriplesDouble(int initialRange, int finalRange) {
		return IntStream.rangeClosed(initialRange, finalRange).boxed().flatMap(a -> IntStream.rangeClosed(a, finalRange)
				.mapToObj(b -> new double[] { a, b, Math.sqrt(a * a + b * b) }).filter(t -> t[2] % 1 == 0));

	}

	public Stream<double[]> pythagoreousExample(int initialRange, int finalRange) {
		return IntStream.range(initialRange, finalRange).boxed().flatMap(
				a -> IntStream.range(a, finalRange).mapToObj(b -> new double[] { a, b, Math.sqrt(a * a + b * b) }));

	}
}
