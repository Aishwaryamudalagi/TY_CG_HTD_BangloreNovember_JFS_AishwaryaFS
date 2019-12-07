import java.util.ArrayList;

public class Operationsonstrings 
{
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("asd");
		a1.add("fgh");
		a1.add("jkl");
		a1.add("zxc");
		a1.add("asd");
		a1.add("vbn");
		System.out.println(a1);
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("qwe");
		a2.add("rty");
		a2.add("uio");
		a2.add("plk");
		a2.add("vbn");
		a2.add("rty");
		System.out.println(a2);
		System.out.println(a2.size());
		System.out.println(a1.isEmpty());
		System.out.println(a1.contains(a2));
		System.out.println(a1.remove(3));
		System.out.println(a1);
		a2.addAll(2, a1);
		System.out.println(a2);
		a2.removeAll(a1);
		System.out.println(a2);
		a1.retainAll(a2);
		System.out.println(a1);
		
		
	}

}
