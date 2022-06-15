package test;

import java.util.LinkedHashSet;

public class RemoveDuplicateElementFromArray {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		// Java Program to Remove Duplicate Elements
		// From the Array using Set

		int[] arr = { 2, 3, 4, 5, 3, 2, 3, 5, 8, 3 };
		removeDuplicate(arr);

	}

	private static void removeDuplicate(int[] arr) {

		//LinkedHashSet<Integer> set = new LinkedHashSet<>();
		
		LinkedHashSet<Integer> set = new LinkedHashSet<>();

		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}

		System.out.println(set);

	}

}

/*
 * class GFG { static void removeDups(int[] a, int n) {
 * 
 * // Hash map which will store the // elements which has appeared previously.
 * HashMap<Integer, Boolean> mp = new HashMap<>();
 * 
 * for (int i = 0; i < n; ++i) {
 * 
 * // Print the element if it is not // present there in the hash map // and
 * Insert the element in the hash map if (mp.get(a[i]) == null) {
 * System.out.print(a[i] + " "); mp.put(a[i], true); } } }
 */

// Driver Code
/*
 * public static void main(String[] args) { int[] arr = { 1, 2, 5, 1, 7, 2, 4, 2
 * };
 * 
 * int n = arr.length; removeDups(arr, n); } }
 */
