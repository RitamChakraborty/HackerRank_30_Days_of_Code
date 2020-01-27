package day_29_bitwise_and;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = scanner.nextInt();
		
		while (t-- > 0) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			int max = 0;
			
			for (int i = 1; i < n; ++i) {
				for (int j = (i + 1); j <= n; ++j) {
					if ((j & i) < k) {
						max = Integer.max(max, (j & i));
					}
				}
			}
			
			System.out.println(max);
		}
	}
}
