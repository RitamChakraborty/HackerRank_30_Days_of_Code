package day_0_hello_world;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String input = scanner.nextLine();
		
		System.out.println("Hello, World.");
		System.out.println(input);
	}
}
