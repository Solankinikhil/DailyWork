package com.cts.training3;



import java.util.HashMap;

import java.util.Map.Entry;

public class MapDemo {
	
	public static void main(String[] args)
	{
		 HashMap<String,Integer> map=new HashMap<>();    
		 
		 map.put("Banana",35); 
		 map.put("Orange",60);
		 map.put("Mango",110); 
		 map.put("Grapes",200);
		 map.put("Water melon",20); 
		 map.put("Banana",70); 
		 
		 for(Entry<String, Integer> entry:map.entrySet())
		 {
			 System.out.println(entry.getKey()+".....>"+entry.getValue());
		 }
			 
			 
		// map.remove("Mango");
		// map.replace("Apple", 35);
		 //System.out.println("Updated list of elements: "+map);  
	}
}
