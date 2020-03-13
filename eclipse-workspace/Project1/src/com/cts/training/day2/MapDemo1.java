package com.cts.training.day2;

import java.security.KeyStore.Entry;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(23456, "rahul$$");
		map.put(3456, "kartik@$");
		map.put(2345, "bumrah@2");
		System.out.println(map);
		Set set=map.entrySet();
		Iterator iterator=set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		/*for (java.util.Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("key=" + entry.getKey() + ",Value=" + entry.getValue());
		}*/
	}

}
