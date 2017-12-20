package com.util.shared.model;

import java.io.Serializable;

public class Apple implements Serializable {
	private static final long serialVersionUID = 1L;

	private int weight;
	private String colour;

	public Apple() {
	}

	public Apple(int weight) {
		this.weight = weight;
	}

	public Apple(String colour) {
		this.colour = colour;
	}

	public Apple(int weight, String colour) {
		this.weight = weight;
		this.colour = colour;
	}

	public int getWeight() {
		return weight;
	}

	public String getColour() {
		return colour;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Apple [weight=" + weight + ", colour=" + colour + "]";
	}

}
