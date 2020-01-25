// https://www.hackerrank.com/challenges/30-conditional-statements/problem

package day_3_intro_to_conditional_statements;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = scanner.nextInt();
		
		if (n % 2 == 0) {
			if (n >= 6 && n <= 20) {
				System.out.println("Weird");
			} else {
				System.out.println("Not Weird");
			}
		} else {
			System.out.println("Weird");
		}
	}
}
