import java.util.ArrayList;
import java.util.Collection;

public class Collection2 
{
	public static void main(String[] args) {
		Collection c2= new ArrayList();
		c2.add("Abc");
		c2.add("Xyz");
		System.out.println(c2);
		
		c2.remove("Abc");
		System.out.println(c2);
		
		System.out.println(c2.size());
		
		System.out.println(c2.isEmpty());
	}

}
