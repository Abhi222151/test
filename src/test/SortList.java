package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,4,3,10,8,6,2,10,8);
		
		System.out.println(list);
		
		List<Integer> sortedList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedList);
		
		//Finding Duplicate
		List<Integer> sortedList1 = list.stream().filter(e ->e%2!=0).sorted().distinct().collect(Collectors.toList());
		System.out.println(sortedList1);
		
		List<Integer> sortedList2 = list.stream().distinct().collect(Collectors.toList());
		System.out.println(sortedList2);

	}

}
