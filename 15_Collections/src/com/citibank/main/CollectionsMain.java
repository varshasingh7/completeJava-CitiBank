package com.citibank.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsMain {
	public static void main(String[] args) {
		System.out.println("1. ArrayList");
		List<Integer> numberList = new ArrayList<>();
		numberList.add(23);
		numberList.add(45);
		numberList.add(32);
		numberList.add(23);
		numberList.add(48);
		numberList.add(65);
		numberList.add(52);
		
		System.out.println(numberList);
		
		numberList.remove(1);
		System.out.println(numberList);
		System.out.println(numberList.size());
		System.out.println(numberList.contains(23));
		System.out.println(numberList.indexOf(23));
		
		for (Integer integer : numberList) {
			System.out.println(integer);
//			if(integer == 23) {
//				numberList.remove(Integer.valueOf(23));
//				
			}
		numberList.remove(Integer.valueOf(23));
		System.out.println(numberList);
		
		System.out.println("2.HashSet");
		Set<String> nameSet = new HashSet<>();
		nameSet.add("Varsha");
		nameSet.add("Payal");
		nameSet.add("Prachi");
		nameSet.add("Rohit");
		nameSet.add("Rupesh");
		nameSet.add("Abhinav");
		nameSet.add("Varsha");
		nameSet.add("Payal");
		
		System.out.println(nameSet);
		
		System.out.println("3. TreeSet");
//		Set<String> sortedNameSet = new TreeSet<String>();
		TreeSet<String> sortedNameSet = new TreeSet<String>();
		sortedNameSet.add("Varsha");
		sortedNameSet.add("Payal");
		sortedNameSet.add("Prachi");
		sortedNameSet.add("Rohit");
		sortedNameSet.add("Rupesh");
		sortedNameSet.add("Abhinav");
		sortedNameSet.add("Varsha");
		sortedNameSet.add("Payal");
		System.out.println(sortedNameSet);
		
		
		System.out.println("4.HashMap");
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(101, "Varsha");
		hashMap.put(102, "Payal");
		hashMap.put(103, "Prachi");
		hashMap.put(104, "Rohit");
		hashMap.put(105, "Rupesh");
		hashMap.put(106, "Abhinav");
		hashMap.put(107, "Varsha");
		hashMap.put(101, "Prachi");
		
		System.out.println(hashMap);
		Set<Integer> keys = hashMap.keySet();
		System.out.println(keys);
		
		System.out.println(hashMap.values());
		System.out.println(hashMap.get(103));
		}
		
	

}
