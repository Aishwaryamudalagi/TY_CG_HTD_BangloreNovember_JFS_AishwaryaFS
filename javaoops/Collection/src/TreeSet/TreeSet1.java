package TreeSet;

import java.util.TreeSet;

public class TreeSet1 
{
	public static void main(String[] args) {
		TreeSet<Integer> t1= new TreeSet<Integer>();
		t1.add(45);
		t1.add(15);
		
		t1.add(30);
		t1.add(15);
		t1.remove(30);
		for(Integer i1 : t1)
		{
			System.out.println(i1);
		}
		
		
	}

}
