package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(10,5,7,6,9);
	    Collections.sort(list);
	    System.out.println(list);
	    
	    int arr[] = { 1, 2, 3, 4, 6};
	    int n= arr.length + 1;
	    
	    int total_sum = n*(n+1)/2;
	    
	    System.out.println(total_sum);
	    
	    int sum =0;
	    
	    for(int i=0;i<arr.length;i++) {
	    	sum = sum +arr[i];
	    }
	    
	    System.out.println("Missing no: " + (total_sum - sum));
		

	}

}
