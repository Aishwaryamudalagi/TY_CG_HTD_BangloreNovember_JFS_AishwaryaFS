package com.capgemini.maps.hashmaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1 
{
	public static void main(String[] args) {
		HashMap<Integer,String> h1 = new HashMap<Integer, String>();
		h1.put(8, "Ramesh");
		h1.put(4, "Ganesh");
		h1.put(2, "Dinesh");
		h1.put(6, "Suresh");
		
		Set<Map.Entry<Integer,String>> s1 = h1.entrySet();
		for(Map.Entry<Integer, String> e1 : s1)
		{
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("--------");
		}
		
		HashMap<Integer,Student> h2 = new HashMap<Integer,Student>();
		h2.put(34,new Student(22,"Divya"));
		h2.put(45,new Student(23,"Ramesh"));
		h2.put(null, null);
		h2.put(null,new Student(45,"Harish"));
		Collection<Student> c1 = h2.values();
		for(Student s : c1)
		{
			System.out.println(s);
		}
		System.out.println(h2.containsKey(34));
		System.out.println(h2.containsValue(new Student(22,"Divya")));
		System.out.println(h2.size());
		System.out.println(h2.isEmpty());
		
	}

}
