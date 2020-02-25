package com.array;

import java.util.Arrays;

/**
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 *
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 *
 * Given A = [1, 2, 3], the function should return 4.
 *
 * Given A = [−1, −3], the function should return 1.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 */
public class SmallestPositive {
	
	public static int solution(int[] list) {
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
		
		return smallest_Positive;
	}
}
