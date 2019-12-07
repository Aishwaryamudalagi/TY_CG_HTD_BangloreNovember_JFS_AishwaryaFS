package HashSet;

import java.util.HashSet;

public class HashSet1 
{
	public static void main(String[] args) {
		HashSet h1=new HashSet();
		h1.add(23);
		h1.add(86);
		h1.add(12);
		h1.add(44);
		h1.add(null);
		for(Object object : h1)
		{
			System.out.println(object);
		}
		HashSet<String> hs=new HashSet();
		hs.add("Abc");
		hs.add("Xyz");
		hs.add("Pqr");
		hs.add(null);
		for(String str : hs)
		{
			System.out.println(str);
		}
	}

}
