// https://www.hackerrank.com/challenges/30-review-loop/problem

package day_6_lets_review;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = scanner.nextInt();
		
		while (t-- > 0) {
			char[] chars = scanner.next().toCharArray();
			StringBuilder even = new StringBuilder();
			StringBuilder odd = new StringBuilder();
			
			for (int i = 0; i < chars.length; ++i) {
				if (i % 2 == 0) {
					even.append(chars[i]);
				} else {
					odd.append(chars[i]);
				}
			}
			
			System.out.println(even.append(" ").append(odd).toString());
		}
	}
}
