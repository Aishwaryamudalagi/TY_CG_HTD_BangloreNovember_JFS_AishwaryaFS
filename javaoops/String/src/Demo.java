
public class Demo 
{
	public static void main(String[] args) {
		String s1=new String("John");
		System.out.println(s1.hashCode());
		String s2=new String("Mikel");
		String s3=new String("John");
		s1=new String("divya");
		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s2.hashCode());
		
	}

}
