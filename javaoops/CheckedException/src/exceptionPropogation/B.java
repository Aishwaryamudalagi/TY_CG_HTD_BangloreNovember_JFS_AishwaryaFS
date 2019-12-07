package exceptionPropogation;

public class B 
{
	static void m() throws ClassNotFoundException
	{
		try
		{
			C.n();
		}
		catch(ClassNotFoundException p)
		{
			System.out.println("Exception is handled by class B");
		}
	}

}
