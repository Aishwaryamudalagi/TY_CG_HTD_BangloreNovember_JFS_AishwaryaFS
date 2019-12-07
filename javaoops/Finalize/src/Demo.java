
public class Demo 
{
	public static void main(String[] args) {
		String s1="ABC";
		System.out.println("s1.hashcode value"+s1.hashCode());
		String s2="XYZ";
		s1="PQR";
		System.out.println(s1);
		String s3="ABC";
		System.out.println("s1 hashcode value"+s1.hashCode());
		System.out.println("s3 hashcode value"+s3.hashCode());
	}

}

