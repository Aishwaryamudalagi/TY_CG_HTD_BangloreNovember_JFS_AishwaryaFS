import java.util.ArrayList;
import java.util.Collection;

public class MethodsofCollection 
{
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(12);
		c1.add(24);
		System.out.println(c1);
		Collection c2=new ArrayList();
		c2.add(36);
		c2.add(48);
		System.out.println(c2);
		c1.addAll(c2);
		System.out.println(c1);
		System.out.println("--------retain all-----");
		Collection c3=new ArrayList();
		c3.add(15);
		c3.add(30);
		c3.add(45);
		c3.add(60);
		
		Collection c4=new ArrayList();
		c4.add(15);
		c4.add(30);
		c4.add(90);
		c4.add(78);
		System.out.println(c3);
		c3.retainAll(c4);
		System.out.println(c3);
		
		System.out.println(c3.containsAll(c4));
		
		
		System.out.println(c3);
		c3.clear();
		System.out.println(c3);
		System.out.println("-----array----");
		
		//converting arraylist to array
		Collection c5=new ArrayList();
		c5.add(5);
		c5.add(10);
		Object a[]=c5.toArray();
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		
		
	}

}
