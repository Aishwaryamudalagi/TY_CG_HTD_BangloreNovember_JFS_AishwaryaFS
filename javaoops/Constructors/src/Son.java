
public class Son extends Father
{
	//public static void main(String[] args) {
		Son()
		{
			super("xyz",45);
			System.out.println("c");
		}
	    Son(String name,int age)
	    {
	    	this();
	    	System.out.println("d");
	
	}

}
