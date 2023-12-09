package hackerrank_algorithm_counting_sort;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Result {
	public static List<Integer> countingSort(List<Integer> arr) {
		List<Integer> result = new ArrayList<Integer>();
		int value = 0;
		int counter = 0;

		for (int i = 0; i < 100; i++) {
			result.add(0);
		}

		if (arr.size() >= 100 && arr.size() <= Math.pow(10, 6)) {
			for (int j = 0; j < arr.size(); j++) {
				if (arr.get(j) >= 0 && arr.get(j) <= 100) {
					value = arr.get(j);
					System.out.println(value);
					counter = result.get(value) + 1;
					System.out.println(counter);
					result.set(value, counter);
				}

			}

		}

		return result;

	}

}
