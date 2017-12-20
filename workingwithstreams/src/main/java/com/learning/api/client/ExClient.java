package com.learning.api.client;

import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.learning.api.ExerciseExAPI;
import com.util.shared.model.Transaction;

public class ExClient {

	private ExerciseExAPI api;
	private final Logger LOG = LoggerFactory.getLogger(ExClient.class);

	public ExClient() {
		api = new ExerciseExAPI();
	}

	public void operateSequence() {
		// this.operateOfYear2011AndSortedByValue();
		// this.uniqueCityOfTraders();
		// this.sortedCambridgeEmployees();
		// this.displayTradersString();
		// isFromMilan();
		// this.highestValue();
		readStreamPythagores();
	}

	public void highestValue() {
		LOG.info("{}", api.highestValuedTransaction());
	}

	public void isFromMilan() {
		LOG.info("Is there any trader from Milan: {}", api.fromMilan());
	}

	public void displayTradersString() {
		LOG.info("Traders:  {}", api.allTraderNames());
	}

	public void sortedCambridgeEmployees() {
		for (String name : api.tradersFromCambridgeSortedByName().collect(Collectors.toList())) {
			LOG.info("NAME: {}", name);
		}
	}

	public void uniqueCityOfTraders() {
		for (String city : api.uniqueCityOfTraders()) {
			LOG.info("City: {}", city);
		}
	}

	public void operateOfYear2011AndSortedByValue() {
		for (Transaction t : api.ofYear2011AndSortedByValue()) {
			LOG.info("{}", t.toString());
		}
	}

	public void readStreamPythagores() {
		api.pythagoranTriplesDouble(1, 200).forEach(e -> LOG.info("{}", e));
	}

	public static void main(String[] args) {
		ExClient client = new ExClient();
		client.operateSequence();
	}
}
