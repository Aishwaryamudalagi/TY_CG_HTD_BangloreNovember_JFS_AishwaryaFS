
public class dsiplay2 
{
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("Divya");
		System.out.println(s1.hashCode());
		s1=s1.append("Bogar");
		System.out.println(s1.hashCode());
	}

}
