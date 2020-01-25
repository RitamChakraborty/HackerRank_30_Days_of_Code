// https://www.hackerrank.com/challenges/30-arrays/problem

package day_7_arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = scanner.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < n; ++i) {
			list.add(scanner.nextInt());
		}
		
		StringJoiner stringJoiner = new StringJoiner(" ");
		list.stream()
				.map(String::valueOf)
				.collect(Collectors.toCollection(ArrayDeque::new))
				.descendingIterator()
				.forEachRemaining(stringJoiner::add);
		System.out.println(stringJoiner.toString());
	}
}
