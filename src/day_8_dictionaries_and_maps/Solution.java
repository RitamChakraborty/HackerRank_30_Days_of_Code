// https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem

package day_8_dictionaries_and_maps;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int q = Integer.parseInt(scanner.nextLine());
		Map<String, String> map = new HashMap<>();
		
		for (int i = 0; i < q; ++i) {
			String key = scanner.next();
			String value = scanner.next();
			map.put(key, value);
		}
		
		while (scanner.hasNext()) {
			String key = scanner.next();
			System.out.println(
					map.containsKey(key)
							? key + "=" + map.get(key)
							: "Not found"
			);
		}
	}
}

