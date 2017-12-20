package com.learning.api.client;

import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.learning.api.InfiniteStreamAPI;

public class InfiniteStreamAPIClient {
	private Logger LOG = LoggerFactory.getLogger(InfiniteStreamAPIClient.class);

	private InfiniteStreamAPI api;

	public InfiniteStreamAPIClient() {
		this.api = new InfiniteStreamAPI();
	}

	public void consumer() {
		for (Integer i : api.streamUpto(100).collect(Collectors.toList())) {
			LOG.info("{}", i);
		}
	}

	public void findFabonacciUpto1000() {
		api.fabonacciSeriesUpto(10).forEach(e -> LOG.info("{}", e));
	}

	public static void main(String[] args) {
		InfiniteStreamAPIClient apiClient = new InfiniteStreamAPIClient();
		apiClient.findFabonacciUpto1000();
	}
}
