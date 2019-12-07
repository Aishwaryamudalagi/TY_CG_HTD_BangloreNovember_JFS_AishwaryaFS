import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterations
{
	public static void main(String[] args) {
		ArrayList<Integer> a1= new ArrayList<Integer>();
		a1.add(13);
		a1.add(26);
		a1.add(39);
		a1.add(52);
		System.out.println(a1);
		System.out.println("------FOr loop------");
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
		System.out.println("------For Each Loop-------");
		for(Integer i1 : a1)
		{
			System.out.println(i1);
		}
		System.out.println("------Iterator method-------");
		Iterator<Integer> itr=a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("-------List iterator in reverse order----------");
		ListIterator<Integer> itr1=a1.listIterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		System.out.println("-------List iterator in ascending order---------");
		while(itr1.hasPrevious())
		{
			System.out.println(itr1.previous());
		}
	}

}
