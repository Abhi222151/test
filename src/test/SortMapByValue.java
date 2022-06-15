package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValue {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("Ram", 10);
		map.put("shyam", 05);
		map.put("Shiv", 20);
		map.put("kishan", 15);
		map.put("sai", 50);
		map.put("Aman", 50);

		/*
		 * Iterator<String> itr = map.keySet().iterator(); while (itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 */
		
		Map<String,Integer> resultSorted = map.entrySet().stream().
				sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
						(oldValue, newValue) -> oldValue, LinkedHashMap::new));
		
		System.out.println(resultSorted);

	}
	

}
