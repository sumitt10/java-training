package com.example.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Examples6 {
	public static void main(String[] args) {

		List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange"));
		System.out.println("List: " + fruits);

		Set<Integer> numbers = new HashSet<>(Arrays.asList(1, 2, 3, 2, 4));
		System.out.println("Set: " + numbers);

		Map<String, Integer> ages = new HashMap<>();
		ages.put("John", 25);
		ages.put("Alice", 30);
		ages.put("Bob", 22);
		System.out.println("Map: " + ages);
	}
}
