package com.util.shared.model.repo;

import java.util.Arrays;
import java.util.List;

import com.util.shared.model.Apple;

public class AppleRepository {

	public static List<Apple> list() {
		return Arrays.asList(new Apple(80, "green"), new Apple(155, "green"), new Apple(120, "red"));
	}
}
