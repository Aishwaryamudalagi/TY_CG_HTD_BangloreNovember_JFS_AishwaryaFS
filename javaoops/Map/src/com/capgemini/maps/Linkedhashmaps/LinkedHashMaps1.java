package com.capgemini.maps.Linkedhashmaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMaps1 
{
	public static void main(String[] args) {
		LinkedHashMap<String,Integer> l1 = new LinkedHashMap<String,Integer>();
		l1.put("BTR",580073);
		l1.put("BTM",560071);
		l1.put("RajajiNagar",570072);
		l1.put("null",580073);
		l1.put("BTR",null);
		
		
		l1.remove("BTM");
		l1.put("BTM",560071);
		Set<Map.Entry<String,Integer>> s1 = l1.entrySet();
		for(Map.Entry<String, Integer> e1 : s1)
		{
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println(("------------------"));
			System.out.println(l1.size());
			System.out.println(l1.isEmpty());
			System.out.println(l1.containsKey("BTM"));
			System.out.println(l1.containsValue(580073));
		}
	}

}
