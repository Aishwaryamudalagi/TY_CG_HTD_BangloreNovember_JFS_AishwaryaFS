
public class Test
{
	public static void main(String[] args) {
		Immutable i1=new Immutable(23, "Aishwarya");
		int age=i1.getAge();
		String name=i1.getName();
		System.out.println(age);
		System.out.println(name);
		
		
	}

}
