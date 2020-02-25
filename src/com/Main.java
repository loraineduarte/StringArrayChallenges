package com;

import com.array.SmallestPositive;


public class Main {
	
	public static void main(String[] args) {
		int[] firstTest = { 1, 3, 6, 4, 1, 2 };
		int[] secondTest = { 1, 2, 3 };
		int[] thirdTest = { -1, -3 };
		int[] fourthTest = {-1};
		int[] fifthTest = { 1};
		
		int firstResult = SmallestPositive.solution((firstTest));
		System.out.println("First Result: " + firstResult);
		
		int secondResult = SmallestPositive.solution((secondTest));
		System.out.println("Second Result: " + secondResult);
		
		int thirdResult = SmallestPositive.solution((thirdTest));
		System.out.println("Third Result: " + thirdResult);
		
		int fourthResult = SmallestPositive.solution(fourthTest);
		System.out.println("Fourth Result: " + fourthResult);
		
		int fifthResult = SmallestPositive.solution((fifthTest));
		System.out.println("fifth Result: " + fifthResult);
	}
	

}
