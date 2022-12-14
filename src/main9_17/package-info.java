package main9_17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(
				Arrays.asList(new String[] {"A","B","C"}));

		list.removeIf(
				(String s ) ->{
					return s.equals("B");
				}
				);

		System.out.println(list);


	}
}