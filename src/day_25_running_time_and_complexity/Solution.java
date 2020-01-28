// https://www.hackerrank.com/challenges/30-running-time-and-complexity/problem

package day_25_running_time_and_complexity;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
	private static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		} else if (n == 2) {
			return true;
		}
		
		for (int i = 2; i <= (int) Math.sqrt(n); ++i) {
			if (n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = scanner.nextInt();
		
		while (t-- > 0) {
			int n = scanner.nextInt();
			System.out.println(isPrime(n) ? "Prime" : "Not Prime");
		}
	}
}
