package test;

public class ReverseArray {

	public static void main(String[] args) {
		 
		int[] number  = {1,2,3,4,5};
		
		for(int i=0;i<number.length/2;i++) {
			int temp = number[i];
			number[i] = number[number.length-1-i];
			number[number.length-1-i] = temp;
		}
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]);
		}

	}

}
