package practice;

import java.util.Collections;

/**
 * 
 * @author 002BJD744
 *
 */

/* test */
public class MissingMultipleNoINArray {

	public static void main(String[] args) {

		int arr[] = {1,2,3,3,4,6,6,7};

		int[] register = new int[arr.length];

		for (int i : arr) {
			register[i] = 1;
		}

		System.out.println("Missing element");

		for (int i = 1; i < arr.length; i++) {
			if (register[i] == 0) {
				System.out.println(i);
			}
		}

		
	}

}
