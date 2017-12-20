package com.learning.api;

import java.util.stream.Stream;

public class InfiniteStreamAPI {

	public Stream<Integer> streamUpto(Integer limit) {
		return Stream.iterate(0, a -> a + 1).limit(limit);
	}

	public Stream<Integer[]> fabonacciSeriesUpto(Integer limit) {
		return Stream.iterate(new Integer[] { 0, 1 }, t -> new Integer[] { t[1], t[0] + t[1] }).limit(limit);
	}
}
