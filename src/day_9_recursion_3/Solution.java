// https://www.hackerrank.com/challenges/30-recursion/problem

package day_9_recursion_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
	public static int factorial(int n) {
		return n == 0 ? 1 : n * factorial(n - 1);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = scanner.nextInt();
		System.out.println(factorial(n));
	}
}
