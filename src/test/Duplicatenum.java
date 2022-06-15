package test;

public class Duplicatenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {8,5,8,3,2,8,5,2};
		
		for(int i=0;i<arr.length;i++) {
			for(int j= i+1;j<arr.length;j++) {
				
				if(arr[i] == arr[j]) {
					
					System.out.println("Duplicate Num: " + arr[j]);
				}
			}
		}

	}

}
