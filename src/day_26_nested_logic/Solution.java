package day_26_nested_logic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int day, month, year;
		
		day = scanner.nextInt();
		month = scanner.nextInt();
		year = scanner.nextInt();
		LocalDate returnDate = LocalDate.of(year, month, day);
		
		day = scanner.nextInt();
		month = scanner.nextInt();
		year = scanner.nextInt();
		LocalDate dueDate = LocalDate.of(year, month, day);
		int fine = 0;
		
		if (returnDate.isAfter(dueDate)) {
			if (returnDate.getMonth().equals(dueDate.getMonth()) && returnDate.getYear() == dueDate.getYear()) {
				fine = 15 * (returnDate.getDayOfMonth() - dueDate.getDayOfMonth());
			} else if (returnDate.getYear() == dueDate.getYear()) {
				fine = 500 * (returnDate.getMonthValue() - dueDate.getMonthValue());
			} else {
				fine = 10000;
			}
		}
		
		System.out.println(fine);
	}
}
