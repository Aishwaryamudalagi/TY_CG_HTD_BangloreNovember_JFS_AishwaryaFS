
public class TestA
{
	void divide(int a,int b)
	{
		System.out.println("Divide method is called");
		try
		{
		System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Dont divide by zero");
		}
		System.out.println("The number got divided");
	}

}
