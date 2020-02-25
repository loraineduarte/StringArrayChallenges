package com;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		int[] firstTest = { 1, 3, 6, 4, 1, 2 };
		int[] secondTest = { 1, 3, 6, 4, 1, 2 };
		
		int firstResult = solution(firstTest);
		System.out.println("First Result: " + firstResult);
		
		int secondResult = solution(secondTest);
		System.out.println("Second Result: " + secondResult);
	}
	
	private static int solution(int[] firstTest) {
		
		int smallest_Positive = 0;
		
		List<Integer> list = new ArrayList<>();
		for (int j = 0; j < firstTest.length && list.add(firstTest[j]); j++);
		
		
		for (int i = 0; i <= list.size(); i++) {
			System.out.println("I: " + i);
			if (list.contains(i)) {
				System.out.println("Exists on Array");
			} else {
				System.out.println("Smallest: " + i);
				smallest_Positive = i;
			}
		}
		return smallest_Positive;
	}
}
