package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingInteger {

	public static void main(String[] args) {

		/*
		 * List<Integer> list = Arrays.asList(3,6,7,4,8,10,9); Collections.sort(list);
		 * 
		 * System.out.println(list);
		 */

		int arr[] = { 5, 2, 3, 4, 6 };
		int n = arr.length + 1;

		int total_sum = n * (n + 1) / 2;

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		System.out.println("Missing no: " + (total_sum - sum));

	}

}
