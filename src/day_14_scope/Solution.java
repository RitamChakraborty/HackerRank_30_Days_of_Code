// https://www.hackerrank.com/challenges/30-scope/problem

package day_14_scope;

import java.util.Scanner;

class Difference {
	private int[] elements;
	public int maximumDifference;
	
	public Difference(int[] elements) {
		this.elements = elements;
	}
	
	public void computeDifference() {
		maximumDifference = 0;
		
		for (int i = 0; i < elements.length; ++i) {
			for (int j = (i + 1); j < elements.length; ++j) {
				maximumDifference = Integer.max(maximumDifference, Math.abs(elements[i]- elements[j]));
			}
		}
	}
}

public class Solution {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		
		Difference difference = new Difference(a);
		
		difference.computeDifference();
		
		System.out.print(difference.maximumDifference);
	}
}
