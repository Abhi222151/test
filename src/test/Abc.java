package test;

import java.util.HashMap;
import java.util.Map;

public class Abc {

	public static void main(String[] args) {
		
		System.out.println("Welcome to IBM!!!");
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1,"Abc");
		map.put(1,"xyz");
		//map.put(2,"ppp");
		
		System.out.println(map);
	}

}
