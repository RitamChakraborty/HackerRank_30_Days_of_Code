// https://www.hackerrank.com/challenges/30-binary-numbers/problem

package day_10_binary_numbers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = scanner.nextInt();
		String binary = Integer.toBinaryString(n);
		char[] chars = binary.toCharArray();
		
		int max = Integer.MIN_VALUE;
		int count = 0;
		for (char ch: chars) {
			if (ch == '1') {
				++count;
			} else {
				max = Integer.max(max, count);
				count = 0;
			}
		}
		
		max = Integer.max(max, count);
		System.out.println(max);
	}
}
