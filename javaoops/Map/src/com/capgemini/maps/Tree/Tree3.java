package com.capgemini.maps.Tree;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Tree3 
{
	public static void main(String[] args) {
		ArrayList<Employee> l1 = new ArrayList<Employee>();
		l1.add(new Employee(25,"Oswald"));
		l1.add(new Employee(22,"Noddy"));
		l1.add(new Employee(28,"Mickey"));
		
		TreeMap<String,ArrayList<Employee>> t1= new TreeMap<String,ArrayList<Employee>>();
		t1.put("ABC",l1);
		t1.put("PQR",l1);
		t1.put("XYZ",l1);
		System.out.println(t1.get("ABC"));
		
		Set<Map.Entry<String,ArrayList<Employee>>> s1= t1.entrySet();
		for(Map.Entry<String, ArrayList<Employee>> entry :s1)
		{
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println("---------------------");
		}
	}

}
