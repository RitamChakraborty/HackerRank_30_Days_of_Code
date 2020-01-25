package day_2_operators;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		double mealCost = scanner.nextDouble();
		double tipPercent = scanner.nextDouble();
		double taxPercent = scanner.nextDouble();
		
		System.out.println(Math.round(mealCost + (mealCost * tipPercent / 100) + (mealCost * taxPercent / 100)));
	}
}
