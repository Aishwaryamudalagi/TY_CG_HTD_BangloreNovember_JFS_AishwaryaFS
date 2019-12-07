
public class ExceptionB 
{
	void exception(int a,String b)
	{
		try
		{
			System.out.println(500/a);
			try
			{
				System.out.println(b.length());
			}
			catch(NullPointerException n)
			{
				System.out.println("Dont deal with null");
			}
		}
		catch(ArithmeticException a1)
			{
			System.out.println("dont deal with 0");
			}
		
	}

}
