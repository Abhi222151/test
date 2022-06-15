package test;

public class MissingMultipleNum {

	public static void main(String[] args) {

		//int[] arr = { 1, 1, 2, 3, 5, 5, 7, 9, 9, 9 };
		int arr[] = {1,2,3,3,4,5,5,7};

		int[] register = new int[arr.length];

		for (int i : arr) {
			register[i] = 1;
		}
		System.out.println("Missing no. in an array");

		for (int i = 1; i < arr.length; i++) {
			if (register[i] == 0) {
				System.out.println(i);
			}
		}

	}

}
