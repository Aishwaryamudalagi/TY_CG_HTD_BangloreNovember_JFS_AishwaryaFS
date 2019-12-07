
public class Test 
{
	public static void main(String[] args) {
		Object obj1=new Object();
		Object obj2=new Object();
		boolean b1=obj1.equals(obj2);
		System.out.println("b1="+b1);
		boolean b2=obj2.equals(obj2);
		System.out.println("b2="+b2);
	}

}
