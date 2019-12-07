import java.util.ArrayList;
import java.util.Collection;

public class Collection1 
{
	public static void main(String[] args) 
	{
		Collection c1= new ArrayList();
		//Adding an element to the collection
		c1.add(12);
		c1.add(24);
		System.out.println(c1);
		
		Collection c2= new ArrayList();
		//Adding an element to the collection
		c2.add(36);
		c2.add(48);
		System.out.println(c2);
				
		//Removing an element from the collection
		c1.remove(12);
		System.out.println(c1);
		
		//finding the size of the collection
		System.out.println(c1.size());
		
		//Checking if the collection is empty
		System.out.println(c1.isEmpty());
		c1.add(12);
		
		//checking if the object 12 is prsent inside the collection
		System.out.println(c1.contains(12));
		
		
		
	}

}
