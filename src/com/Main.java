package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main {
	
	public static void main(String[] args) {
		int[] firstTest = { 1, 3, 6, 4, 1, 2 };
		int[] secondTest = { 1, 2, 3 };
		int[] thirdTest = { -1, -3 };
		int[] fourthTest = {-1};
		int[] fifthTest = { 1};
		
		int firstResult = solution(firstTest);
		System.out.println("First Result: " + firstResult);
		
		int secondResult = solution(secondTest);
		System.out.println("Second Result: " + secondResult);
		
		int thirdResult = solution(thirdTest);
		System.out.println("Third Result: " + thirdResult);
		
		int fourthResult = solution(fourthTest);
		System.out.println("Fourth Result: " + fourthResult);
		
		int fifthResult = solution(fifthTest);
		System.out.println("fifth Result: " + fifthResult);
	}
	
	private static int solution(int[] list) {
		int smallest_Positive = 0;
		Arrays.sort(list);
		
		for (int i = 0; i < list.length; i++) {
			if (list.length == 1) {
				smallest_Positive = 1;
				break;
			} else if (Arrays.binarySearch(list, i) < 0){
				if(smallest_Positive == 0){
					smallest_Positive = i;
				} else if( i <= smallest_Positive){
					smallest_Positive = i;
				}
			}
		}
		
		if (smallest_Positive == 0){
			smallest_Positive = list.length+1;
		}
		//System.out.println("Smallest: " + smallest_Positive);
		return smallest_Positive;
	}
}
