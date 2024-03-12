package com.collectionpractice;

import java.util.HashMap;
import java.util.Map;

public class ArraylistTest {

	public static void main(String[] args) {
		 
		
		Map<String,Integer> map=new HashMap<>();
		
		map.put("One", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		map.put("five", 5);
		
		for(String key: map.keySet()) {
			Integer value=map.get(key);
			System.out.println(key +"===>" +value );
			
		}
		
		for (Map.Entry<String,Integer> mp: map.entrySet()) {
			String key=mp.getKey();
			Integer value=mp.getValue();
			System.out.println(key +"===>" +value );
		}

	}

}
