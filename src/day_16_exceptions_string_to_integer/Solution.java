// https://www.hackerrank.com/challenges/30-exceptions-string-to-integer/problem

package day_16_exceptions_string_to_integer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
		try {
			int a = Integer.parseInt(scanner.nextLine());
			System.out.println(a);
		} catch (Exception e) {
			System.out.println("Bad String");
		}
	}
}
