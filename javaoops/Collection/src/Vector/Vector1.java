package Vector;

import java.util.Vector;

public class Vector1 
{
	public static void main(String[] args) {
		Vector v1= new Vector();
		v1.add(87);
		v1.add(36);
		v1.add(54);
		v1.add(21);
		System.out.println(v1);
		v1.remove(new Integer (54));
		System.out.println(v1);
		v1.set(1, 100);
		System.out.println(v1);
		
		
		System.out.println("-----SETSIZE AND TRIMSIZE----");
		Vector v2= new Vector();
		v2.add(23);
		v2.add(56);
		v2.add(78);
		v2.add(100);
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		v2.trimToSize();
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		v2.setSize(10);
		System.out.println(v2.size());
		System.out.println(v2);
		v2.add(200);
		System.out.println(v2);
		System.out.println(v2.size());
		System.out.println(v2);
		v2.set(5, 600);
		System.out.println(v2);
		System.out.println("------COPY INTO------");
		
		Vector v4=new Vector();
		v4.addElement(24);
		v4.addElement(56);
		v4.addElement(78);
		v4.addElement(67);
		System.out.println(v4);
		v4.removeElement(new Integer(24));
		System.out.println(v4);
		v4.remove(2);
		System.out.println(v4);
		Object i1[]=new Object[v4.size()];
		v4.copyInto(i1);
		for(int i=0;i<i1.length;i++)
		{
			System.out.println(i1[i]);
		}
		
		System.out.println("----Ensure capacity-----");
		Vector v5= new Vector();
		v5.add(34);
		v5.add(56);
		System.out.println(v5.size());
		System.out.println(v5.capacity());
		v5.trimToSize();
		System.out.println(v5.size());
		System.out.println(v5.capacity());
		v5.ensureCapacity(6);
		v5.setSize(8);
		System.out.println(v5.size());
		System.out.println(v5.capacity());
		System.out.println(v5);
		
	}

}
