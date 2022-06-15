package test;

import java.util.Arrays;

public class MissingNumInArray {
	
	public static int getMissingNum(int arr[]) {
		
		int n= arr.length;
		int m = n+1;  //Actual array length is total sum plus missing no.
				
	
		int total = m*(m+1)/2;
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum = sum+arr[i];
		}
		
	//	Arrays.stream(arr).sum()
		
		return total-sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {2,3,1,4,6,8,7};
		System.out.println("Missing no.:" + getMissingNum(arr));
	}

}
