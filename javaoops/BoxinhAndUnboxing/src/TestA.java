
public class TestA 
{
	public static void main(String[] args) {
		int i1=10;
		Integer i2=new Integer(i1);  //Boxing
		int i3=i2.intValue();  //Unboxing
		
		double d1=34.8754;
		Double d2=new Double(d1);  //Boxing
		double d3=d2.doubleValue();  //Unboxing
		
		System.out.println(i3);
		System.out.println(i2);
		System.out.println(i1);
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
	}

}
