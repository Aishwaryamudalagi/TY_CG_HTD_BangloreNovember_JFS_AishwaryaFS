package LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetPerson 
{
	public static void main(String[] args) {
		LinkedHashSet<Person> l2 = new LinkedHashSet<Person>();
		l2.add(new Person(25,"Bhoomi"));
		l2.add(new Person(17,"Jhanvi"));
		l2.add(new Person(25,"Bhoomi"));
		
		Iterator<Person> itr= l2.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
