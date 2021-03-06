package test;

import java.util.HashMap;
import java.util.Iterator;

public class DuplicateString {

	public static void main(String[] args) {
		
		findduplicateString("Abhijeetti");

	}

	private static void findduplicateString(String str) {
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		String[] arr = str.split("");
		
		for(String tempString: arr) {
			if(hm.get(tempString)!=null) {
				hm.put(tempString, hm.get(tempString)+1);
			}
			
			else {
				hm.put(tempString, 1);
			}
		}
		
		Iterator<String> tempString = hm.keySet().iterator();
		
		while(tempString.hasNext()) {
			
			String temp = tempString.next();
			if(hm.get(temp)>1) {
				System.out.println(temp);
			}
		}
		
	}

}
