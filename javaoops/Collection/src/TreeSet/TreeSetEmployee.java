package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEmployee 
{
	public static void main(String[] args) {
		TreeSet<Employee> t1 = new TreeSet();
		t1.add(new Employee(23,"ASD"));
		t1.add(new Employee(21,"ert"));
		t1.add(new Employee(23,"ASD"));
		
		Iterator<Employee> itr = t1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
