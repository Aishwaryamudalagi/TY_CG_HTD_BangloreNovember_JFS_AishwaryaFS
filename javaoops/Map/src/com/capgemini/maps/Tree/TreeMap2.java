package com.capgemini.maps.Tree;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap2 
{
	public static void main(String[] args) {
		SortingAge a1 =new SortingAge();
		SortingName a2 = new SortingName();
		
		TreeMap<Student,String> t1 = new TreeMap<Student,String>(a2);
		t1.put(new Student("ABC",22),"7th");
		t1.put(new Student("PQR",13),"10th");
		t1.put(new Student("XYZ",05),"L.K.G");
		Set<Map.Entry<Student,String>> s1= t1.entrySet();
		for(Map.Entry<Student, String> e1 : s1)
		{
			System.out.println(e1.getValue());
			System.out.println(e1.getKey());
			System.out.println("-------------");
		}
	}

}
