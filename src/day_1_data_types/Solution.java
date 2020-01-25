package day_1_data_types;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";
		
		Scanner scan = new Scanner(System.in);
		
		/* Declare second integer, double, and String variables. */
		int anotherInt = Integer.parseInt(scan.nextLine());
		double anotherDouble = Double.parseDouble(scan.nextLine());
		String anotherString = scan.nextLine();
		
		System.out.println(i + anotherInt);
		System.out.println(d + anotherDouble);
		System.out.println(s + " " + anotherString);
		
		scan.close();
	}
}