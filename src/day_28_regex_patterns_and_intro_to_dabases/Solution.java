// https://www.hackerrank.com/challenges/30-regex-patterns/problem

package day_28_regex_patterns_and_intro_to_dabases;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Pattern;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = scanner.nextInt();
		List<String> list = new ArrayList<>();
		Pattern pattern = Pattern.compile("[.a-z]+@gmail.com");
		
		while (t-- > 0) {
			String name = scanner.next();
			String email = scanner.next();
			
			if (pattern.matcher(email).matches()) {
				list.add(name);
			}
		}
		
		list.stream().sorted().forEach(System.out::println);
	}
}
