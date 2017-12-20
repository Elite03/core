package com.learning.api.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.learning.api.FindingAPI;

public class FilteringAPIClient {
	private final Logger LOG;

	public FilteringAPIClient() {
		this.LOG = LoggerFactory.getLogger(FilteringAPIClient.class);
	}

	public void operate() {
		this.forVegans();
	}

	public void forVegans() {
		if (!FindingAPI.isVegitarian())
			LOG.info("Contains some dishes for vegitarians");
	}

	public static void main(String[] args) {
		FilteringAPIClient apiClient = new FilteringAPIClient();
		apiClient.operate();
	}
}
